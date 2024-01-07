package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import Project.ConnectionProvider;
import java.util.Base64;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html class=\"no-js\" lang=\"zxx\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("    <link rel=\"manifest\" href=\"site.webmanifest\" />\n");
      out.write("    <link\n");
      out.write("      rel=\"shortcut icon\"\n");
      out.write("      type=\"image/x-icon\"\n");
      out.write("      href=\"assets/img/favicon.ico\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <!-- CSS here -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/owl.carousel.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/flaticon.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/price_rangs.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/slicknav.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/animate.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/magnific-popup.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fontawesome-all.min.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/themify-icons.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/slick.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/nice-select.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/style.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/personalcss.css\" />\n");
      out.write("    <link rel=\"stylesheet\" href=\"assets/css/fonts.css\" />\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    <!-- Preloader Start -->\n");
      out.write("    <div id=\"preloader-active\">\n");
      out.write("      <div class=\"preloader d-flex align-items-center justify-content-center\">\n");
      out.write("        <div class=\"preloader-inner position-relative\">\n");
      out.write("          <div class=\"preloader-circle\"></div>\n");
      out.write("          <div class=\"preloader-img pere-text\">\n");
      out.write("            <img src=\"assets/img/logo/logo.png\" alt=\"\" />\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- Preloader Start -->\n");
      out.write("    <header>\n");
      out.write("      <!-- Header Start -->\n");
      out.write("      <div class=\"header-area header-transparrent\">\n");
      out.write("        <div class=\"headder-top header-sticky\">\n");
      out.write("          <div class=\"container\">\n");
      out.write("            <div class=\"row align-items-center\">\n");
      out.write("              <div class=\"col-lg-3 col-md-2\">\n");
      out.write("                  \n");
      out.write("               \n");
      out.write("\n");
      out.write("        <!-- Logo -->\n");
      out.write("        ");

            Connection connection = ConnectionProvider.getConnection();
            String sQuery = "SELECT * FROM Employer WHERE EmployerID = ?";
            session = request.getSession();
            if (session.getAttribute("id") != null) {
                try {
                    String id = session.getAttribute("id").toString();
                    PreparedStatement ps = connection.prepareStatement(sQuery);
                    ps.setString(1, id);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        // Retrieving image data as bytes
                        byte[] imageData = rs.getBytes("company_logo");
                        // Converting image data to Base64
                        String base64Image = Base64.getEncoder().encodeToString(imageData);
        
      out.write("          \n");
      out.write("                    <div class=\"logo\" style=\"width: 100px; right:10px; \">\n");
      out.write("                        <a href=\"");
      out.print( request.getContextPath());
      out.write("/Profile?EmployerID=");
      out.print( rs.getString("EmployerID") );
      out.write("\"\n");
      out.write("                           ><img style=\"width:100%; object-position: center;  \" src='data:image/png;base64, ");
      out.print( base64Image );
      out.write("' alt=\"\"\n");
      out.write("                              /></a>\n");
      out.write("                    </div>\n");
      out.write("        ");
  } else{ 
      out.write("\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                    <a href=\"index.jsp\"\n");
      out.write("                       ><img src=\"assets/img/logo/logo.png\" alt=\"\"\n");
      out.write("                          /></a>\n");
      out.write("                    </div>\n");
      out.write("                   ");
   }

            } catch (Exception e) {
                e.printStackTrace();
          }
      } else { 
      out.write("\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <a href=\"index.jsp\"\n");
      out.write("               ><img src=\"assets/img/logo/logo.png\" alt=\"\"\n");
      out.write("                  /></a>\n");
      out.write("        </div>\n");
      out.write("        ");
 }
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-lg-9 col-md-9\">\n");
      out.write("                <div class=\"menu-wrapper\">\n");
      out.write("                  <!-- Main-menu -->\n");
      out.write("                  <div class=\"main-menu\">\n");
      out.write("                    <nav class=\"d-none d-lg-block\">\n");
      out.write("                      <ul id=\"navigation\">\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"");
      out.print( request.getContextPath());
      out.write("/JobListing\">Find a Jobs </a></li>\n");
      out.write("                        <li><a href=\"about.jsp\">About</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                      </ul>\n");
      out.write("                    </nav>\n");
      out.write("                  </div>\n");
      out.write("                  <!-- Header-btn -->\n");
      out.write("                  ");

                      if(session.getAttribute("id") == null){
                          
                  
      out.write("\n");
      out.write("                  <div class=\"header-btn d-none f-right d-lg-block\">\n");
      out.write("                    <a href=\"signup.jsp\" class=\"btn head-btn1\">Register</a>\n");
      out.write("                    <a href=\"signin.jsp\" class=\"btn head-btn2\">Login</a>\n");
      out.write("                  </div>\n");
      out.write("                  ");
 } else{
      out.write("\n");
      out.write("                  <div class=\"header-btn d-none f-right d-lg-block\">\n");
      out.write("                    <a href=\"");
      out.print( request.getContextPath());
      out.write("/signout\" class=\"btn head-btn1\">Sign Out</a>\n");
      out.write("                  </div>\n");
      out.write("                  ");
 }
      out.write("\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <!-- Mobile Menu -->\n");
      out.write("              <div class=\"col-12\">\n");
      out.write("                <div class=\"mobile_menu d-block d-lg-none\"></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Header End -->\n");
      out.write("    </header>\n");
      out.write("    \n");
      out.write("  </body>\n");
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
