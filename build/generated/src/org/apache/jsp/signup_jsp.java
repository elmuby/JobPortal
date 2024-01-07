package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Signup Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/signin.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"main\">\n");
      out.write("            <div style=\"position: absolute; margin-left: -10cm;\">\n");
      out.write("                <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"32\" width=\"32\" viewBox=\"0 0 512 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path d=\"M512 256A256 256 0 1 0 0 256a256 256 0 1 0 512 0zM231 127c9.4-9.4 24.6-9.4 33.9 0s9.4 24.6 0 33.9l-71 71L376 232c13.3 0 24 10.7 24 24s-10.7 24-24 24l-182.1 0 71 71c9.4 9.4 9.4 24.6 0 33.9s-24.6 9.4-33.9 0L119 273c-9.4-9.4-9.4-24.6 0-33.9L231 127z\"/></svg>\n");
      out.write("            </div>\n");
      out.write("            <h1>SignUp</h1>\n");
      out.write("            <form action=\"signup\" method=\"POST\">\n");
      out.write("                <div class=\"txt_feild\">\n");
      out.write("                    <input name=\"name\" type=\"text\" required>\n");
      out.write("                    <span></span>\n");
      out.write("                    <label for=\"\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"16\" width=\"18\" viewBox=\"0 0 576 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path class=\"img\" d=\"M512 80c8.8 0 16 7.2 16 16V416c0 8.8-7.2 16-16 16H64c-8.8 0-16-7.2-16-16V96c0-8.8 7.2-16 16-16H512zM64 32C28.7 32 0 60.7 0 96V416c0 35.3 28.7 64 64 64H512c35.3 0 64-28.7 64-64V96c0-35.3-28.7-64-64-64H64zM208 256a64 64 0 1 0 0-128 64 64 0 1 0 0 128zm-32 32c-44.2 0-80 35.8-80 80c0 8.8 7.2 16 16 16H304c8.8 0 16-7.2 16-16c0-44.2-35.8-80-80-80H176zM376 144c-13.3 0-24 10.7-24 24s10.7 24 24 24h80c13.3 0 24-10.7 24-24s-10.7-24-24-24H376zm0 96c-13.3 0-24 10.7-24 24s10.7 24 24 24h80c13.3 0 24-10.7 24-24s-10.7-24-24-24H376z\"/></svg>\n");
      out.write("                        FULLNAME</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"txt_feild\">\n");
      out.write("                    <input name=\"email\" type=\"email\" required>\n");
      out.write("                    <span></span>\n");
      out.write("                    <label for=\"\">\n");
      out.write("                        <svg style=\"color:#fb246a;\" xmlns=\"http://www.w3.org/2000/svg\" height=\"16\" width=\"16\" viewBox=\"0 0 512 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path class=\"img\" d=\"M48 64C21.5 64 0 85.5 0 112c0 15.1 7.1 29.3 19.2 38.4L236.8 313.6c11.4 8.5 27 8.5 38.4 0L492.8 150.4c12.1-9.1 19.2-23.3 19.2-38.4c0-26.5-21.5-48-48-48H48zM0 176V384c0 35.3 28.7 64 64 64H448c35.3 0 64-28.7 64-64V176L294.4 339.2c-22.8 17.1-54 17.1-76.8 0L0 176z\"/></svg>\n");
      out.write("                        EMAIL</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"txt_feild\" >\n");
      out.write("                    <label for=\"\">\n");
      out.write("                        <svg style=\"color:#fb246a;\" xmlns=\"http://www.w3.org/2000/svg\" height=\"16\" width=\"16\" viewBox=\"0 0 512 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path class=\"img\" d=\"M48 64C21.5 64 0 85.5 0 112c0 15.1 7.1 29.3 19.2 38.4L236.8 313.6c11.4 8.5 27 8.5 38.4 0L492.8 150.4c12.1-9.1 19.2-23.3 19.2-38.4c0-26.5-21.5-48-48-48H48zM0 176V384c0 35.3 28.7 64 64 64H448c35.3 0 64-28.7 64-64V176L294.4 339.2c-22.8 17.1-54 17.1-76.8 0L0 176z\"/></svg>\n");
      out.write("                        Role</label>\n");
      out.write("                    <select name=\"role\" style=\"width: 100%; \n");
      out.write("                            font-family: 'Barlow', sans-serif;\n");
      out.write("                            padding: 5px;\n");
      out.write("                            height: 40px;\n");
      out.write("                            font-size: 18px;\n");
      out.write("                            border: 2px solid lightgray;\n");
      out.write("                            border-radius: 4px;\n");
      out.write("                            outline: none;\n");
      out.write("                            transition: .5s;\n");
      out.write("                            \" class=\"job_type_option\" data-style=\"btn-black\" data-width=\"100%\" data-live-search=\"true\" title=\"Select Job Type\">\n");
      out.write("                        <option>Role</option>\n");
      out.write("\n");
      out.write("                        <option>Job Seeker</option>\n");
      out.write("                        <option>Employer</option>\n");
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"txt_feild\">\n");
      out.write("                    <input name=\"pass\" type=\"password\" required>\n");
      out.write("                    <span></span>\n");
      out.write("                    <label for=\"\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" height=\"16\" width=\"14\" viewBox=\"0 0 448 512\"><!--!Font Awesome Free 6.5.1 by @fontawesome - https://fontawesome.com License - https://fontawesome.com/license/free Copyright 2024 Fonticons, Inc.--><path class=\"img\"  d=\"M144 144v48H304V144c0-44.2-35.8-80-80-80s-80 35.8-80 80zM80 192V144C80 64.5 144.5 0 224 0s144 64.5 144 144v48h16c35.3 0 64 28.7 64 64V448c0 35.3-28.7 64-64 64H64c-35.3 0-64-28.7-64-64V256c0-35.3 28.7-64 64-64H80z\"/></svg>\n");
      out.write("                        PASSWORD</label>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"submit\" value=\"Signup\">\n");
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
      out.write("                <div class=\"sign_up_link\">\n");
      out.write("                    Already Have an account? <a href=\"signin.jsp\">SignIn</a>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("        </main>\n");
      out.write("        <script>\n");
      out.write("// Wait for the DOM content to load\n");
      out.write("            document.addEventListener('DOMContentLoaded', function () {\n");
      out.write("// Get the email and password input fields\n");
      out.write("                const emailInput = document.querySelector('input[type=\"email\"]');\n");
      out.write("                const passwordInput = document.querySelector('input[type=\"password\"]');\n");
      out.write("\n");
      out.write("// Check if the fields have values (autofill)\n");
      out.write("                if (emailInput.value !== '') {\n");
      out.write("                    emailInput.parentNode.classList.add('active');\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (passwordInput.value !== '') {\n");
      out.write("                    passwordInput.parentNode.classList.add('active');\n");
      out.write("                }\n");
      out.write("\n");
      out.write("// Add event listeners for input focus and blur\n");
      out.write("                [emailInput, passwordInput].forEach(input => {\n");
      out.write("                    input.addEventListener('focus', function () {\n");
      out.write("                        this.parentNode.classList.add('active');\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    input.addEventListener('blur', function () {\n");
      out.write("                        if (this.value === '') {\n");
      out.write("                            this.parentNode.classList.remove('active');\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
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
