<%--
  Created by IntelliJ IDEA.
  User: Hogar
  Date: 09/06/2020
  Time: 10:45:a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>

    <link rel="stylesheet" href="Stilos/estilos.css">
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
      <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0">
      <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" >
    <title>login</title>

  </head>
  <body>
  <header >
    <nav class="navbar navbar-expand-lg"  id="encabezado">
      <a class="navbar-brand" href="#">Handle</a>
    </nav>
  </div>

    <!-- As a heading -->

  </header>

  <form class="formulario" method="post" action="<%=request.getContextPath()%>/LoginServlet">
      <div class="form-group text-center">

          <img src="imagenes/Handle-Branding-New-Logo.png">
      </div>
      <div class="contenedor">

          <div class="input-contenedor">
              <i class="fas fa-envelope icon"></i>
              <input type="text" placeholder="Correo Electronico" name="username">

          </div>

          <div class="input-contenedor">
              <i class="fas fa-key icon"></i>
              <input type="password" placeholder="Contraseña" name="password">

          </div>
          <input type="submit" value="Inicio Sesion" class="button">
          <p>Al registrarte, aceptas nuestras Condiciones de uso y Política de privacidad.</p>
          <p>¿No tienes una cuenta? <a class="link" href="registrar.jsp">Registrate </a></p>
      </div>
  </form>

   </body>
</html>
