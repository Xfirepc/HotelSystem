<%@page import="Model.Reservacion"%>
<%@page import="Model.Habitacion"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="Model.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="layout/head.jsp" %>
<%@include file="layout/header.jsp" %>


        <div id="page-wrapper">
            
            <div class="container-fluid">
                <div class="row bg-title">
                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                        <h4 class="page-title">Reservaciones</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <a href="https://wrappixel.com/templates/ampleadmin/" target="_blank"
                            class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light" data-toggle="modal" data-target="#newRes">Nueva Reservacion</a>
                            <div class="modal fade" id="newRes" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                  <div class="modal-content">
                                    <div class="modal-header">
                                      <h5 class="modal-title" id="exampleModalLabel">Reservacion</h5>
                                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                      </button>
                                    </div>
                                    <form class="form-horizontal form-material" action="NewClient" method="POST">
                                    <div class="modal-body">
                                        <div class="form-group row">
                                            <label class="col-md-4">Cedula</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="cedula"> 
                                            </div>
                                        </div>
                                        
                                    </div>
                                    <div class="modal-footer">
                                      <a class="btn btn-secondary" data-dismiss="modal">Cerrar</a>
                                      <button type="submit" class="btn btn-primary">Crear</button>
                                    </div>
                                    </form>
                                  </div>
                                </div>
                              </div>
                    </div>
                </div>
                <div class="white-box">
                     <h3 class="box-title">Lista de Reservaciones</h3>
                     <div class="row">
                    <%
                        Reservacion res = new Reservacion();
                        ResultSet reservaciones = res.get();
                        while(reservaciones.next()){
                    %>
                        <div class="col-sm-4">
                            <div class="card border-dark mb-3">
                                <div class="card-header">Reservacion #<%=reservaciones.getInt("no_reservacion")%></div>
                                <div class="card-body">
                                    <h4 class="card-title"><b>Cliente:</b> <%=res.getDataUser(reservaciones.getInt("cliente"))%></h4>
                                  <p class="card-text">
                                      <b>Fecha Inicial: </b><%=reservaciones.getString("fecha_inicial")%><br>
                                      <b>Fecha Final: </b><%=reservaciones.getString("fecha_final")%><br>
                                      <b>Dias: </b><%=reservaciones.getInt("dias")%><br>
                                      <b>Presupuesto: </b>
                                      $<%=reservaciones.getDouble("abonado")%> de 
                                      <span class="text-success">$<%=reservaciones.getDouble("costo_total")%> </span>
                                      + extras: <%=reservaciones.getDouble("extras")%><br>
                                      <b>Habitacion: </b><%=reservaciones.getString("habitacion")%><br>
                                  </p>
                                </div>
                            </div>
                        </div>
                    <%
                        }
                    %>
                     </div>
                    </div>
                </div>
            </div>
        </div>
        
     
 <%@include file="layout/footer.jsp" %>