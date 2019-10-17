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
                    
                <form id="init-form" action="initForm" method="POST">
                    <div class="form-group hide name-input">
                      <label for="InputName">Nombre</label>
                      <input type="text" class="form-control" id="InputName" aria-describedby="emailHelp" placeholder="Ingresa tu nombre">
                    </div>
                    <div class="form-group">
                      <label for="InputEmail1">Email</label>
                      <input type="email" class="form-control" id="InputEmail1" aria-describedby="emailHelp" placeholder="Ingresar email">
                      <small id="emailHelp" class="form-text text-muted">Si no tienes cuenta registrate</small>
                    </div>
                    <div class="form-group">
                      <label for="InputPassword1">Password</label>
                      <input type="password" class="form-control" id="InputPassword1" placeholder="Clave">
                    </div>
                    <button type="submit" class="btn btn-primary">Ingresar</button>
                  </form>
                  <br/>
                <button class="btn btn-primary btn-register">Registrarse</button>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/main.js"></script>
    </body>
</html>
