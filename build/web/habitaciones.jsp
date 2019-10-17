

<%@page import="java.sql.ResultSet"%>
<%@page import="Model.Habitacion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <%
            Habitacion habitaciones = new Habitacion();
            ResultSet rs = habitaciones.getOne("123");
   
            Object[] data = {"rsxs", 44, 10, "obsevada"};
        %>
         <%=habitaciones.create(data)%>
         <hr>
         <%="INSERT INTO habitaciones (cod_habitacion,numero,piso,observaciones) VALUES (?,?,?,?)"%>
    </body>
</html>
