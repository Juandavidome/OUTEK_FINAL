<%-- 
    Document   : DatosCli
    Created on : 22/03/2023, 02:32:05 PM
    Author     : APRENDIZ
--%>

<%@page import="ModeloDAO.RolDAO"%>
<%@page import="ModeloVO.RolVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ModeloVO.UsuarioVO"%>
<%@page import="ModeloDAO.UsuarioDAO"%>
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
        <link href="css/formConsul.css" rel="stylesheet" type="text/css"/>
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
                <a href="Cliente.jsp">Inicio</a>
                <a href="CliCategorias.jsp">Productos</a>
                <a href="ActualizarCli.jsp">Actualizar Datos Personales</a>
                <a href="RegistrarVenta.jsp">Realizar Compra</a>
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
       <%        HttpSession miSesion = request.getSession(false);
        UsuarioVO usuario = (UsuarioVO) miSesion.getAttribute("datosUsuario");
        if (miSesion != null && usuario != null) {
            // Accede a los datos del usuario, por ejemplo:
            String nombreUsuario = usuario.getUsuNombre();
            String cedulaUsuario = usuario.getUsuCedula();
            // Realiza las operaciones necesarias con los datos del usuario
        } else {
            // La sesión o el objeto de usuario no existen, maneja el caso en consecuencia
        }
    %>
    <div class="consul">
    <form align="center"  method = "post" action="UsuarioControlador" class="formConsul" novalidate>
        <h1 class="titleConsul">Usuarios</h1>
        <br>
        <label>CEDULA:</label>
        <br>
        <input type="number"  name="usuCedula" class="ConsulInput" required value="<%=usuario.getUsuCedula()%>" onmousedown="return false;">
        
        <input type="submit" value= "Consultar" class="btnConsul">
        <input type="hidden" name="opcion" value="8" class="btnConsul">
        <br>
    </form> 
    </div>
      <script>
    document.addEventListener('keydown', function(event) {
      if (event.key === 'ArrowLeft' || event.key === 'ArrowRight') {
        event.preventDefault(); // Evitar la acción predeterminada del evento
      }
    });
  </script>
        <% 
            
            UsuarioVO usuVO = new UsuarioVO();      
            UsuarioDAO usuDAO = new UsuarioDAO(usuVO);
            ArrayList<UsuarioVO> lista = usuDAO.listar();

                    for(int i = 0; i < lista.size(); i++) {
                        usuVO = lista.get(i);
                     %>
           
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
