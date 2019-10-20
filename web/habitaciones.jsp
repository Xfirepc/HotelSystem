

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
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="white-box">
                            <h3 class="box-title">Blank Page</h3
                            
                            <% 
                                Cliente client = new Cliente();
                                client.cedula = 1213412;
                                client.nombres = "Jose";
                                client.apellidos = "Flores";
                                client.direccion = "Quito";
                                client.telefono = 987522;
                                client.email = "example@example.com";
                                client.observaciones = "Esta debiendo";
                                
                            %>
                            
                        </div>
                        <%= client.create() %>
                    </div>
                </div>
            </div>
            </div>

            <footer class="footer text-center"> 2017 &copy; Ample Admin brought to you by wrappixel.com </footer>
        
     
 <%@include file="layout/footer.jsp" %>