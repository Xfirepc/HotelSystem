

<%@page import="java.sql.ResultSet"%>
<%@page import="Controller.HandlerRequest"%>
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
            HandlerRequest usu = new HandlerRequest();
            ResultSet rs = usu.Listar();
            while (rs.next()) {
        %>
        <hr>
           <%=rs.getString("cod_habitacion")%>
           <%=rs.getInt("numero")%>
           <%=rs.getInt("piso")%>
           <%=rs.getString("observaciones")%>
        <%
            }
        %>
    </body>
</html>
