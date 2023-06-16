
<!doctype html>
<%@include file="Sesiones.jsp" %>

<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="shortcut icon" href="images/Logo..png">

        <!--FUENTE DE GOOGLE-->
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;500;700&display=swap" rel="stylesheet">

        <!--<link rel="canonical" href="https://getbootstrap.com/docs/5.3/examples/sidebars/">-->
        <!--<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>-->
        <link href="css/Style.css" rel="stylesheet" type="text/css"/>
        <link href="css/PagPrincipal.css" rel="stylesheet" type="text/css"/>
        <link href="css/IniSes.css" rel="stylesheet" type="text/css"/>
        <title>Outek</title>
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
        <main>
            <section class="contenedor sobre-nosotros">
                <h2 class="titulo">Nuestros Productos</h2>
                <div class="contenedor-sobre-nosotros">
                    <img src="images/Nosotros.svg" alt="Nosotros" class="imagen-about-us">
                    <form method="POST" action="GenerarReporte.jsp" target="_blank">
                            <input class="btn btn-danger" type="submit" value="Generar Reporte PDF">
                            <input type="hidden"  name="reportName" value="Pedido"> 
                    </form>  
                </div>
            </section>
        </main>
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
