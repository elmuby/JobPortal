package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
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

      out.write('\n');
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
      out.write("                <!-- Logo -->\n");
      out.write("                <div class=\"logo\">\n");
      out.write("                  <a href=\"index.jsp\"\n");
      out.write("                    ><img src=\"assets/img/logo/logo.png\" alt=\"\"\n");
      out.write("                  /></a>\n");
      out.write("                </div>\n");
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

                      if(session.getAttribute("userLoggedIn") == null){
                          
                  
      out.write("\n");
      out.write("                  <div class=\"header-btn d-none f-right d-lg-block\">\n");
      out.write("                    <a href=\"signup.jsp\" class=\"btn head-btn1\">Register</a>\n");
      out.write("                    <a href=\"signin.jsp\" class=\"btn head-btn2\">Login</a>\n");
      out.write("                  </div>\n");
      out.write("                  ");
 } else{
      out.write("\n");
      out.write("                  <div class=\"header-btn d-none f-right d-lg-block\">\n");
      out.write("                    <a href=\"signin.jsp\" class=\"btn head-btn1\">Sign Out</a>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Document</title>\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .profile_img {\n");
      out.write("                width: 200px;\n");
      out.write("                height: 200px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                border-radius: 7px;\n");
      out.write("                border: 3px solid #fb246a;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .profile_img>img {\n");
      out.write("                width: 100%;\n");
      out.write("                object-fit: cover;\n");
      out.write("                object-position: center;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .section_1 {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: space-evenly;\n");
      out.write("                background-color: ghostwhite;\n");
      out.write("                padding: 10px 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .comp_info {\n");
      out.write("                display: flex;\n");
      out.write("                /* align-items: center; */\n");
      out.write("                justify-content: space-evenly;\n");
      out.write("                flex-direction: column;\n");
      out.write("                gap: .5rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .comp_info>h2 {\n");
      out.write("                font-family: exo;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .edit_profile {\n");
      out.write("                font-family: ubuntu;\n");
      out.write("                font-size: 20px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: #fb246a;\n");
      out.write("                border: none;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .location {\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                gap: .5rem;\n");
      out.write("                font-size: 1.5rem;\n");
      out.write("                color: #969595;\n");
      out.write("                font-family: barlow;\n");
      out.write("            }\n");
      out.write("            .location > a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: lightcoral;\n");
      out.write("                transition: .7s;\n");
      out.write("            }\n");
      out.write("            .location > a:hover{\n");
      out.write("                text-decoration: underline;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            .section_2{\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            .jobs_posted{\n");
      out.write("                padding: 5px;\n");
      out.write("                /* background-color:bisque; */\n");
      out.write("                border-bottom: 4px solid #fb246a;\n");
      out.write("                font-family: ubuntu;\n");
      out.write("                font-size: 2rem;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- <h6 style=\"background-color: blanchedalmond; padding: 30px; font-size: 6rem;\">header right here</h6> -->\n");
      out.write("        <br>\n");
      out.write("        <section class=\"section_1\">\n");
      out.write("            <div class=\"comp_info\">\n");
      out.write("                <div class=\"profile_img\">\n");
      out.write("                    <img src='data:image/png;base64, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${base64Image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("'alt=\"Logo\">\n");
      out.write("                </div>\n");
      out.write("                <h2>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${companyName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2>\n");
      out.write("                <p style=\"width: 400px; font-family: Barlow; font-size: 20px; color: #969595;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${company_description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                <p class=\"location\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"20\" width=\"16\"\n");
      out.write("                         viewBox=\"0 0 384 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.-->\n");
      out.write("                    <path fill=\"#969595\"\n");
      out.write("                          d=\"M215.7 499.2C267 435 384 279.4 384 192C384 86 298 0 192 0S0 86 0 192c0 87.4 117 243 168.3 307.2c12.3 15.3 35.1 15.3 47.4 0zM192 128a64 64 0 1 1 0 128 64 64 0 1 1 0-128z\" />\n");
      out.write("                    </svg>\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${company_location}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                </p>\n");
      out.write("                <div class=\"location\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"16\" width=\"16\"\n");
      out.write("                         viewBox=\"0 0 512 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.-->\n");
      out.write("                    <path fill=\"#969595\"\n");
      out.write("                          d=\"M164.9 24.6c-7.7-18.6-28-28.5-47.4-23.2l-88 24C12.1 30.2 0 46 0 64C0 311.4 200.6 512 448 512c18 0 33.8-12.1 38.6-29.5l24-88c5.3-19.4-4.6-39.7-23.2-47.4l-96-40c-16.3-6.8-35.2-2.1-46.3 11.6L304.7 368C234.3 334.7 177.3 277.7 144 207.3L193.3 167c13.7-11.2 18.4-30 11.6-46.3l-40-96z\" />\n");
      out.write("                    </svg>\n");
      out.write("                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${company_phoneNo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"location\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"16\" width=\"20\"\n");
      out.write("                         viewBox=\"0 0 640 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.-->\n");
      out.write("                    <path fill=\"#969595\"\n");
      out.write("                          d=\"M579.8 267.7c56.5-56.5 56.5-148 0-204.5c-50-50-128.8-56.5-186.3-15.4l-1.6 1.1c-14.4 10.3-17.7 30.3-7.4 44.6s30.3 17.7 44.6 7.4l1.6-1.1c32.1-22.9 76-19.3 103.8 8.6c31.5 31.5 31.5 82.5 0 114L422.3 334.8c-31.5 31.5-82.5 31.5-114 0c-27.9-27.9-31.5-71.8-8.6-103.8l1.1-1.6c10.3-14.4 6.9-34.4-7.4-44.6s-34.4-6.9-44.6 7.4l-1.1 1.6C206.5 251.2 213 330 263 380c56.5 56.5 148 56.5 204.5 0L579.8 267.7zM60.2 244.3c-56.5 56.5-56.5 148 0 204.5c50 50 128.8 56.5 186.3 15.4l1.6-1.1c14.4-10.3 17.7-30.3 7.4-44.6s-30.3-17.7-44.6-7.4l-1.6 1.1c-32.1 22.9-76 19.3-103.8-8.6C74 372 74 321 105.5 289.5L217.7 177.2c31.5-31.5 82.5-31.5 114 0c27.9 27.9 31.5 71.8 8.6 103.9l-1.1 1.6c-10.3 14.4-6.9 34.4 7.4 44.6s34.4 6.9 44.6-7.4l1.1-1.6C433.5 260.8 427 182 377 132c-56.5-56.5-148-56.5-204.5 0L60.2 244.3z\" />\n");
      out.write("                    </svg>\n");
      out.write("                    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${company_website}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${company_website}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"");
      out.print( request.getContextPath());
      out.write("/EditProfile\">\n");
      out.write("                <button class=\"edit_profile\">\n");
      out.write("                    Edit Profile\n");
      out.write("                </button>\n");
      out.write("            </a>\n");
      out.write("        </section>\n");
      out.write("        <section class=\"section_2\">\n");
      out.write("            <div class=\"jobs_posted\">Jobs Posted</div>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <div class=\"single-job-items mb-30\">\n");
      out.write("                    <div class=\"job-items\">\n");
      out.write("                        <div class=\"company-img\">\n");
      out.write("                            <a href=\"job_details.html\"><img src=\"assets/img/icon/job-list1.png\" alt=\"\"></a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"job-tittle\">\n");
      out.write("                            <a href=\"job_details.html\"><h4>Digital Marketer</h4></a>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>Creative Agency</li>\n");
      out.write("                                <li><i class=\"fas fa-map-marker-alt\"></i>Athens, Greece</li>\n");
      out.write("                                <li>$3500 - $4000</li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"items-link f-right\">\n");
      out.write("                        <a href=\"job_details.html\">Full Time</a>\n");
      out.write("                        <a href=\"job_details.html\">Edit</a>\n");
      out.write("                        <a href=\"job_details.html\">Delete</a>\n");
      out.write("                        <span>7 hours ago</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\" />\n");
      out.write("    <title>Job board HTML-5 Template</title>\n");
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
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("    \n");
      out.write("    <footer>\n");
      out.write("      <!-- Footer Start-->\n");
      out.write("      <div class=\"footer-area footer-bg footer-padding\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row d-flex justify-content-between\">\n");
      out.write("            <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-6\">\n");
      out.write("              <div class=\"single-footer-caption mb-50\">\n");
      out.write("                <div class=\"single-footer-caption mb-30\">\n");
      out.write("                  <div class=\"footer-tittle\">\n");
      out.write("                    <h4>About Us</h4>\n");
      out.write("                    <div class=\"footer-pera\">\n");
      out.write("                      <p>\n");
      out.write("                        Heaven frucvitful doesn't cover lesser dvsays appear\n");
      out.write("                        creeping seasons so behold.\n");
      out.write("                      </p>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("              <div class=\"single-footer-caption mb-50\">\n");
      out.write("                <div class=\"footer-tittle\">\n");
      out.write("                  <h4>Contact Info</h4>\n");
      out.write("                  <ul>\n");
      out.write("                    <li>\n");
      out.write("                      <p>Address :Your address goes here, your demo address.</p>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Phone : +8880 44338899</a></li>\n");
      out.write("                    <li><a href=\"#\">Email : info@colorlib.com</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("              <div class=\"single-footer-caption mb-50\">\n");
      out.write("                <div class=\"footer-tittle\">\n");
      out.write("                  <h4>Important Link</h4>\n");
      out.write("                  <ul>\n");
      out.write("                    <li><a href=\"#\"> View Project</a></li>\n");
      out.write("                    <li><a href=\"#\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"#\">Testimonial</a></li>\n");
      out.write("                    <li><a href=\"#\">Proparties</a></li>\n");
      out.write("                    <li><a href=\"#\">Support</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("              <div class=\"single-footer-caption mb-50\">\n");
      out.write("                <div class=\"footer-tittle\">\n");
      out.write("                  <h4>Newsletter</h4>\n");
      out.write("                  <div class=\"footer-pera footer-pera2\">\n");
      out.write("                    <p>\n");
      out.write("                      Heaven fruitful doesn't over lesser in days. Appear\n");
      out.write("                      creeping.\n");
      out.write("                    </p>\n");
      out.write("                  </div>\n");
      out.write("                  <!-- Form -->\n");
      out.write("                  <div class=\"footer-form\">\n");
      out.write("                    <div id=\"mc_embed_signup\">\n");
      out.write("                      <form\n");
      out.write("                        target=\"_blank\"\n");
      out.write("                        action=\"https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01\"\n");
      out.write("                        method=\"get\"\n");
      out.write("                        class=\"subscribe_form relative mail_part\"\n");
      out.write("                      >\n");
      out.write("                        <input\n");
      out.write("                          type=\"email\"\n");
      out.write("                          name=\"email\"\n");
      out.write("                          id=\"newsletter-form-email\"\n");
      out.write("                          placeholder=\"Email Address\"\n");
      out.write("                          class=\"placeholder hide-on-focus\"\n");
      out.write("                          onfocus=\"this.placeholder = ''\"\n");
      out.write("                          onblur=\"this.placeholder = ' Email Address '\"\n");
      out.write("                        />\n");
      out.write("                        <div class=\"form-icon\">\n");
      out.write("                          <button\n");
      out.write("                            type=\"submit\"\n");
      out.write("                            name=\"submit\"\n");
      out.write("                            id=\"newsletter-submit\"\n");
      out.write("                            class=\"email_icon newsletter-submit button-contactForm\"\n");
      out.write("                          >\n");
      out.write("                            <img src=\"assets/img/icon/form.png\" alt=\"\" />\n");
      out.write("                          </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mt-10 info\"></div>\n");
      out.write("                      </form>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!--  -->\n");
      out.write("          <div class=\"row footer-wejed justify-content-between\">\n");
      out.write("            <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-6\">\n");
      out.write("              <!-- logo -->\n");
      out.write("              <div class=\"footer-logo mb-20\">\n");
      out.write("                <a href=\"index.jsp\"\n");
      out.write("                  ><img src=\"assets/img/logo/logo2_footer.png\" alt=\"\"\n");
      out.write("                /></a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("              <div class=\"footer-tittle-bottom\">\n");
      out.write("                <span>5000+</span>\n");
      out.write("                <p>Talented Hunter</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("              <div class=\"footer-tittle-bottom\">\n");
      out.write("                <span>451</span>\n");
      out.write("                <p>Talented Hunter</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-xl-3 col-lg-3 col-md-4 col-sm-5\">\n");
      out.write("              <!-- Footer Bottom Tittle -->\n");
      out.write("              <div class=\"footer-tittle-bottom\">\n");
      out.write("                <span>568</span>\n");
      out.write("                <p>Talented Hunter</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- footer-bottom area -->\n");
      out.write("      <div class=\"footer-bottom-area footer-bg\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"footer-border\">\n");
      out.write("            <div class=\"row d-flex justify-content-between align-items-center\">\n");
      out.write("              <div class=\"col-xl-10 col-lg-10\">\n");
      out.write("                <div class=\"footer-copy-right\">\n");
      out.write("                  <p>\n");
      out.write("                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                    Copyright &copy;\n");
      out.write("                    <script>\n");
      out.write("                      document.write(new Date().getFullYear());\n");
      out.write("                    </script>\n");
      out.write("                    All rights reserved | This template is made with\n");
      out.write("                    <i class=\"fa fa-heart\" aria-hidden=\"true\"></i> by\n");
      out.write("                    <a href=\"https://colorlib.com\" target=\"_blank\">Colorlib</a>\n");
      out.write("                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("                  </p>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-xl-2 col-lg-2\">\n");
      out.write("                <div class=\"footer-social f-right\">\n");
      out.write("                  <a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                  <a href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                  <a href=\"#\"><i class=\"fas fa-globe\"></i></a>\n");
      out.write("                  <a href=\"#\"><i class=\"fab fa-behance\"></i></a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Footer End-->\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!-- JS here -->\n");
      out.write("\n");
      out.write("    <!-- All JS Custom Plugins Link Here here -->\n");
      out.write("    <script src=\"./assets/js/vendor/modernizr-3.5.0.min.js\"></script>\n");
      out.write("    <!-- Jquery, Popper, Bootstrap -->\n");
      out.write("    <script src=\"./assets/js/vendor/jquery-1.12.4.min.js\"></script>\n");
      out.write("    <script src=\"./assets/js/popper.min.js\"></script>\n");
      out.write("    <script src=\"./assets/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Jquery Mobile Menu -->\n");
      out.write("    <script src=\"./assets/js/jquery.slicknav.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Jquery Slick , Owl-Carousel Plugins -->\n");
      out.write("    <script src=\"./assets/js/owl.carousel.min.js\"></script>\n");
      out.write("    <script src=\"./assets/js/slick.min.js\"></script>\n");
      out.write("    <script src=\"./assets/js/price_rangs.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- One Page, Animated-HeadLin -->\n");
      out.write("    <script src=\"./assets/js/wow.min.js\"></script>\n");
      out.write("    <script src=\"./assets/js/animated.headline.js\"></script>\n");
      out.write("    <script src=\"./assets/js/jquery.magnific-popup.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Scrollup, nice-select, sticky -->\n");
      out.write("    <script src=\"./assets/js/jquery.scrollUp.min.js\"></script>\n");
      out.write("    <script src=\"./assets/js/jquery.nice-select.min.js\"></script>\n");
      out.write("    <script src=\"./assets/js/jquery.sticky.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- contact js -->\n");
      out.write("    <script src=\"./assets/js/contact.js\"></script>\n");
      out.write("    <script src=\"./assets/js/jquery.form.js\"></script>\n");
      out.write("    <script src=\"./assets/js/jquery.validate.min.js\"></script>\n");
      out.write("    <script src=\"./assets/js/mail-script.js\"></script>\n");
      out.write("    <script src=\"./assets/js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Jquery Plugins, main Jquery -->\n");
      out.write("    <script src=\"./assets/js/plugins.js\"></script>\n");
      out.write("    <script src=\"./assets/js/main.js\"></script>\n");
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
