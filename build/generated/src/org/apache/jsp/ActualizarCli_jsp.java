package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.UsuarioVO;
import ModeloVO.UsuarioVO;

public final class ActualizarCli_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Sesiones.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       ");

        HttpSession buscarSesion = (HttpSession) request.getSession();
        if (buscarSesion.getAttribute("datosUsuario") != null)
        {
            
            UsuarioVO usuVO = (UsuarioVO) buscarSesion.getAttribute("datosUsuario");
            
        }
        else 
        {
            request.getRequestDispatcher("Index.jsp").forward(request, response);
        }
        
      out.write("         \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      
            response.setHeader("Pragma","No-cache");
            response.setHeader("Cache-control","no-cache,no-store,must-revalidate"); 
            if(buscarSesion.getAttribute("datosUsuario") == null)
            {
                response.sendRedirect("Index.jsp");
                
            }
    
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/Logo..png\">\n");
      out.write("        <script src=\"js/validaciones.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!--FUENTE DE GOOGLE-->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Comfortaa:wght@300;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--<link rel=\"canonical\" href=\"https://getbootstrap.com/docs/5.3/examples/sidebars/\">-->\n");
      out.write("        <!--<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <link href=\"css/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/RegisCliente.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!--<link href=\"css/PagPrincipal.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <script src=\"js/mostrarContraseña.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Actualizar Cliente</title>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("        <script src=\"sweetalert2.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"sweetalert2.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <a href=\"Cliente.jsp\">Inicio</a>\n");
      out.write("                <a href=\"CliCategorias.jsp\">Productos</a>\n");
      out.write("                <a href=\"DatosCli.jsp\">Actualizar Datos Personales</a>\n");
      out.write("                <a href=\"RegistrarVenta.jsp\">Realizar Compra</a>\n");
      out.write("                <a href=\"ConsultarCompra.jsp\">Consultar Pedido</a>\n");
      out.write("                <form method=\"post\" action=\"Sesiones\" class=\"Sesiones\">\n");
      out.write("                    <input type=\"submit\" value=\"Cerrar Sesión\" class=\"btnCs\"> \n");
      out.write("                </form>\n");
      out.write("            </nav>\n");
      out.write("            <section class=\"textos-header\">\n");
      out.write("                <h1>TECHNOLOGY CHECK-OUT</h1>\n");
      out.write("                <h2>Somos una empresa que te ofrece los mejores productos</h2>\n");
      out.write("            </section>\n");
      out.write("            <div class=\"wave\" style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\">\n");
      out.write("                <path d=\"M0.00,50.10 C150.00,150.33 349.20,-50.10 500.00,50.10 L500.00,150.33 L0.00,150.33 Z\" style=\"stroke: none; fill: #fff;\"></path></svg></div>\n");
      out.write("        </header>\n");
      out.write("         ");

            UsuarioVO usuVO = (UsuarioVO) request.getAttribute("¡Cliente encontrado!");
            if (usuVO != null) {
                
      out.write("\n");
      out.write("            <div class=\"login-container\">\n");
      out.write("            <div class=\"login-info-container\">\n");
      out.write("                <form  class=\"needs-validation\" novalidate  align=\"center\" method=\"post\" action=\"UsuarioControlador\"> \n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                <h1 class=\"title\">Actualizar Cliente</h1><br>\n");
      out.write("                <p>Solo tomara un minuto</p>\n");
      out.write("                <br>\n");
      out.write("                <label>Ingrese su Nombre</label>\n");
      out.write("                <input type=\"text\" class=\"regis\"name=\"usuNombre\"  value=\"");
      out.print(usuVO.getUsuNombre());
      out.write("\" required onkeypress=\"return SoloLetras(event);\">\n");
      out.write("                           <br><br>\n");
      out.write("                <label>Ingrese su apellido</label>\n");
      out.write("                <input type=\"text\" class=\"regis\" name=\"usuApellido\"  value=\"");
      out.print(usuVO.getUsuApellido());
      out.write("\"  required onkeypress=\"return SoloLetras(event);\">\n");
      out.write("                    <br><br>       \n");
      out.write("                <label>Ingrese su correo electronico</label>\n");
      out.write("                <input type=\"email\" class=\"regis\" name=\"usuCorreo\"  value=\"");
      out.print(usuVO.getUsuCorreo());
      out.write("\"  required>\n");
      out.write("                        <br><br>\n");
      out.write("                <label>Ingrese una dirección</label>\n");
      out.write("                <input type=\"text\" class=\"regis\" name=\"usuDireccion\"  value=\"");
      out.print(usuVO.getUsuDireccion());
      out.write("\"   required>\n");
      out.write("                    <br><br>\n");
      out.write("                <label>Ingrese su número telefonico</label>\n");
      out.write("                <input type=\"number\" class=\"regis\" name=\"usuTelefono\"  value=\"");
      out.print(usuVO.getUsuTelefono());
      out.write("\"  required onkeypress=\"return SoloNumeros(event);\">\n");
      out.write("                <br><br>  \n");
      out.write("                <label>Cedula</label>\n");
      out.write("                <br> \n");
      out.write("                <input type=\"number\" class=\"regis\" name=\"usuCedula\"  value=\"");
      out.print(usuVO.getUsuCedula());
      out.write("\"  readonly onmousedown=\"return false;\" required  >\n");
      out.write("                <br><br>\n");
      out.write("                <input type=\"submit\" value=\"Actualizar\" class=\"btn\" onclick=\"mostrarAlerta()\">\n");
      out.write("                <input type=\"hidden\" name=\"opcion\" value=\"10\">\n");
      out.write("                </div>\n");
      out.write("                <img class=\"image-container\" src=\"images/registro.svg\" alt=\"registro\">\n");
      out.write("            </div>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                 <footer>\n");
      out.write("            <div class=\"contenedor-footer\">\n");
      out.write("                <div class=\"content-foo\">\n");
      out.write("                    <h4>Email</h4>\n");
      out.write("                    <p>Techn0.Check0ut@gmail.com</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-foo\">\n");
      out.write("                    <h4>Telefono</h4>\n");
      out.write("                    <p>3142573571</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content-foo\">\n");
      out.write("                    <h4>Locación</h4>\n");
      out.write("                    <p>Unilago</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <h2 class=\"titulo-final\">&copy; Outek | Technology Check-Out</h2>\n");
      out.write("        </footer>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
