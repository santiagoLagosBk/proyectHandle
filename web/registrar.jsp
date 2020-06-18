<%--
  Created by IntelliJ IDEA.
  User: Hogar
  Date: 10/06/2020
  Time: 10:31:a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=3.0, minimum-scale=1.0">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" >
    <link rel="stylesheet" href="Stilos/estilos.css">
    <title>Title</title>
</head>
<body>
<form class="formulario" method="post" action="<%=request.getContextPath()%>/EmployServlet">

    <h1>Registrate</h1>
    <div class="contenedor">

        <div class="input-contenedor">
            <i class="fas fa-user icon"></i>
            <input type="text" placeholder="Nombres " name="nameTxt">
        </div>

        <div class="input-contenedor">
            <i class="fas fa-user icon"></i>
            <input type="text" placeholder="apellidos" name="lastNameTxt">
        </div>

        <div class="input-contenedor">
            <i class="fas fa-user icon"></i>
            <input type="text" placeholder="documento" name="docTxt">
        </div>

        <div class="input-contenedor">
            <i class="fas fa-user icon"></i>
            <input type="text" placeholder="usuario" name="userTxt">

        </div>
        <div class="input-contenedor">
            <i class="fas fa-key icon"></i>
            <input type="password" placeholder="Contraseña" name="passTxt">

        </div>
        <input type="submit" value="Registrate" class="button">
        <p>Al registrarte, aceptas nuestras Condiciones de uso y Política de privacidad.</p>
        <p>¿Ya tienes una cuenta?<a class="link" href="index.jsp">Iniciar Sesion</a></p>
    </div>
</form>
</body>
</html>
