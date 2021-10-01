package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class interfaces_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../font/css/font-awesome.min.css\">\n");
      out.write("        <link rel='stylesheet prefetch' href='../bootstrap/css/bootstrap.min.css'>\n");
      out.write("        <title>Interfaces</title>\n");
      out.write("    </head>\n");
      out.write("    ");

        String user = "";
        HttpSession objSesion = request.getSession();
        String usuario;
            usuario = objSesion.getAttribute("usuario").toString();
            user = "<label>" + usuario + "</label>";
      
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <h1>Interfaces</h1>\n");
      out.write("        <h1>Bienvenido ");
 out.print(user);
      out.write("</h1>\n");
      out.write("        <h3>El administrador tiene acceso total a todo </h3>\n");
      out.write("        <a href=\"cerrarsesion.jsp\" class=\"btn btn-danger\"><span class=\"fa fa-sign-out\"></span> Cerrar sesion</a>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<div class=\"d-flex flex-column flex-shrink-0 p-3 text-white bg-dark\" style=\"width: 280px;\">\n");
      out.write("    <a href=\"/\" class=\"d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none\">\n");
      out.write("      <svg class=\"bi me-2\" width=\"40\" height=\"32\"><use xlink:href=\"#bootstrap\"></use></svg>\n");
      out.write("      <span class=\"fs-4\">Sidebar</span>\n");
      out.write("    </a>\n");
      out.write("    <hr>\n");
      out.write("    <ul class=\"nav nav-pills flex-column mb-auto\">\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a href=\"#\" class=\"nav-link active\" aria-current=\"page\">\n");
      out.write("          <svg class=\"bi me-2\" width=\"16\" height=\"16\"><use xlink:href=\"#home\"></use></svg>\n");
      out.write("          Home\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"#\" class=\"nav-link text-white\">\n");
      out.write("          <svg class=\"bi me-2\" width=\"16\" height=\"16\"><use xlink:href=\"#speedometer2\"></use></svg>\n");
      out.write("          Dashboard\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"#\" class=\"nav-link text-white\">\n");
      out.write("          <svg class=\"bi me-2\" width=\"16\" height=\"16\"><use xlink:href=\"#table\"></use></svg>\n");
      out.write("          Orders\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"#\" class=\"nav-link text-white\">\n");
      out.write("          <svg class=\"bi me-2\" width=\"16\" height=\"16\"><use xlink:href=\"#grid\"></use></svg>\n");
      out.write("          Products\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("      <li>\n");
      out.write("        <a href=\"#\" class=\"nav-link text-white\">\n");
      out.write("          <svg class=\"bi me-2\" width=\"16\" height=\"16\"><use xlink:href=\"#people-circle\"></use></svg>\n");
      out.write("          Customers\n");
      out.write("        </a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("    <hr>\n");
      out.write("    <div class=\"dropdown\">\n");
      out.write("      <a href=\"#\" class=\"d-flex align-items-center text-white text-decoration-none dropdown-toggle\" id=\"dropdownUser1\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("        <img src=\"https://github.com/mdo.png\" alt=\"\" width=\"32\" height=\"32\" class=\"rounded-circle me-2\">\n");
      out.write("        <strong>mdo</strong>\n");
      out.write("      </a>\n");
      out.write("      <ul class=\"dropdown-menu dropdown-menu-dark text-small shadow\" aria-labelledby=\"dropdownUser1\">\n");
      out.write("        <li><a class=\"dropdown-item\" href=\"#\">New project...</a></li>\n");
      out.write("        <li><a class=\"dropdown-item\" href=\"#\">Settings</a></li>\n");
      out.write("        <li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\n");
      out.write("        <li><hr class=\"dropdown-divider\"></li>\n");
      out.write("        <li><a class=\"dropdown-item\" href=\"#\">Sign out</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>");
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
