/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-01-13 07:05:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta name=\"keywords\" content=\"\" />\n");
      out.write("<meta name=\"description\" content=\"\" />\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Automation of Timetable Generation System</title>\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("    <div id=\"menu\">\n");
      out.write("    <ul>\n");
      out.write("    <li><span><a href=\"index.html\">Home</a></span></li>\n");
      out.write("    <li ><a href=\"admin.jsp\">Admin</a></li>\n");
      out.write("	<li class=\"current_page_item\"><a href=\"student.jsp\">Student Login</a></li>\n");
      out.write("  <!--  <li><a href=\"viewtimetable.jsp\">View Time Table</a></li>-->\n");
      out.write("    </ul>\n");
      out.write("    </div>\n");
      out.write("    <!-- end #menu -->\n");
      out.write("    <div id=\"header\">\n");
      out.write("   \n");
      out.write("    <br/><center><p> <font size=\"6\" color=\"black\"><i><b> MIST  Timetable Generation </b></i></font></p></center>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div id=\"splash\">&nbsp;</div>\n");
      out.write("            <!-- end #header -->\n");
      out.write("    <div id=\"page\">\n");
      out.write("    <div id=\"page-bgtop\">\n");
      out.write("    <div id=\"page-bgbtm\">\n");
      out.write("    <div id=\"content\">\n");
      out.write("\n");
      out.write("    <p align=\"justify\">\n");
      out.write("        <center>    \n");
      out.write("    <p><font color=\"red\" size=\"5\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Student Login</font></p>\n");
      out.write("    <form name=\"myform\" action=\"studentact.jsp\" method=\"post\" id=\"\" >\n");
      out.write("    <table width=\"321\">\n");
      out.write("    <tr>\n");
      out.write("    <td height=\"33\"><font color=\"black\">Student ID </td>\n");
      out.write("    <td width=\"218\"><input name=\"username\" autocomplete=\"off\" required=\"\" placeholder=\"User Name\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("    <td height=\"33\"><font color=\"black\">Password </td>\n");
      out.write("    <td width=\"218\"><input type=\"password\" autocomplete=\"off\" name=\"password\" required=\"\" placeholder=\"Password\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("    <td height=\"43\" rowspan=\"3\"></td>\n");
      out.write("    <td align=\"left\" valign=\"middle\">\n");
      out.write("    <p>\n");
      out.write("    <input name=\"submit\" type=\"submit\" value=\"LOGIN\" />\n");
      out.write("    </p>\n");
      out.write("    <div align=\"right\">\n");
      out.write("    </div></td>\n");
      out.write("    </tr>\n");
      out.write("    </table>\n");
      out.write("    </form>\n");
      out.write("        </center>\n");
      out.write("    </p>\n");
      out.write("    <br/><br/>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div style=\"clear: both;\">&nbsp;</div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"footer-wrapper\">\n");
      out.write("\n");
      out.write("    <div id=\"footer\">\n");
      out.write("    <p> Developed by: <a href=\"#\"><font color=\"white\">MIST</a>  </font></p>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
