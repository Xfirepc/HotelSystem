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
                                      <h5 class="modal-title" id="exampleModalLabel">Nuevo Cliente</h5>
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
                                        <div class="form-group row">
                                            <label class="col-md-4">Nombres</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="nombres"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Apellidos</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="apellidos"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Direccion</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="direccion"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Telefono</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="telefono"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Email</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="email"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Observaciones</label>
                                            <div class="col-md-8">
                                                <textarea  class="form-control form-control-line" name="observaciones"></textarea>
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
                        <tr id="client-<%=client.getInt(1)%>">
                            <td field="cedula"><%=client.getInt(1)%></td>
                            <td field="nombres"><%=client.getString(2)%></td>
                            <td field="apellidos"><%=client.getString(3)%></td>
                            <td field="direccion"><%=client.getString(4)%></td>
                            <td field="telefono"><%=client.getInt(5)%></td>
                            <td field="email"><%=client.getString(6)%></td>
                            <td field="observaciones"><%=client.getString(7)%></td>
                            <td class="text-center">
                                <button class="btn btn-info btn-sm edit-client" data="#client-<%=client.getInt(1)%>"><i class="fa fa-eye"></i></button>
                                <a href="DeleteClient?id=<%=client.getInt(1)%>" class="btn btn-warning btn-sm"><i class="fa fa-trash"></i></a>
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