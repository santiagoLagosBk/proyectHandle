
<%@ page import="javaguide.login.principal.LoginU" %>

<% LoginU loginU = new LoginU();


%><%--
  Created by IntelliJ IDEA.
  User: Hogar
  Date: 09/06/2020
  Time: 11:16:a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
   <link rel="stylesheet" href="Stilos/success.css">

    <title>Haz entrado</title>
</head>
<body>

<header>
    <nav class="navbar navbar-expand-lg navbar-light bg-info">
        <div class="dropdown">
            <button  style="border: none" class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <h4>${name1}</h4>
            </button>
            <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                <a class="dropdown-item" href="#">User</a>
                <a class="dropdown-item" href="#">correo</a>
                <a class="dropdown-divider" ></a>
                <a class="dropdown-item" href="#">Salir</a>
            </div>
        </div>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="btn btn-outline-light  botones" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a  class="btn btn-outline-light  botones" href="#">Producto</a>
                </li>
                <li class="nav-item">
                    <a  class="btn btn-outline-light   botones" href="#">Empleado</a>
                </li>
                <li class="nav-item">
                    <a class="btn btn-outline-light     botones" href="#">Cliente</a>
                </li>
                <li class="nav-item">
                    <a class="btn btn-outline-light     botones" href="#">Nueva venta</a>
                </li>

            </ul>

            </div>
        <IMG src="imagenes/user_13230.png" ALT="50" WIDTH="50">

    </nav>
</header>
<main>

</main>
<footer>

</footer>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

</body>
</html>
