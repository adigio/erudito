<%--
  Created by IntelliJ IDEA.
  User: matias
  Date: 17/5/21
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bienvenida - El Erudito</title>
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
</head>
<body>
    <div class="container text-center">
        <h1>Hola ${nombre}</h1>
        <h5>Su código generado es:</h5>
        <h2><span class="badge badge-dark">${codigo}</span></h2>
        <button class="btn btn-success">Jugar</button>
    </div>
</body>
</html>
