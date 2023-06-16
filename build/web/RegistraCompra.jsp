<%-- 
    Document   : RegistrarVenta
    Created on : 9/06/2023, 08:20:10 PM
    Author     : juand
--%>

<%@page import="ModeloVO.ProductoVO"%>
<%@page import="ModeloDAO.ProductoDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="Sesiones.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="shortcut icon" href="images/Logo..png">
        <script src="js/validaciones.js" type="text/javascript"></script>
        <!--FUENTE DE GOOGLE-->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;500;700&display=swap" rel="stylesheet">

        <!--<link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/sidebars/">-->
        <!--<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <!--<link href="css/IniSes.css" rel="stylesheet" type="text/css"/>-->
        <!--<link href="css/RegisCliente.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/formConsul.css" rel="stylesheet" type="text/css"/>
        <link href="css/Compra.css" rel="stylesheet" type="text/css"/>
        <link href="css/PagPrincipal.css" rel="stylesheet" type="text/css"/>
        <script src="js/mostrarContraseña.js" type="text/javascript"></script>
        <title>Outek</title>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2.min.css">
        <style>
            @media print{
                .consul-compra, .consul-compra-pro, header, .button-container {
                    display: none;
                }
            }
        </style>
        
        <script>
            window.addEventListener('load', function() {
            var currentDate = new Date().toISOString().slice(0, 10);
            document.getElementById("fecha-actual").innerHTML = currentDate;
            document.getElementById("PedFecha").value = currentDate;
            });
        </script>
        <script>
           function searchProducts() {
    var input = document.getElementById("searchInput");
    var filter = input.value.toUpperCase();
    var select = document.querySelector("select[name='codigoproducto']");
    var options = select.getElementsByTagName("option");
    for (var i = 0; i < options.length; i++) {
        var option = options[i];
        var txtValue = option.textContent || option.innerText;
        if (txtValue.toUpperCase().indexOf(filter) > -1) {
            option.style.display = "";
        } else {
            option.style.display = "none";
        }
    }
}

        </script>
        <script>
    document.addEventListener('keydown', function(event) {
      if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {
        event.preventDefault(); // Evitar la acción predeterminada del evento
      }
    });
  </script>
    </head>
    <body>
        <header>
            <nav>
                <a href="PersonalDeVentas.jsp">Inicio</a> 
                <a href="ConsultarProducto.jsp">Consulta de Productos</a>
                <a href="RegistrarProducto.jsp">Registro de Productos</a>
                <a href="RegistraCompra.jsp">Registro de Ventas</a>
                <a href="ConsultarVentas.jsp">Consultar de Ventas</a>
                <form method="post" action="Sesiones" class="Sesiones">
                    <input type="submit" value="Cerrar Sesión" class="btnCs"> 
                </form>
            </nav>
            <section class="textos-header">
                <h1>TECHNOLOGY CHECK-OUT</h1>
                <h2>Somos una empresa que te ofrece los mejores productos</h2>
            </section>
            <div class="wave" style="height: 150px; overflow: hidden;" ><svg viewBox="0 0 500 150" preserveAspectRatio="none" style="height: 100%; width: 100%;">
                <path d="M0.00,50.10 C150.00,150.33 349.20,-50.10 500.00,50.10 L500.00,150.33 L0.00,150.33 Z" style="stroke: none; fill: #fff;"></path></svg></div>
        </header>

        <form action="PedidoControlador2?menu=NuevaVenta" method="POST">
            <label id="fecha"> </label>
            <script>
                var date = new Date().toLocaleDateString();
                document.getElementById("fecha").innerHTML = "Fecha: " + date;
            </script>

            <br><br>

            <div class="consul-compra">
                <h1 class="titleConsulCom">Datos del Cliente</h1>
                <br>
                <label>Ingrese la Cedula del cliente</label>
                <br>
                <input type="text" name="codigocliente" value="${cliente.getUsuCedula()}" class="ConsulInputCom" placeholder="Cedula Cliente" onkeypress="return SoloNumeros2(event);">
                <br>
                <input type="submit" name="accion" value="BuscarCliente" class="btnConsulCom">
                <br>
                <label>Nombre del Cliente</label>
                <input type="text" name="nombrescliente" value="${cliente.getUsuNombre()}" class="ConsulInputCom" placeholder="Nombre Cliente" readonly onmousedown="return false;">
            </div>

            <br>

            <div class="consul-compra-pro">
                <h1 class="titleConsulCom">Datos del Producto</h1>
                <br>
                <label>Nombre del Producto</label>
                <br>
                <input type="text" id="searchInput" onkeyup="searchProducts()" placeholder="Buscar productos..." class="ConsulInputCom">
                <br>
                <select name="codigoproducto" class="custom-select" aria-label="Default select example">
                    <option>Seleccione un Producto...</option>
                    <%
                        ProductoDAO proDAO = new ProductoDAO();
                        for (ProductoVO proVO : proDAO.listarPedido()) {
                    %>
                    <option value="<%=proVO.getProId()%>"><%=proVO.getProNombre()%></option>
                    <%}%>
                </select>
                <br>
                <input type="submit" name="accion" value="BuscarProducto" class="btnConsulCom">

                <br>

                <label>ID del Producto</label>
                <input type="text" name="PedProId2" value="${p.getProId()}" class="ConsulInputCom" placeholder="ID Del Producto" readonly onmousedown="return false;">
                <br>
                <label>Nombre del Producto</label>
                <input type="text" name="nombreproducto" value="${p.getProNombre()}" class="ConsulInputCom" placeholder="Nombre Producto" readonly onmousedown="return false;">
                <br>
                <label>Precio del Producto</label>
                <input type="text" name="precio" value="${p.getProPrecioVenta()}" class="ConsulInputCom" placeholder="S/.0.00" readonly onmousedown="return false;">
                <br>
                <label>Ingrese la cantidad que desea</label>
                <input type="number" name="cant" id="cantidad" class="ConsulInputCom" placeholder="Cantidad" value="" onkeypress="return SoloNumeros2(event);">
                <br>
                <label>Stock</label>
                <input type="text" name="stock" id="stock" class="ConsulInputCom" value="${p.getProCantidad()}" placeholder="Stock" readonly onmousedown="return false;">

                <br>
                <input type="submit" name="accion" value="Agregar" class="btnConsulCom">
            </div>
        </form>

        <br><br>
        <div class="containerVenta">
            <br>
            <label >NroSerie: </label>
            <input type="text" name="NroSerie" value="${nserie}" class="ConsulInputCom" readonly onmousedown="return false;">

            <table >
                <thead>
                    <tr>
                        <th>Nro</th>
                        <th>Codigo</th>
                        <th>Nombre</th>
                        <th>Precio</th>
                        <th>Cantidad</th>
                        <th>SubTotal</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="list" items="${lista}">
                        <tr>
                            <td data-titulo="Item">${list.getItem()}</td>
                            <td data-titulo="producto">${list.getIdProducto()}</td>
                            <td data-titulo="descripcion">${list.getDescripcion()}</td>
                            <td data-titulo="precio">${list.getPrecio()}</td>
                            <td data-titulo="cantidad">${list.getCantidad()}</td>
                            <td data-titulo="SubTotal">${list.getSubTotal()}</td>
                            <td>
                                <a href="PedidoControlador2?menu=NuevaVenta&accion=Eliminar&indice=${list.item}" class="btn" style="margin-left: 10px">Eliminar</a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <div class="button-container">
                <a href="PedidoControlador2?menu=NuevaVenta&accion=GenerarVenta"  onclick="print()" class="btnReact">Generar Venta</a>
                <a href="PedidoControlador2?menu=NuevaVenta&accion=CancelarOrden"  class="btn">Cancelar Venta</a>
            </div>
            <br>
            <label>Total a pagar</label>
            <input type="text" name="txtTotal" value="S/. ${totalpagar}0" class="ConsulInputCom" readonly onmousedown="return false;">

            <script>
                const cantidadInput = document.getElementById('cantidad');
                const stockInput = document.getElementById('stock');
                cantidadInput.addEventListener('input', function() {
                const cantidad = parseInt(cantidadInput.value);
                const stock = parseInt(stockInput.value);
                if (cantidad > stock) {
                cantidadInput.value = stock;
                }
                });

            </script>
        </div>


        <footer>
            <div class="contenedor-footer">
                <div class="content-foo">
                    <h4>Email</h4>
                    <p>Techn0.Check0ut@gmail.com</p>
                </div>
                <div class="content-foo">
                    <h4>Telefono</h4>
                    <p>3142573571</p>
                </div>
                <div class="content-foo">
                    <h4>Locación</h4>
                    <p>Unilago</p>
                </div>
            </div>
            <h2 class="titulo-final">&copy; Outek | Technology Check-Out</h2>
        </footer>
    </body>
</html>
