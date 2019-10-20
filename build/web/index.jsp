<%@page import="Utils.Utils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reservaciones de un Hotel</title>
        <link rel="stylesheet" href="assets/css/styles.css">
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
    </head>

    <body>
        <div class="container text-center mt-5"><h1>INGRESO</h1></div>
        <div class='loader'>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='window'></div>
            <div class='door'></div>
            <div class='hotel-sign'>
              <span>H</span>
              <span>O</span>
              <span>T</span>
              <span>E</span>
              <span>L</span>
            </div>
          </div>
        <div class="container">
            <div class="row">
                <div class="col-sm-4"></div>
                <div class="col-sm-4 text-center">
                <%
                    String msg = request.getParameter("msg");
                    String showMsg = null;
                    if(msg != "") {
                        Utils utl = new Utils();
                        showMsg = utl.decode64(msg);
                    %>
                    <div class="alert alert-dismissible alert-info">
                        <button type="button" class="close" data-dismiss="alert">&times;</button>
                        <strong><%= showMsg %></strong>
                      </div>
                    <%
                    }
                %>   
                <form id="init-form" action="Login" method="POST">
                    <div class="form-group hide name-input">
                      <label for="InputName">Nombre</label>
                      <input type="text" class="form-control" id="InputName" name="name" aria-describedby="emailHelp" placeholder="Usuario">
                    </div>
                    <div class="form-group">
                      <label for="InputEmail1">Email</label>
                      <input type="email" class="form-control" id="InputEmail1" name="email" aria-describedby="emailHelp" placeholder="example@info.com">
                    </div>
                    <div class="form-group">
                      <label for="InputPassword1">Password</label>
                      <input type="password" class="form-control" id="InputPassword1" name="pass" placeholder="******">
                      <small id="emailHelp" class="form-text text-muted">Si no tienes cuenta registrate</small>
                    </div>
                    <button type="submit" class="btn btn-primary">Ingresar</button>
                    <a class="btn btn-primary btn-register text-white">Registrarse</a>
                  </form>
                  <br/>
               
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
