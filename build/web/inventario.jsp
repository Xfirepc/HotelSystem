<%@page import="Model.Inventario"%>
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
                        <a class="text-white btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light" data-toggle="modal" data-target="#newArticle">Nuevo Articulo</a>
                            <div class="modal fade" id="newArticle" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                <div class="modal-dialog" role="document">
                                  <div class="modal-content">
                                    <div class="modal-header">
                                      <h5 class="modal-title" id="exampleModalLabel">Nuevo Articulo</h5>
                                      <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                        <span aria-hidden="true">&times;</span>
                                      </button>
                                    </div>
                                    <form class="form-horizontal form-material" action="NewArticle" method="POST">
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
                                                <select class="form-control form-control-line" name="habitacion">
                                                    <%
                                                        Habitacion hab = new Habitacion();
                                                        ResultSet h = hab.get();
                                                        while(h.next()){
                                                    %>
                                                        <option value="<%=h.getString("cod_habitacion")%>">
                                                            <%=h.getString("cod_habitacion")%> - <%=h.getString("nombre")%>
                                                        </option>
                                                    <%
                                                        }
                                                    %>
                                                </select>                                            </div>
                                        </div>
                                        <input type="hidden" name="usuario" value="<%=user != null ? user.getInt("id"): "0"%>">
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
                                Inventario invent = new Inventario();
                                ResultSet i = invent.get();
                                while(i.next()){
                            %>        
                            
                                <tr id="invent-<%=i.getString("codigo")%>">
                                    <td field="codigo"><%=i.getString("codigo")%></td>
                                    <td field="nombre"><%=i.getString("nombre")%></td>
                                    <td field="descripcion"><%=i.getString("descripcion")%></td>
                                    <td field="habitacion"><%=i.getString("habitacion")%></td>
                                    <td field="usuario"><%=i.getInt("usuario")%></td>
                                    <td field="observaciones"><%=i.getString("observaciones")%></td>
                                    <td class="text-center">
                                        <button class="btn btn-info btn-sm" onClick="showForm('#invent-<%=i.getString("codigo")%>')" data="#invent-<%=i.getString("codigo")%>">
                                            <i class="fa fa-eye"></i>
                                        </button>
                                        <a href="DeleteItem?codigo=<%=i.getString("codigo")%>" class="btn btn-warning btn-sm"><i class="fa fa-trash"></i></a>
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