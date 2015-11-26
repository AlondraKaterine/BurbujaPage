<html>
    <head>
        <title>Multiservicios El Burbujita</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="estilos/Home.css">
        <script src="js/jquery.js"></script>
        <script src="js/bootstrap.min.js"></script>

    </head>
    <body>
        <header>
            <div class="cabecera"><font face="Lucida Calligraphy" size="3">Multiservicios El Burbujita</font> </div>		
            <header class="menu">
                <nav class="navbar navbar-inverse navbar-static-top" role="navigation">
                    <div class="container">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navegacion-fm">
                                <span class="sr-only">Desplegar / Ocultar Menu</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a href="#" class="navbar-brand  text-left" ></a>
                        </div>
                        <!-- Inicia Menu -->
                        <div class="collapse navbar-collapse" id="navegacion-fm">
                            <ul class="nav navbar-nav">
                                <li class="active"><a href="" class="glyphicon glyphicon-home">Inicio</a></li>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <li><a href="ventas.jsp" class="glyphicon glyphicon-gift">Ventas</a></li>
                                <li><a href="compras.jsp" class="glyphicon glyphicon-shopping-cart">Compra</a></li>
                                <li class="dropdown">
                                    <a href="#"  class="glyphicon glyphicon-calendar" class="dropdown-toggle" data-toggle="dropdown" role="button">Reportes <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="reporte_ventas.jsp">Reporte de Ventas</a></li>
                                        <li><a href="reporte_compras.jsp">Reporte de Compras</a></li>
                                    </ul>
                                </li>

                                <li class="dropdown">
                                    <a href="#"  class="glyphicon glyphicon-folder-open" class="dropdown-toggle" data-toggle="dropdown" role="button"> Catálogo <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="categoria.jsp">Categorías</a></li>
                                        <li><a href="producto.jsp">Productos</a></li>
                                        <li><a href="unidad_medida.jsp">Unidades de medida</a></li>
                                        <li><a href="reporte_compras.jsp">Precios</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#"  class="glyphicon glyphicon-picture" class="dropdown-toggle" data-toggle="dropdown" role="button"> Configuraciones <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="categoria.jsp">Categorías</a></li>
                                        <li><a href="producto.jsp">Productos</a></li>
                                        <li><a href="reporte_compras.jsp">Unidades de medida</a></li>
                                        <li><a href="reporte_compras.jsp">Precios</a></li>
                                    </ul>
                                </li>
                                 <li class="dropdown">
                                    <a href="#"  class="glyphicon glyphicon-list" class="dropdown-toggle" data-toggle="dropdown" role="button"> Acerca de <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="historia.jsp" class="glyphicon glyphicon-user">Nosotros</a></li>
                                    </ul>
                                </li>
                                   <li class="dropdown">
                                    <a href="#"  class="glyphicon glyphicon-th" class="dropdown-toggle" data-toggle="dropdown" role="button"> Galería <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="catalogo.jsp" class="glyphicon glyphicon-print">Cómputo</a></li>
                                    </ul>
                                </li>
                                <li class="dropdown">
                                    <a href="#"  class="glyphicon glyphicon-list" class="dropdown-toggle" data-toggle="dropdown" role="button"> Perfil <span class="caret"></span>
                                    </a>
                                    <ul class="dropdown-menu" role="menu">
                                        <li><a href="login.jsp" class="glyphicon glyphicon-off">Cerrar Sesión</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
            </header>
        </header>
<div class="container">
  <h2>Mis compras</h2>
    <%-- 
    Document   : categoria
    Created on : 16/11/2015, 04:06:19 PM
    Author     : Liliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Dao.CompraDao" %>
<%@page import="Entidad.Compra" %>
<%@page import="DaoImpl.CompraDaoImpl" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Compras</title>
        <%!
            String buscar;
        %>
        <%
            buscar = request.getParameter("buscar");
            if (buscar == null) {
                buscar = "";
            }

        %>
    </head>
    <body>
        <%@include file="index.jsp" %>
    <center>Registro de compras </center>
    <form name="form" method="post" action="compras.jsp">
        <table align="center" width="100%">
            <tr>
                <td align="right">
                    <input type="text" name="buscar" value="<%=buscar%>" placeholder="Buscar" size="15"/>
                    <input type="submit" name="" value="Buscar"/>
                </td>
            </tr>
        </table>
    </form>
    <div class="container">
        <table class="table table-bordered class-hover">
            <tr>
                <th>#</th>
                <th>Fecha Registro</th>
                <th>Hora Registro</th>
                <th>Numero Comprobante</th>
                <th colspan="2">Opciones</th>
            </tr>
            <% int i = 0;
                C dao = new CategoriaDaoImpl();
                for (Categoria cat : dao.listarCategoria(buscar)) {
                    i = i + 1;
            %>
            <tr>
                <td><%=i%></td>
                <td><%=cat.getNombre()%></td>
                <td><%=cat.getDescripcion()%></td>
                <td><%=cat.getEstado()%></td>
                <td><a href="">Editar</a></td>
                <td><a href="">Borrar</a></td>
            </tr>
            <%}%>
        </table>
    </div>

</body>
</html>
          
  
</div>

</body>
</html>