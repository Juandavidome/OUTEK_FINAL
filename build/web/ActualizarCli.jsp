<%-- 
    Document   : ActualizarCli
    Created on : 22/03/2023, 05:31:51 PM
    Author     : APRENDIZ
--%>

<%@page import="ModeloVO.UsuarioVO"%>
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
        <link href="css/RegisCliente.css" rel="stylesheet" type="text/css"/>
        <!--<link href="css/PagPrincipal.css" rel="stylesheet" type="text/css"/>-->
        <script src="js/mostrarContraseña.js" type="text/javascript"></script>
        <title>Actualizar Cliente</title>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2.min.css">
    </head>
    <body>
        <header>
            <nav>
                <a href="Cliente.jsp">Inicio</a>
                <a href="CliCategorias.jsp">Productos</a>
                <a href="DatosCli.jsp">Actualizar Datos Personales</a>
                <a href="RegistrarVenta.jsp">Realizar Compra</a>
                <a href="ConsultarCompra.jsp">Consultar Pedido</a>
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
         <%
            UsuarioVO usuVO = (UsuarioVO) request.getAttribute("¡Cliente encontrado!");
            if (usuVO != null) {
                %>
            <div class="login-container">
            <div class="login-info-container">
                <form  class="needs-validation" novalidate  align="center" method="post" action="UsuarioControlador"> 
                <br>
                
                <h1 class="title">Actualizar Cliente</h1><br>
                <p>Solo tomara un minuto</p>
                <br>
                <label>Ingrese su Nombre</label>
                <input type="text" class="regis"name="usuNombre"  value="<%=usuVO.getUsuNombre()%>" required onkeypress="return SoloLetras(event);">
                           <br><br>
                <label>Ingrese su apellido</label>
                <input type="text" class="regis" name="usuApellido"  value="<%=usuVO.getUsuApellido()%>"  required onkeypress="return SoloLetras(event);">
                    <br><br>       
                <label>Ingrese su correo electronico</label>
                <input type="email" class="regis" name="usuCorreo"  value="<%=usuVO.getUsuCorreo()%>"  required>
                        <br><br>
                <label>Ingrese una dirección</label>
                <input type="text" class="regis" name="usuDireccion"  value="<%=usuVO.getUsuDireccion()%>"   required>
                    <br><br>
                <label>Ingrese su número telefonico</label>
                <input type="number" class="regis" name="usuTelefono"  value="<%=usuVO.getUsuTelefono()%>"  required onkeypress="return SoloNumeros(event);">
                <br><br>  
                <label>Cedula</label>
                <br> 
                <input type="number" class="regis" name="usuCedula"  value="<%=usuVO.getUsuCedula()%>"  readonly onmousedown="return false;" required  >
                <br><br>
                <input type="submit" value="Actualizar" class="btn" onclick="mostrarAlerta()">
                <input type="hidden" name="opcion" value="10">
                </div>
                <img class="image-container" src="images/registro.svg" alt="registro">
            </div>
                <%}%>
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