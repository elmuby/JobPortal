package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/signin.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"main\">\n");
      out.write("            <h1 id=\"your_email\" >LOGIN</h1>\n");
      out.write("            <form action=\"signin\" method=\"POST\" >\n");
      out.write("                <div class=\"txt_feild\">\n");
      out.write("                    <input name=\"your_email\" type=\"email\" required>\n");
      out.write("                    <span></span>\n");
      out.write("                    <label for=\"\"><svg style=\"color:#fb246a;\" xmlns=\"http://www.w3.org/2000/svg\" height=\"16\" width=\"16\" viewBox=\"0 0 512 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path class=\"img\" d=\"M48 64C21.5 64 0 85.5 0 112c0 15.1 7.1 29.3 19.2 38.4L236.8 313.6c11.4 8.5 27 8.5 38.4 0L492.8 150.4c12.1-9.1 19.2-23.3 19.2-38.4c0-26.5-21.5-48-48-48H48zM0 176V384c0 35.3 28.7 64 64 64H448c35.3 0 64-28.7 64-64V176L294.4 339.2c-22.8 17.1-54 17.1-76.8 0L0 176z\"/></svg> EMAIL</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"txt_feild\">\n");
      out.write("                    <input name=\"your_pass\" type=\"password\" required>\n");
      out.write("                    <span></span>\n");
      out.write("                    <label for=\"\"> <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"16\" width=\"14\" viewBox=\"0 0 448 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path class=\"img\"  d=\"M144 144v48H304V144c0-44.2-35.8-80-80-80s-80 35.8-80 80zM80 192V144C80 64.5 144.5 0 224 0s144 64.5 144 144v48h16c35.3 0 64 28.7 64 64V448c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V256c0-35.3 28.7-64 64-64H80z\"/></svg> PASSWORD</label>\n");
      out.write("                </div>\n");
      out.write("                ");

                    // Check for the presence of the error message
                    String errorMessage = (String) request.getAttribute("errorMessage");
                    if (errorMessage != null) {
                
      out.write("\n");
      out.write("                <p style=\"font-size: 1.2rem; font-family: barlow; text-align: center; color: #fb246a;\">");
      out.print( errorMessage);
      out.write("</p>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <div class=\"pass\">FORGOT PASSWORD?\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" value=\"login\">\n");
      out.write("                <div class=\"sign_up_link\">\n");
      out.write("                    Not a Member? <a href=\"signup.jsp\">signup</a>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </main>\n");
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
