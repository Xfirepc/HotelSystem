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
                     <div class="col-xs-6 col-sm-6">
                        <h4 class="page-title">Reservaciones</h4>
                    </div>
                     <div class="col-xs-6 col-sm-6">
                        <a href="https://wrappixel.com/templates/ampleadmin/" target="_blank"
                            class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light" data-toggle="modal" data-target="#newRes">Nueva Reservacion</a>
                            <div class="modal fade" id="newRes" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                  <div class="modal-content">
                                    <div class="modal-header">
                                      <h5 class="modal-title" id="exampleModalLabel">Reservación</h5>
                                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                      </button>
                                    </div>
                                    <form class="form-horizontal form-material" action="NewReservation" method="POST">
                                    <div class="modal-body">
                                        <div class="form-group row">
                                            <label class="col-md-4">Habitacion: </label>
                                            <div class="col-md-8">
                                                <select class="form-control form-control-line select-hotel" name="habitacion" required onChange="handlePrice()">
                                                    <option disabled selected>
                                                        Selecciona una opción...
                                                    </option>
                                                    <%
                                                        Habitacion hab = new Habitacion();
                                                        ResultSet h = hab.get();
                                                        while(h.next()){
                                                    %>
                                                        <option value="<%=h.getString("cod_habitacion")%>" id="<%=h.getString("cod_habitacion")%>" data-price="<%=h.getString("precio")%>">
                                                            <%=h.getString("cod_habitacion")%> - <%=h.getString("nombre")%>
                                                        </option>
                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Cliente: </label>
                                            <div class="col-md-8">
                                                <select class="form-control form-control-line" name="cliente" required>
                                                    <%
                                                        Cliente client = new Cliente();
                                                        ResultSet c = client.get();
                                                        while(c.next()){
                                                    %>
                                                        <option value="<%=c.getInt("cedula")%>">
                                                            <%=c.getInt("cedula")%> - <%=c.getString("nombres")%> <%=c.getString("apellidos")%>
                                                        </option>
                                                    <%
                                                        }
                                                    %>
                                                </select>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Fecha inicial: </label>
                                            <div class="col-md-8">
                                                <input type="date" class="form-control form-control-line f-inicial" name="fecha_inicial" required> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Fecha final: </label>
                                            <div class="col-md-8">
                                                <input type="date" class="form-control form-control-line f-final" name="fecha_final" required> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Abonado</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line val-abonado" name="abonado" required autocomplete="off"> 
                                                <small class="days-price text-success"></small>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Extras</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="extras" value="0" required> 
                                                <input type="hidden" name="usuario" value="<%=user != null ? user.getInt("id"): "0"%>"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Observaciones: </label>
                                            <div class="col-md-8">
                                                <textarea type="text" class="form-control form-control-line" name="observaciones"> </textarea>
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
                        <div class="col-sm-3">
                            <div class="card border-warning mb-3">
                                <div class="card-header">Reservacion #<%=reservaciones.getInt("no_reservacion")%>
                                    <a href="DeleteReservation?index=<%=reservaciones.getInt("no_reservacion")%>" class="btn btn-warning btn-sm text-white" style="float: right;"><i class="fa fa-trash"></i></a>
                                </div>
                                <div class="card-body">
                                    <h4 class="card-title"><b>Cliente:</b> <%=res.getUserName(reservaciones.getInt("cliente"))%></h4>
                                  <p class="card-text">
                                      <b>Fecha Inicial: </b><%=reservaciones.getString("fecha_inicial")%><br>
                                      <b>Fecha Final: </b><%=reservaciones.getString("fecha_final")%><br>
                                      <b>Dias: </b><%=reservaciones.getInt("dias")%><br>
                                      <b>Presupuesto: </b>
                                      $<%=reservaciones.getDouble("abonado")%> de 
                                      <span class="text-success">$<%=reservaciones.getDouble("costo_total")%> </span>
                                      + extras: $<%=reservaciones.getDouble("extras")%><br>
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