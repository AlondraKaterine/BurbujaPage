<%-- 
    Document   : categoria
    Created on : 16/11/2015, 04:06:19 PM
    Author     : Liliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Dao.ProductoDao" %>
<%@page import="Entidad.Producto" %>
<%@page import="DaoImpl.ProductoDaoImpl" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto</title>
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
    <center><div class="tit"><h3 style="#fff">Lista de Productos</h3>
    <form name="form" method="post" action="producto.jsp">
        <table align="center" width="100%">
            <tr>
                <td align="right">
                    <input type="text" name="buscar" style="border-radius:15px " value="<%=buscar%>" placeholder="Buscar" size="15"/>
                    <input type="submit" name="" class="btn btn-primary" btn- value="Buscar"/>
                </td>
            </tr>
        </table>
    </form>
    <div class="container">
        <table class="table table-bordered class-hover">
            <tr>
                <th>#</th>
                <th>Codigo</th>
                <th>Nombre</th>
                <th>Categoría</th>
                <th>Presentacion</th>
                <th>Marca</th>
                <th>Modelo</th>
                <th>Unidad Medida</th>
                <th>Precio Compra</th>
                <th>Estado</th>
                <th colspan="2">Opciones</th>
            </tr>
            <% int i = 0;
                ProductoDao dao = new ProductoDaoImpl();
                for (Producto pro : dao.listarProducto(buscar)) {
                    i = i + 1;
            %>
            <tr>
                <td><%=i%></td>
                <td><%=pro.getCodigo()%></td>
                <td><%=pro.getNombre()%></td>
                <td><%=pro.getNombre_categoria()%></td>
                <td><%=pro.getPresentacion()%></td>
                <td><%=pro.getMarca()%></td>
                <td><%=pro.getModelo()%></td>
                <td><%=pro.getNombre_unidad_medida() %></td>
                <td><%=pro.getPrecio_compra()%></td>
                <td><%=pro.getEstado()%></td>
                <td><a href="">Editar</a></td>
                <td><a href="">Borrar</a></td>
            </tr>
            <%}%>
        </table>
    </div>

</body>
</html>

