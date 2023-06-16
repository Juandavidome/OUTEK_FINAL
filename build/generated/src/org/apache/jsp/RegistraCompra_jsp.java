package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ModeloVO.ProductoVO;
import ModeloDAO.ProductoDAO;

public final class RegistraCompra_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
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
      out.write("        <!--<link href=\"css/IniSes.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <!--<link href=\"css/RegisCliente.css\" rel=\"stylesheet\" type=\"text/css\"/>-->\n");
      out.write("        <link href=\"css/formConsul.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/Compra.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/PagPrincipal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"js/mostrarContraseña.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Outek</title>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("        <script src=\"sweetalert2.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"sweetalert2.min.css\">\n");
      out.write("        <style>\n");
      out.write("            @media print{\n");
      out.write("                .consul-compra, .consul-compra-pro, header, .button-container {\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            window.addEventListener('load', function() {\n");
      out.write("            var currentDate = new Date().toISOString().slice(0, 10);\n");
      out.write("            document.getElementById(\"fecha-actual\").innerHTML = currentDate;\n");
      out.write("            document.getElementById(\"PedFecha\").value = currentDate;\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("           function searchProducts() {\n");
      out.write("    var input = document.getElementById(\"searchInput\");\n");
      out.write("    var filter = input.value.toUpperCase();\n");
      out.write("    var select = document.querySelector(\"select[name='codigoproducto']\");\n");
      out.write("    var options = select.getElementsByTagName(\"option\");\n");
      out.write("    for (var i = 0; i < options.length; i++) {\n");
      out.write("        var option = options[i];\n");
      out.write("        var txtValue = option.textContent || option.innerText;\n");
      out.write("        if (txtValue.toUpperCase().indexOf(filter) > -1) {\n");
      out.write("            option.style.display = \"\";\n");
      out.write("        } else {\n");
      out.write("            option.style.display = \"none\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <a href=\"PersonalDeVentas.jsp\">Inicio</a> \n");
      out.write("                <a href=\"ConsultarProducto.jsp\">Consulta de Productos</a>\n");
      out.write("                <a href=\"RegistrarProducto.jsp\">Registro de Productos</a>\n");
      out.write("                <a href=\"RegistraCompra.jsp\">Registro de Ventas</a>\n");
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
      out.write("\n");
      out.write("        <form action=\"PedidoControlador2?menu=NuevaVenta\" method=\"POST\">\n");
      out.write("            <label id=\"fecha\"> </label>\n");
      out.write("            <script>\n");
      out.write("                var date = new Date().toLocaleDateString();\n");
      out.write("                document.getElementById(\"fecha\").innerHTML = \"Fecha: \" + date;\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("\n");
      out.write("            <div class=\"consul-compra\">\n");
      out.write("                <h1 class=\"titleConsulCom\">Datos del Cliente</h1>\n");
      out.write("                <br>\n");
      out.write("                <label>Ingrese la Cedula del cliente</label>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"text\" name=\"codigocliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getUsuCedula()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"ConsulInputCom\" placeholder=\"Cedula Cliente\" onkeypress=\"return SoloNumeros2(event);\">\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"BuscarCliente\" class=\"btnConsulCom\">\n");
      out.write("                <br>\n");
      out.write("                <label>Nombre del Cliente</label>\n");
      out.write("                <input type=\"text\" name=\"nombrescliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cliente.getUsuNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"ConsulInputCom\" placeholder=\"Nombre Cliente\" readonly onmousedown=\"return false;\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <div class=\"consul-compra-pro\">\n");
      out.write("                <h1 class=\"titleConsulCom\">Datos del Producto</h1>\n");
      out.write("                <br>\n");
      out.write("                <label>Nombre del Producto</label>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"text\" id=\"searchInput\" onkeyup=\"searchProducts()\" placeholder=\"Buscar productos...\" class=\"ConsulInputCom\">\n");
      out.write("                <br>\n");
      out.write("                <select name=\"codigoproducto\" class=\"custom-select\" aria-label=\"Default select example\">\n");
      out.write("                    <option>Seleccione un Producto...</option>\n");
      out.write("                    ");

                        ProductoDAO proDAO = new ProductoDAO();
                        for (ProductoVO proVO : proDAO.listarPedido()) {
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(proVO.getProId());
      out.write('"');
      out.write('>');
      out.print(proVO.getProNombre());
      out.write("</option>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </select>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"BuscarProducto\" class=\"btnConsulCom\">\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <label>ID del Producto</label>\n");
      out.write("                <input type=\"text\" name=\"PedProId2\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"ConsulInputCom\" placeholder=\"ID Del Producto\" readonly onmousedown=\"return false;\">\n");
      out.write("                <br>\n");
      out.write("                <label>Nombre del Producto</label>\n");
      out.write("                <input type=\"text\" name=\"nombreproducto\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"ConsulInputCom\" placeholder=\"Nombre Producto\" readonly onmousedown=\"return false;\">\n");
      out.write("                <br>\n");
      out.write("                <label>Precio del Producto</label>\n");
      out.write("                <input type=\"text\" name=\"precio\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProPrecioVenta()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"ConsulInputCom\" placeholder=\"S/.0.00\" readonly onmousedown=\"return false;\">\n");
      out.write("                <br>\n");
      out.write("                <label>Ingrese la cantidad que desea</label>\n");
      out.write("                <input type=\"number\" name=\"cant\" id=\"cantidad\" class=\"ConsulInputCom\" placeholder=\"Cantidad\" value=\"\" onkeypress=\"return SoloNumeros2(event);\">\n");
      out.write("                <br>\n");
      out.write("                <label>Stock</label>\n");
      out.write("                <input type=\"text\" name=\"stock\" id=\"stock\" class=\"ConsulInputCom\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.getProCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Stock\" readonly onmousedown=\"return false;\">\n");
      out.write("\n");
      out.write("                <br>\n");
      out.write("                <input type=\"submit\" name=\"accion\" value=\"Agregar\" class=\"btnConsulCom\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"containerVenta\">\n");
      out.write("            <br>\n");
      out.write("            <label >NroSerie: </label>\n");
      out.write("            <input type=\"text\" name=\"NroSerie\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nserie}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"ConsulInputCom\" readonly onmousedown=\"return false;\">\n");
      out.write("\n");
      out.write("            <table >\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Nro</th>\n");
      out.write("                        <th>Codigo</th>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Precio</th>\n");
      out.write("                        <th>Cantidad</th>\n");
      out.write("                        <th>SubTotal</th>\n");
      out.write("                        <th>Acciones</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            <div class=\"button-container\">\n");
      out.write("                <a href=\"PedidoControlador2?menu=NuevaVenta&accion=GenerarVenta\"  onclick=\"print()\" class=\"btnReact\">Generar Venta</a>\n");
      out.write("                <a href=\"PedidoControlador2?menu=NuevaVenta&accion=CancelarOrden\"  class=\"btn\">Cancelar Venta</a>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <label>Total a pagar</label>\n");
      out.write("            <input type=\"text\" name=\"txtTotal\" value=\"S/. ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalpagar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("0\" class=\"ConsulInputCom\" readonly onmousedown=\"return false;\">\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                const cantidadInput = document.getElementById('cantidad');\n");
      out.write("                const stockInput = document.getElementById('stock');\n");
      out.write("                cantidadInput.addEventListener('input', function() {\n");
      out.write("                const cantidad = parseInt(cantidadInput.value);\n");
      out.write("                const stock = parseInt(stockInput.value);\n");
      out.write("                if (cantidad > stock) {\n");
      out.write("                cantidadInput.value = stock;\n");
      out.write("                }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("list");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <tr>\n");
          out.write("                            <td data-titulo=\"Item\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getItem()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td data-titulo=\"producto\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getIdProducto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td data-titulo=\"descripcion\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td data-titulo=\"precio\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td data-titulo=\"cantidad\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getCantidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td data-titulo=\"SubTotal\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.getSubTotal()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                            <td>\n");
          out.write("                                <a href=\"PedidoControlador2?menu=NuevaVenta&accion=Eliminar&indice=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.item}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn\" style=\"margin-left: 10px\">Eliminar</a>\n");
          out.write("                            </td>\n");
          out.write("                        </tr>\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
