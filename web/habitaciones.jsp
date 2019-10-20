

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
                        <h4 class="page-title">HABITACIONES</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <a href="https://wrappixel.com/templates/ampleadmin/" target="_blank"
                            class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light" data-toggle="modal" data-target="#newHab">Nueva Habitación</a>
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
                                                    <input type="text" class="form-control form-control-line"> 
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-md-4">Nombre</label>
                                                <div class="col-md-8">
                                                    <input type="text" class="form-control form-control-line"> 
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-md-4">Piso</label>
                                                <div class="col-md-8">
                                                    <input type="number" class="form-control form-control-line"> 
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-md-4">Precio</label>
                                                <div class="col-md-8">
                                                    <input type="number" class="form-control form-control-line"> 
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-md-4">Imagen</label>
                                                <div class="col-md-8">
                                                    <input type="text" class="form-control form-control-line"> 
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-md-4">Descripción</label>
                                                <div class="col-md-8">
                                                    <textarea class="form-control form-control-line"></textarea>
                                                </div>
                                            </div>
                                            <div class="form-group row">
                                                <label class="col-md-4">Observaciónes</label>
                                                <div class="col-md-8">
                                                    <textarea class="form-control form-control-line"></textarea>
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
                <div class="row">
                    
                    <%
                        Habitacion hab = new Habitacion();
                        ResultSet result = hab.get();
                        while(result.next()){
                    %>
                        <div class="col-sm-4 col-xs-12 habitacion">
                            <div class="white-box">
                                <div class="user-bg"> <img width="100%" alt="user" src="<%=result.getString("imagen")%>">
                                    <div class="overlay-box">
                                        <div class="user-content">
                                            <a href="javascript:void(0)"><img src="<%=result.getString("imagen")%>"
                                                    class="thumb-lg img-circle" alt="img"></a>
                                            <h3 class="text-white"><%=result.getString("nombre")%> - Piso: <%=result.getInt("piso")%></h3>
                                            <h4 class="text-white">Precio: $<%=result.getDouble("precio")%></h4>
                                        </div>
                                    </div>
                                </div>
                                <div class="user-btm-box">
                                    <b>Descripcion:</b> <%=result.getString("descripcion")%> <br>
                                    <b>Observaciones:</b> <%=result.getString("observaciones")%>
                                </div>
                            </div>
                        </div>
                    
                    <%
                        }
                    %>
                </div>
            </div>
        </div>

            <footer class="footer text-center"> 2017 &copy; Ample Admin brought to you by wrappixel.com </footer>
        
     
 <%@include file="layout/footer.jsp" %>