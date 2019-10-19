package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Model.Habitacion;

public final class habitaciones_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link href=\"assets/admin/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/admin/css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/admin/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"assets/admin/css/colors/default.css\" id=\"theme\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<![endif]-->\n");
      out.write("</head>\n");
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
      out.write("                        <a class=\"profile-pic\" href=\"#\"> <img src=\"assets/admin/images/users/varun.jpg\" alt=\"user-img\"\n");
      out.write("                                width=\"36\" class=\"img-circle\"><b class=\"hidden-xs\">Steave</b></a>\n");
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
      out.write("                        <a href=\"dashboard.html\" class=\"waves-effect\"><i class=\"fa fa-clock-o fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Dashboard</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"profile.html\" class=\"waves-effect\"><i class=\"fa fa-user fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Profile</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"basic-table.html\" class=\"waves-effect\"><i class=\"fa fa-table fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Basic Table</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"fontawesome.html\" class=\"waves-effect\"><i class=\"fa fa-font fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Icons</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"map-google.html\" class=\"waves-effect\"><i class=\"fa fa-globe fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Google Map</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"blank.html\" class=\"waves-effect\"><i class=\"fa fa-columns fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Blank Page</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"404.html\" class=\"waves-effect\"><i class=\"fa fa-info-circle fa-fw\"\n");
      out.write("                                aria-hidden=\"true\"></i>Error 404</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"center p-20\">\n");
      out.write("                    <a href=\"https://wrappixel.com/templates/ampleadmin/\" target=\"_blank\"\n");
      out.write("                        class=\"btn btn-danger btn-block waves-effect waves-light\">Upgrade to Pro</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- End Left Sidebar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row bg-title\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                        <h4 class=\"page-title\">Blank Page</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                        <a href=\"https://wrappixel.com/templates/ampleadmin/\" target=\"_blank\"\n");
      out.write("                            class=\"btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light\">Upgrade\n");
      out.write("                            to Pro</a>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("                            <li class=\"active\">Blank Page</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <h3 class=\"box-title\">Blank Page</h3>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("            <footer class=\"footer text-center\"> 2017 &copy; Ample Admin brought to you by wrappixel.com </footer>\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- End Page Content -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("    </div>\n");
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
