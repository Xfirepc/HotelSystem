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
                        <h4 class="page-title">CLIENTES</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <a href="https://wrappixel.com/templates/ampleadmin/" target="_blank"
                            class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light" data-toggle="modal" data-target="#newHab">Nuevo Cliente</a>
                            <div class="modal fade" id="newHab" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                  <div class="modal-content">
                                    <div class="modal-header">
                                      <h5 class="modal-title" id="exampleModalLabel">Nueva habitación</h5>
                                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                      </button>
                                    </div>
                                    <form class="form-horizontal form-material" action="NewRoom">
                                    <div class="modal-body">
                                            <div class="form-group row">
                                                <label class="col-md-4">Código</label>
                                                <div class="col-md-8">
                                                    <input type="text" class="form-control form-control-line" name="codigo"> 
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
                     <h3 class="box-title">Lista de clientes</h3>
                      <div class="table-responsive">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>#</th>
                                    <th>Nombres</th>
                                    <th>Apellidos</th>
                                    <th>Direccion</th>
                                    <th>Telefono</th>
                                    <th>Email</th>
                                    <th>Obs</th>
                                    <th>Action</th>
                                </tr>
                            </thead>
                            <tbody>
                    <%
                        Cliente cli = new Cliente();
                        ResultSet client = cli.get();
                        while(client.next()){
                    %>
                        <tr>
                            <td><%=client.getInt(1)%></td>
                            <td><%=client.getString(2)%></td>
                            <td><%=client.getString(3)%></td>
                            <td><%=client.getString(4)%></td>
                            <td><%=client.getInt(5)%></td>
                            <td><%=client.getString(6)%></td>
                            <td><%=client.getString(7)%></td>
                            <td class="text-center">
                                <button class="btn btn-info btn-sm"><i class="fa fa-eye"></i></button>
                                <button class="btn btn-warning btn-sm"><i class="fa fa-trash"></i></button>
                            </td>
                        </tr>
                    
                    <%
                        }
                    %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
        
     
 <%@include file="layout/footer.jsp" %>