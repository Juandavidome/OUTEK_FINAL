<%-- 
    Document   : Registrar
    Created on : 16/03/2023, 08:12:34 PM
    Author     : juand
--%>

<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="util.ConexionBd"%>
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
        <title>Outek</title>
        <script src="https://cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <script src="sweetalert2.min.js"></script>
        <link rel="stylesheet" href="sweetalert2.min.css">
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
                <a href="Administrador.jsp">Inicio</a>
                <a href="RegistrarUsu.jsp">Registro de Usuarios</a>
                <a href="ConsultarUsu.jsp">Consulta de Usuarios</a>
                <a href="ConsultarVentasAdmin.jsp">Consulta de Ventas</a>
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
        <div class="login-container">
            <div class="login-info-container">
                <form  class="needs-validation" novalidate  method="post" action="UsuarioControlador">

                    <br>
                    <h2 class="title">Registrar Personal</h2>
                    <p>Solo tomara un minuto</p>
                    <br>
                    <label>Ingrese el nombre</label>
                    <input type="text"  onkeypress="return SoloLetras(event);"  class="regis" name="usuNombre" placeholder="Nombre" required>

                    <br><br>

                    <label>Ingrese el apellido</label>
                    <input type="text" onkeypress="return SoloLetras(event);" class="regis" name="usuApellido" placeholder="Apellidos" required>

                    <br><br>

                    <label>Ingrese número telefonico</label>
                    <input type="text" onkeypress="return SoloNumeros(event);" maxlength="10"  class="regis" name="usuTelefono" placeholder="Telefono" required>

                    <br><br>

                    <label>Ingrese la cedula</label>
                    <input type="text" onkeypress="return SoloNumeros(event);" maxlength="10"  class="regis" name="usuCedula" placeholder="Cedula" required>

                    <br><br>

                    <label>Ingrese el correo electronico</label>
                    <input type="email" class="regis" name="usuCorreo" placeholder="Correo Electronico" required>

                    <br><br>

                    <label>Ingrese una dirección</label>
                    <input type="text" class="regis" name="usuDireccion" placeholder="Direccion" required>

                    <br><br>

                    <label>Ingrese una contraseña</label>
                    <input type="password" id="password" class="regis" name="usuPassword" placeholder="Contraseña" required>
                    <br><br>

                    <input type="button" value="MostrarContraseña" onclick="mostrarContrasena()" class="btn">

                    <br><br>

                    <label>Ingrese un rol</label>
                    <br>
                    <select name="rolId"  class="custom-select" aria-label="Default select example">
                        <option>Seleccione un Rol...</option>
                        <%
                            RolDAO rolDAO = new RolDAO();
                            for (RolVO rolVO : rolDAO.listar()) {
                        %>
                        <option value="<%=rolVO.getRolId()%>"><%=rolVO.getRolTipo()%></option>
                        <%}%>
                    </select>

                    <br>
                    <br>

                    <input type="submit" value="Registrar" class="btn" >

                    <input type="hidden" name="opcion" value="1" class="btn">
                    <input type="hidden" name="rolId" value="1" class="btn">
                </form> 
                    <br><br>
                    <%
                    if (request.getAttribute("mensajeError") != null) {%>
                    ${mensajeError}

                    <%} else {%>
                    ${mensajeExito}
                    <%}%>
                    </div>  

                

                <img class="image-container" src="images/registro.svg" alt="registro"> 
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
