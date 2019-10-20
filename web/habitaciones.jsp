

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
                            class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light" data-toggle="modal" data-target="#newHab">Nueva Habitacion</a>
                    </div>
                    <!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
  Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
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