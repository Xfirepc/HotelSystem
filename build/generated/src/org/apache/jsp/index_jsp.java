package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Reservaciones de un Hotel</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/styles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container text-center mt-5\"><h1>INGRESO</h1></div>\n");
      out.write("        <div class='loader'>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='window'></div>\n");
      out.write("            <div class='door'></div>\n");
      out.write("            <div class='hotel-sign'>\n");
      out.write("              <span>H</span>\n");
      out.write("              <span>O</span>\n");
      out.write("              <span>T</span>\n");
      out.write("              <span>E</span>\n");
      out.write("              <span>L</span>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\"></div>\n");
      out.write("                <div class=\"col-sm-4 text-center\">\n");
      out.write("                    \n");
      out.write("                <form id=\"init-form\" action=\"RegisterLoginServlet\" method=\"POST\">\n");
      out.write("                    <div class=\"form-group hide name-input\">\n");
      out.write("                      <label for=\"InputName\">Nombre</label>\n");
      out.write("                      <input type=\"text\" class=\"form-control\" id=\"InputName\" name=\"nombre\" aria-describedby=\"emailHelp\" placeholder=\"Ingresa tu nombre\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"InputEmail1\">Email</label>\n");
      out.write("                      <input type=\"email\" class=\"form-control\" id=\"InputEmail1\" name=\"email\" aria-describedby=\"emailHelp\" placeholder=\"Ingresar email\">\n");
      out.write("                      <small id=\"emailHelp\" class=\"form-text text-muted\">Si no tienes cuenta registrate</small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"InputPassword1\">Password</label>\n");
      out.write("                      <input type=\"password\" class=\"form-control\" id=\"InputPassword1\" name=\"pass\" placeholder=\"Clave\">\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Ingresar</button>\n");
      out.write("                  </form>\n");
      out.write("                  <br/>\n");
      out.write("                <button class=\"btn btn-primary btn-register\">Registrarse</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"assets/js/main.js\"></script>\n");
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
