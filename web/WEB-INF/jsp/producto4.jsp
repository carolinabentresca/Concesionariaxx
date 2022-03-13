<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto4</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="card-header bg-dark text-white">
            <h5 style="font-family: cursive">VOLKSWAGEN _ </h5>
        </div>
        <div class="container mt-4">
            <div class="card border-dark"> 
                <div class="card-body bg-dark text-white">
                    <a href="index.htm"  style="font-family: cursive" class="btn btn-warning">INICIO</a>
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th style="font-family: cursive" class="text-white">NºPRODUCTO</th>
                                <th style="font-family: cursive" class="text-white">MODELO</th>
                                <th style="font-family: cursive" class="text-white">COLOR</th>
                                <th style="font-family: cursive" class="text-white">PRECIO</th>
                                <th style="font-family: cursive" class="text-white">CUOTA</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="dato" items="${lista}">
                                <tr>
                                    <td style="font-family: cursive" class="text-white">${dato.id}</td>
                                    <td style="font-family: cursive" class="text-white">${dato.modelo}</td>
                                    <td style="font-family: cursive" class="text-white">${dato.color}</td>
                                    <td style="font-family: cursive" class="text-white">${dato.precio}</td>
                                    <td style="font-family: cursive" class="text-white">${dato.cuota}</td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>  
        </div>     
    </body>
</html>
