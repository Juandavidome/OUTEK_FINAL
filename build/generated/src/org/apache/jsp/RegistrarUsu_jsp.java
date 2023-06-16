package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.RolVO;
import ModeloDAO.RolDAO;
import util.ConexionBd;

public final class RegistrarUsu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("        <title>Outek</title>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("        <script src=\"sweetalert2.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"sweetalert2.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <a href=\"Administrador.jsp\">Inicio</a>\n");
      out.write("                <a href=\"RegistrarUsu.jsp\">Registro de Usuarios</a>\n");
      out.write("                <a href=\"ConsultarUsu.jsp\">Consulta de Usuarios</a>\n");
      out.write("                <form method=\"post\" action=\"Sesiones\" class=\"Sesiones\">\n");
      out.write("                    <input type=\"submit\" value=\"Cerrar Sesión\" class=\"btnCs\"> \n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("            <section class=\"textos-header\">\n");
      out.write("                <h1>TECHNOLOGY CHECK-OUT</h1>\n");
      out.write("                <h2>Somos una empresa que te ofrece los mejores productos</h2>\n");
      out.write("            </section>\n");
      out.write("            <div class=\"wave\" style=\"height: 150px; overflow: hidden;\" ><svg viewBox=\"0 0 500 150\" preserveAspectRatio=\"none\" style=\"height: 100%; width: 100%;\">\n");
      out.write("                <path d=\"M0.00,50.10 C150.00,150.33 349.20,-50.10 500.00,50.10 L500.00,150.33 L0.00,150.33 Z\" style=\"stroke: none; fill: #fff;\"></path></svg></div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"login-container\">\n");
      out.write("            <div class=\"login-info-container\">\n");
      out.write("                <form  class=\"needs-validation\" novalidate  method=\"post\" action=\"UsuarioControlador\">\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <h2 class=\"title\">Registrar Personal</h2>\n");
      out.write("                    <p>Solo tomara un minuto</p>\n");
      out.write("                    <br>\n");
      out.write("                    <label>Ingrese el nombre</label>\n");
      out.write("                    <input type=\"text\"  onkeypress=\"return SoloLetras(event);\"  class=\"regis\" name=\"usuNombre\" placeholder=\"Nombre\" required>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label>Ingrese el apellido</label>\n");
      out.write("                    <input type=\"text\" onkeypress=\"return SoloLetras(event);\" class=\"regis\" name=\"usuApellido\" placeholder=\"Apellidos\" required>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label>Ingrese número telefonico</label>\n");
      out.write("                    <input type=\"text\" onkeypress=\"return SoloNumeros(event);\" maxlength=\"10\"  class=\"regis\" name=\"usuTelefono\" placeholder=\"Telefono\" required>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label>Ingrese la cedula</label>\n");
      out.write("                    <input type=\"text\" onkeypress=\"return SoloNumeros(event);\" maxlength=\"10\"  class=\"regis\" name=\"usuCedula\" placeholder=\"Cedula\" required>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label>Ingrese el correo electronico</label>\n");
      out.write("                    <input type=\"email\" class=\"regis\" name=\"usuCorreo\" placeholder=\"Correo Electronico\" required>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label>Ingrese una dirección</label>\n");
      out.write("                    <input type=\"text\" class=\"regis\" name=\"usuDireccion\" placeholder=\"Direccion\" required>\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label>Ingrese una contraseña</label>\n");
      out.write("                    <input type=\"password\" id=\"password\" class=\"regis\" name=\"usuPassword\" placeholder=\"Contraseña\" required>\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <input type=\"button\" value=\"MostrarContraseña\" onclick=\"mostrarContrasena()\" class=\"btn\">\n");
      out.write("\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <label>Ingrese un rol</label>\n");
      out.write("                    <br>\n");
      out.write("                    <select name=\"rolId\"  class=\"custom-select\" aria-label=\"Default select example\">\n");
      out.write("                        <option>Seleccione un Rol...</option>\n");
      out.write("                        ");

                            RolDAO rolDAO = new RolDAO();
                            for (RolVO rolVO : rolDAO.listar()) {
                        
      out.write("\n");
      out.write("                        <option value=\"");
      out.print(rolVO.getRolId());
      out.write('"');
      out.write('>');
      out.print(rolVO.getRolTipo());
      out.write("</option>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </select>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <input type=\"submit\" value=\"Registrar\" class=\"btn\" >\n");
      out.write("\n");
      out.write("                    <input type=\"hidden\" name=\"opcion\" value=\"1\" class=\"btn\">\n");
      out.write("                    <input type=\"hidden\" name=\"rolId\" value=\"1\" class=\"btn\">\n");
      out.write("                </form> \n");
      out.write("                    <br><br>\n");
      out.write("                    ");

                    if (request.getAttribute("mensajeError") != null) {
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mensajeExito}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </div>  \n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <img class=\"image-container\" src=\"images/registro.svg\" alt=\"registro\"> \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"contenedor-footer\">\n");
      out.write("                    <div class=\"content-foo\">\n");
      out.write("                        <h4>Email</h4>\n");
      out.write("                        <p>Techn0.Check0ut@gmail.com</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-foo\">\n");
      out.write("                        <h4>Telefono</h4>\n");
      out.write("                        <p>3142573571</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-foo\">\n");
      out.write("                        <h4>Locación</h4>\n");
      out.write("                        <p>Unilago</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <h2 class=\"titulo-final\">&copy; Outek | Technology Check-Out</h2>\n");
      out.write("            </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
