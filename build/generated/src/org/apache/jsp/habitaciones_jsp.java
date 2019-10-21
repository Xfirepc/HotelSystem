package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Habitacion;
import java.sql.ResultSet;
import Model.Cliente;
import java.sql.ResultSet;
import Model.User;

public final class habitaciones_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/layout/head.jsp");
    _jspx_dependants.add("/layout/header.jsp");
    _jspx_dependants.add("/layout/footer.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"assets/admin/images/favicon.png\">\n");
      out.write("    <title>Ample Admin Template - The Ultimate Multipurpose admin template</title>\n");
      out.write("    <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/admin/css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/admin/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/admin/css/colors/default.css\" id=\"theme\" rel=\"stylesheet\">\n");
      out.write("    <<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\"/>\n");
      out.write("</head>");
      out.write('\n');
      out.write('\n');
      out.write('\n');

    ResultSet user = null;
    HttpSession getSession = (HttpSession) request.getSession();
    if(getSession.getAttribute("user") == null){
    
      out.write("\n");
      out.write("        <script>window.location = \"index.jsp\"</script>\n");
      out.write("    ");

    }else{
        user = (ResultSet) getSession.getAttribute("user");
    }

      out.write("\n");
      out.write("<body class=\"fix-header\">\n");
      out.write(" \n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Wrapper -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Topbar header - style you can find in pages.scss -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <nav class=\"navbar navbar-default navbar-static-top m-b-0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <div class=\"top-left-part\">\n");
      out.write("                    <!-- Logo -->\n");
      out.write("                    <a class=\"logo\" href=\"dashboard.html\">\n");
      out.write("                        <!-- Logo icon image, you can use font-icon also --><b>\n");
      out.write("                            <!--This is dark logo icon--><img src=\"assets/admin/images/admin-logo.png\" alt=\"home\"\n");
      out.write("                                class=\"dark-logo\" />\n");
      out.write("                            <!--This is light logo icon--><img src=\"assets/admin/images/admin-logo-dark.png\" alt=\"home\"\n");
      out.write("                                class=\"light-logo\" />\n");
      out.write("                        </b>\n");
      out.write("                        <!-- Logo text image you can use text also --><span class=\"hidden-xs\">\n");
      out.write("                            <!--This is dark logo text--><img src=\"assets/admin/images/admin-text.png\" alt=\"home\"\n");
      out.write("                                class=\"dark-logo\" />\n");
      out.write("                            <!--This is light logo text--><img src=\"assets/admin/images/admin-text-dark.png\" alt=\"home\"\n");
      out.write("                                class=\"light-logo\" />\n");
      out.write("                        </span> </a>\n");
      out.write("                </div>\n");
      out.write("                <!-- /Logo -->\n");
      out.write("                <ul class=\"nav navbar-top-links navbar-right pull-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"nav-toggler open-close waves-effect waves-light hidden-md hidden-lg\"\n");
      out.write("                            href=\"javascript:void(0)\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <form role=\"search\" class=\"app-search hidden-sm hidden-xs m-r-10\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Search...\" class=\"form-control\"> <a href=\"\"><i\n");
      out.write("                                    class=\"fa fa-search\"></i></a> </form>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a class=\"profile-pic\" href=\"#\"> <img src=\"https://www.shareicon.net/data/2016/09/01/822711_user_512x512.png\" alt=\"user-img\"\n");
      out.write("                                width=\"36\" class=\"img-circle\"><b class=\"hidden-xs\">Hola, ");
      out.print(user != null ? user.getString("name"): "");
      out.write("</b></a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-header -->\n");
      out.write("            <!-- /.navbar-top-links -->\n");
      out.write("            <!-- /.navbar-static-side -->\n");
      out.write("        </nav>\n");
      out.write("        <!-- End Top Navigation -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Left Sidebar - style you can find in sidebar.scss  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-nav slimscrollsidebar\">\n");
      out.write("                <div class=\"sidebar-head\">\n");
      out.write("                    <h3><span class=\"fa-fw open-close\"><i class=\"ti-close ti-menu\"></i></span> <span\n");
      out.write("                            class=\"hide-menu\">Navigation</span></h3>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                    <li style=\"padding: 70px 0 0;\">\n");
      out.write("                        <a href=\"habitaciones.jsp\" class=\"waves-effect\"><i class=\"fa fa-clock-o fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Habitaciones</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"reservaciones.jsp\" class=\"waves-effect\"><i class=\"fa fa-user fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Reservaciones</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"clientes.jsp\" class=\"waves-effect\"><i class=\"fa fa-table fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Clientes</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"inventario.jsp\" class=\"waves-effect\"><i class=\"fa fa-font fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Inventario</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"usuarios.jsp\" class=\"waves-effect\"><i class=\"fa fa-globe fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Usuarios</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"center p-20\">\n");
      out.write("                    <a href=\"Logout\"\n");
      out.write("                        class=\"btn btn-danger btn-block waves-effect waves-light\">Salir</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- End Left Sidebar -->\n");
      out.write("        <!-- ============================================================== -->");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            \n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row bg-title\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                        <h4 class=\"page-title\">HABITACIONES</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                        <a href=\"https://wrappixel.com/templates/ampleadmin/\" target=\"_blank\"\n");
      out.write("                            class=\"btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light\" data-toggle=\"modal\" data-target=\"#newHab\">Nueva Habitación</a>\n");
      out.write("                            <div class=\"modal fade\" id=\"newHab\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("                                <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("                                  <div class=\"modal-content\">\n");
      out.write("                                    <div class=\"modal-header\">\n");
      out.write("                                      <h5 class=\"modal-title\" id=\"exampleModalLabel\">Nueva habitación</h5>\n");
      out.write("                                      <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                        <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                                      </button>\n");
      out.write("                                    </div>\n");
      out.write("                                    <form class=\"form-horizontal form-material\" action=\"NewRoom\">\n");
      out.write("                                    <div class=\"modal-body\">\n");
      out.write("                                        \n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-md-4\">Código</label>\n");
      out.write("                                                <div class=\"col-md-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control form-control-line\" name=\"codigo\"> \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-md-4\">Nombre</label>\n");
      out.write("                                                <div class=\"col-md-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control form-control-line\" name=\"nombre\"> \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-md-4\">Piso</label>\n");
      out.write("                                                <div class=\"col-md-8\">\n");
      out.write("                                                    <input type=\"number\" class=\"form-control form-control-line\" name=\"piso\"> \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-md-4\">Precio</label>\n");
      out.write("                                                <div class=\"col-md-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control form-control-line\" name=\"precio\"> \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-md-4\">Imagen</label>\n");
      out.write("                                                <div class=\"col-md-8\">\n");
      out.write("                                                    <input type=\"text\" class=\"form-control form-control-line\" name=\"imagen\"> \n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-md-4\">Descripción</label>\n");
      out.write("                                                <div class=\"col-md-8\">\n");
      out.write("                                                    <textarea class=\"form-control form-control-line\" name=\"descripcion\"></textarea>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group row\">\n");
      out.write("                                                <label class=\"col-md-4\">Observaciónes</label>\n");
      out.write("                                                <div class=\"col-md-8\">\n");
      out.write("                                                    <textarea class=\"form-control form-control-line\" name=\"observaciones\"></textarea>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                           \n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-footer\">\n");
      out.write("                                      <a class=\"btn btn-secondary\" data-dismiss=\"modal\">Cerrar</a>\n");
      out.write("                                      <button type=\"submit\" class=\"btn btn-primary\">Crear</button>\n");
      out.write("                                    </div>\n");
      out.write("                                    </form>\n");
      out.write("                                  </div>\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    \n");
      out.write("                    ");

                        Habitacion hab = new Habitacion();
                        ResultSet result = hab.get();
                        while(result.next()){
                    
      out.write("\n");
      out.write("                        <div class=\"col-sm-4 col-xs-12 habitacion\">\n");
      out.write("                            <div class=\"white-box\">\n");
      out.write("                                <div class=\"user-bg\"> <img width=\"100%\" alt=\"user\" src=\"");
      out.print(result.getString("imagen"));
      out.write("\">\n");
      out.write("                                    <div class=\"overlay-box\">\n");
      out.write("                                        <div class=\"user-content\">\n");
      out.write("                                            <a href=\"javascript:void(0)\"><img style=\"border-radius: 50%;\" src=\"");
      out.print(result.getString("imagen"));
      out.write("\"\n");
      out.write("                                                    class=\"thumb-lg img-circle\" alt=\"img\"></a>\n");
      out.write("                                            <h3 class=\"text-white\">");
      out.print(result.getString("nombre"));
      out.write(" - Piso: ");
      out.print(result.getInt("piso"));
      out.write("</h3>\n");
      out.write("                                            <h4 class=\"text-white\">Precio: $");
      out.print(result.getDouble("precio"));
      out.write("</h4>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"user-btm-box\">\n");
      out.write("                                    <b>Descripcion:</b> ");
      out.print(result.getString("descripcion"));
      out.write(" <br>\n");
      out.write("                                    <b>Observaciones:</b> ");
      out.print(result.getString("observaciones"));
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                    ");

                        }
                    
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("     \n");
      out.write(" ");
      out.write("</div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\n");
      out.write("</body>   \n");
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
