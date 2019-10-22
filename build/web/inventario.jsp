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
                        <h4 class="page-title">INVENTARIO</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <a href="https://wrappixel.com/templates/ampleadmin/" target="_blank"
                            class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light" data-toggle="modal" data-target="#newHab">Nuevo Cliente</a>
                            <div class="modal fade" id="newHab" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                  <div class="modal-content">
                                    <div class="modal-header">
                                      <h5 class="modal-title" id="exampleModalLabel">Nuevo Articulo</h5>
                                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                      </button>
                                    </div>
                                    <form class="form-horizontal form-material" action="NewArtInventario" method="POST">
                                    <div class="modal-body">
                                        <div class="form-group row">
                                            <label class="col-md-4">Codigo</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="codigo"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Nombre</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="nombre"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Descripcion</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="descripcion"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Habitacion</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="habitacion"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Usuario</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="usuario"> 
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <label class="col-md-4">Observaciones</label>
                                            <div class="col-md-8">
                                                <input type="text" class="form-control form-control-line" name="observaciones"> 
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
                     <h3 class="box-title">Lista de Articulos en el Hotel</h3>
                     <div class="">
                         <div class="content-edit">
                             
                         </div>
                     </div>
                      <div class="table-responsive">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Codigo</th>
                                    <th>Nombre</th>
                                    <th>Descripcion</th>
                                    <th>Habitacion</th>
                                    <th>Usuario</th>
                                    <th>Observaciones</th>
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
                                <button class="btn btn-info btn-sm" onClick="showForm('#client-<%=client.getInt(1)%>')" data="#client-<%=client.getInt(1)%>"><i class="fa fa-eye"></i></button>
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