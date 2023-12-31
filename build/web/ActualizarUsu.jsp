
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="ModeloDAO.RolDAO"%>
<%@page import="util.ConexionBd"%>
<%--@include file="Sesiones.jsp"--%>
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
        <link href="css/formActual.css" rel="stylesheet" type="text/css"/>
        <!--<link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/sidebars/">-->
        <!--<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        
        <!--<link href="css/IniSes.css" rel="stylesheet" type="text/css"/>-->
        <!--<link href="css/RegisCliente.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/PagPrincipal.css" rel="stylesheet" type="text/css"/>
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

        <%
            UsuarioVO usuVO = (UsuarioVO) request.getAttribute("¡El usuario encontrado!");
            if (usuVO != null) 
            {
        %>
        <div class="login-container">
            <div class="login-info-container">
                
                <form  class="inputs-container" novalidate method="post" action="UsuarioControlador">
                    <h2 class="title">Actualizar Usuario</h2>
                    <br>

                    <label>Nombre</label>
                    <input type="text" onkeypress="return SoloLetras2(event);" class="InSe" name="usuNombre"  value="<%=usuVO.getUsuNombre()%>"  required>
                    <br><br>

                    <label>Apellido</label>
                    <input type="text" onkeypress="return SoloLetras2(event);" class="InSe" name="usuApellido"  value="<%=usuVO.getUsuApellido()%>" placeholder="Apellidos" required>
                    <br><br>

                    <label>Telefono</label>
                    <input type="text" maxlength="10" class="InSe" name="usuTelefono"  value="<%=usuVO.getUsuTelefono()%>"  required onkeypress="return SoloNumeros2(event);">
                    <br><br>

                    <label>Cedula</label>
                    <input type="text" onkeypress="return SoloNumeros(event);" maxlength="10"  class="InSe" name="usuCedula"  value="<%=usuVO.getUsuCedula()%>"  required readonly onmousedown="return false;">
                    <br><br>

                    <label>Correo Electronico</label>
                    <input type="email" class="InSe" name="usuCorreo"  value="<%=usuVO.getUsuCorreo()%>"  required>
                    <br><br>

                    <label>Dirección</label>
                    <input type="text" class="InSe" name="usuDireccion"  value="<%=usuVO.getUsuDireccion()%>"   required>
                    <br><br>

                    <label>Contraseña</label>
                    <input type="password" id="password" class="InSe" name="usuPassword"   value="<%=usuVO.getUsuPassword()%>"  required>
                    <br><br>

                    <input type="button" value="MostrarContraseña" onclick="mostrarContrasena()" class="btn">
                    <br><br>

                    <label>Ingrese un rol</label>
                    <select name="rolId"  class="InSe" aria-label="Default select example">
                        <option>Seleccione un Rol...</option>
                        <%
                            RolDAO rolDAO = new RolDAO();
                            for (RolVO rolVO : rolDAO.listar())
                            {
                        %>
                        <option value="<%=rolVO.getRolId()%>"><%=rolVO.getRolTipo()%></option>
                            <%}%>
                    </select>

                    <br><br>

                    <input type="submit" value="Actualizar" class="btn">
                    <input type="hidden" name="opcion" value="2" class="btn">
 
                </form> 

            </div>
            <img class="image-container" src="images/registro.svg" alt="registro"> 
            </div>
           

    <% if (request.getAttribute("mensajeError") != null) {%>
    <div class="mensaje-error">
        <%= request.getAttribute("mensajeError")%>
    </div>
    <% } else if (request.getAttribute("mensajeExito") != null) {%>
    <div class="mensaje-exito">
        <%= request.getAttribute("mensajeExito")%>
    </div>
    <% }%>  
    
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
