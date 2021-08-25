package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.db.connect;
import java.sql.Connection;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" ></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"StyleSheet.css\" />\n");
      out.write("        <title>Sign In</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: linear-gradient(to right top, #051937, #004d7a, #008793, #00bf72, #a8eb12); background-repeat: no-repeat; background-attachment:fixed; background-size: cover;\">\n");
      out.write("        <section id=\"nav-bar\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\"><img src=\"picture/logo.png\" /></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Home.html\">HOME</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Home.html\">ABOUT US</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Home.html\">SERVICES</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"Home.html\">TEAM</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">PRICE PLANS</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#testimonials\">TESTIMONIALS</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#contact\">CONTACT US</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"SignUp\">SIGN UP</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#\">SIGN IN</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </section>\n");
      out.write("        ");

            Connection con=connect.getConnection();
            out.println(con);
        
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row mt-5\">\n");
      out.write("                <div class=\"col-md-4 offset-md-4\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-header text-center c-head text-white\">\n");
      out.write("                            <i class=\"fa fa-user-o fa-2x\"></i>\n");
      out.write("                            <h5>SIGN IN</h5>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            String logoutMSG=(String)session.getAttribute("logout-msg");
                            if(logoutMSG!=null)
                        {
      out.write("\n");
      out.write("                        \n");
      out.write("                        <div class=\"alert alert-success\" role=\"alert\">");
      out.print( logoutMSG );
      out.write("></div>  \n");
      out.write("                        \n");
      out.write("                        ");
 session.removeAttribute("logout-msg");          }
                              
                        
      out.write("\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <form action=\"servletlogin\" method=\"post\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"exampleInputEmail1\">Enter Email address</label>\n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" name=\"email\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"exampleInputPassword1\">Enter Password</label>\n");
      out.write("                                    <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"password\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary btn-block badge-pill\">Sign In</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <br />\n");
      out.write("        <section id=\"footer\">\n");
      out.write("            <div class=\"container text-center\">\n");
      out.write("                <p>Made With<i class=\"fa fa-heart-o\"></i>By LogicoItech</p>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
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
