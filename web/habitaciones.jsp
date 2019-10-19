

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
            habitaciones.cod_habitacion = "5rd";
            habitaciones.numero = 44;
            habitaciones.piso = 50;
            habitaciones.observaciones = "La habitacion esta sin uso";
        %>
         <%=habitaciones.create()%>
         <hr>
         <%="INSERT INTO habitaciones (cod_habitacion,numero,piso,observaciones) VALUES (?,?,?,?)"%>
    </body>
</html>
