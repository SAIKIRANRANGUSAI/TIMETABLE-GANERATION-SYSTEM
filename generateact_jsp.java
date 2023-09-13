/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.73
 * Generated at: 2022-01-06 03:25:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.sql.*;
import java.util.*;

public final class generateact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/connect.jsp", Long.valueOf(1640600254000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
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

      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");

	Connection connection = null;
 	try {
     	
	  	Class.forName("com.mysql.jdbc.Driver");	
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","root","");
      	String sql="";

	}
	catch(Exception e)
	{
		System.out.println(e);
	}

      out.write("\n");
      out.write("\n");
      out.write("    ");

    
    String yr = request.getParameter("year");
    int year = Integer.parseInt(yr);
         
    try{
    
    String stringArray[];    
    stringArray = new String[6];
    int i =0;
    
    if(year==1){    
    String query = "select * from first ";
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);  
    
    while(rs.next()){
    stringArray[i] = rs.getString("subject");
    i++;
    }
    
    PreparedStatement ps=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps.setString(1,"1st");
    ps.setString(2,stringArray[0]);
    ps.setString(3,stringArray[1]);
    ps.setString(4,stringArray[2]);
    ps.setString(5,stringArray[3]);
    ps.setString(6,stringArray[4]);
    ps.setString(7,stringArray[5]);
    ps.setString(8,yr);
    ps.executeUpdate();
    
    
    PreparedStatement ps1=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps1.setString(1,"2nd");
    ps1.setString(2,stringArray[1]);
    ps1.setString(3,stringArray[2]);
    ps1.setString(4,stringArray[3]);
    ps1.setString(5,stringArray[4]);
    ps1.setString(6,stringArray[5]);
    ps1.setString(7,stringArray[0]);
    ps1.setString(8,yr);
    ps1.executeUpdate();
    
    
    PreparedStatement ps2=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps2.setString(1,"3rd");
    ps2.setString(2,stringArray[2]);
    ps2.setString(3,stringArray[3]);
    ps2.setString(4,stringArray[4]);
    ps2.setString(5,stringArray[5]);
    ps2.setString(6,stringArray[0]);
    ps2.setString(7,stringArray[1]);
    ps2.setString(8,yr);
    ps2.executeUpdate();
    
    
    PreparedStatement ps3=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps3.setString(1,"4th");
    ps3.setString(2,stringArray[3]);
    ps3.setString(3,stringArray[4]);
    ps3.setString(4,stringArray[5]);
    ps3.setString(5,stringArray[0]);
    ps3.setString(6,stringArray[1]);
    ps3.setString(7,stringArray[2]);
    ps3.setString(8,yr);
    ps3.executeUpdate();
    
    
    PreparedStatement ps4=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps4.setString(1,"5th");
    ps4.setString(2,stringArray[4]);
    ps4.setString(3,stringArray[5]);
    ps4.setString(4,stringArray[0]);
    ps4.setString(5,stringArray[1]);
    ps4.setString(6,stringArray[2]);
    ps4.setString(7,stringArray[3]);
    ps4.setString(8,yr);
    ps4.executeUpdate();
    
    PreparedStatement ps5=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps5.setString(1,"6th");
    ps5.setString(2,stringArray[5]);
    ps5.setString(3,stringArray[0]);
    ps5.setString(4,stringArray[1]);
    ps5.setString(5,stringArray[2]);
    ps5.setString(6,stringArray[3]);
    ps5.setString(7,stringArray[4]);
    ps5.setString(8,yr);
    ps5.executeUpdate();
    
    PreparedStatement ps6=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps6.setString(1,"7th");
    ps6.setString(2,stringArray[0]);
    ps6.setString(3,stringArray[1]);
    ps6.setString(4,stringArray[2]);
    ps6.setString(5,stringArray[3]);
    ps6.setString(6,stringArray[4]);
    ps6.setString(7,stringArray[5]);
    ps6.setString(8,yr);
    ps6.executeUpdate();
        
    response.sendRedirect("generate.jsp?msg=Success");
        
    }
    if(year==2){    
    String query = "select * from second ";
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);  
    
    while(rs.next()){
    stringArray[i] = rs.getString("subject");
    i++;
    }
    
    PreparedStatement ps=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps.setString(1,"1st");
    ps.setString(2,stringArray[1]);
    ps.setString(3,stringArray[2]);
    ps.setString(4,stringArray[3]);
    ps.setString(5,stringArray[4]);
    ps.setString(6,stringArray[5]);
    ps.setString(7,stringArray[0]);
    ps.setString(8,yr);
    ps.executeUpdate();
    
    
    PreparedStatement ps1=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps1.setString(1,"2nd");
    ps1.setString(2,stringArray[2]);
    ps1.setString(3,stringArray[3]);
    ps1.setString(4,stringArray[4]);
    ps1.setString(5,stringArray[5]);
    ps1.setString(6,stringArray[0]);
    ps1.setString(7,stringArray[1]);
    ps1.setString(8,yr);
    ps1.executeUpdate();
    
    
    PreparedStatement ps2=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps2.setString(1,"3rd");
    ps2.setString(2,stringArray[3]);
    ps2.setString(3,stringArray[4]);
    ps2.setString(4,stringArray[5]);
    ps2.setString(5,stringArray[0]);
    ps2.setString(6,stringArray[1]);
    ps2.setString(7,stringArray[2]);
    ps2.setString(8,yr);
    ps2.executeUpdate();
    
    
    PreparedStatement ps3=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps3.setString(1,"4th");
    ps3.setString(2,stringArray[4]);
    ps3.setString(3,stringArray[5]);
    ps3.setString(4,stringArray[0]);
    ps3.setString(5,stringArray[1]);
    ps3.setString(6,stringArray[2]);
    ps3.setString(7,stringArray[3]);
    ps3.setString(8,yr);
    ps3.executeUpdate();
    
    
    PreparedStatement ps4=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps4.setString(1,"5th");
    ps4.setString(2,stringArray[5]);
    ps4.setString(3,stringArray[0]);
    ps4.setString(4,stringArray[1]);
    ps4.setString(5,stringArray[2]);
    ps4.setString(6,stringArray[3]);
    ps4.setString(7,stringArray[4]);
    ps4.setString(8,yr);
    ps4.executeUpdate();
    
    PreparedStatement ps5=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps5.setString(1,"6th");
    ps5.setString(2,stringArray[0]);
    ps5.setString(3,stringArray[1]);
    ps5.setString(4,stringArray[2]);
    ps5.setString(5,stringArray[3]);
    ps5.setString(6,stringArray[4]);
    ps5.setString(7,stringArray[5]);
    ps5.setString(8,yr);
    ps5.executeUpdate();
    
    PreparedStatement ps6=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps6.setString(1,"7th");
    ps6.setString(2,stringArray[1]);
    ps6.setString(3,stringArray[2]);
    ps6.setString(4,stringArray[3]);
    ps6.setString(5,stringArray[4]);
    ps6.setString(6,stringArray[5]);
    ps6.setString(7,stringArray[0]);
    ps6.setString(8,yr);
    ps6.executeUpdate();
        
    response.sendRedirect("generate.jsp?msg=Success");
        
    }
    
    if(year==3){    
    String query = "select * from third ";
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);  
    
    while(rs.next()){
    stringArray[i] = rs.getString("subject");
    i++;
    }
    
    PreparedStatement ps=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps.setString(1,"1st");
    ps.setString(2,stringArray[2]);
    ps.setString(3,stringArray[3]);
    ps.setString(4,stringArray[4]);
    ps.setString(5,stringArray[5]);
    ps.setString(6,stringArray[0]);
    ps.setString(7,stringArray[1]);
    ps.setString(8,yr);
    ps.executeUpdate();
    
    
    PreparedStatement ps1=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps1.setString(1,"2nd");
    ps1.setString(2,stringArray[3]);
    ps1.setString(3,stringArray[4]);
    ps1.setString(4,stringArray[5]);
    ps1.setString(5,stringArray[0]);
    ps1.setString(6,stringArray[1]);
    ps1.setString(7,stringArray[2]);
    ps1.setString(8,yr);
    ps1.executeUpdate();
    
    
    PreparedStatement ps2=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps2.setString(1,"3rd");
    ps2.setString(2,stringArray[4]);
    ps2.setString(3,stringArray[5]);
    ps2.setString(4,stringArray[0]);
    ps2.setString(5,stringArray[1]);
    ps2.setString(6,stringArray[2]);
    ps2.setString(7,stringArray[3]);
    ps2.setString(8,yr);
    ps2.executeUpdate();
    
    
    PreparedStatement ps3=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps3.setString(1,"4th");
    ps3.setString(2,stringArray[5]);
    ps3.setString(3,stringArray[0]);
    ps3.setString(4,stringArray[1]);
    ps3.setString(5,stringArray[2]);
    ps3.setString(6,stringArray[3]);
    ps3.setString(7,stringArray[4]);
    ps3.setString(8,yr);
    ps3.executeUpdate();
    
    
    PreparedStatement ps4=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps4.setString(1,"5th");
    ps4.setString(2,stringArray[0]);
    ps4.setString(3,stringArray[1]);
    ps4.setString(4,stringArray[2]);
    ps4.setString(5,stringArray[3]);
    ps4.setString(6,stringArray[4]);
    ps4.setString(7,stringArray[5]);
    ps4.setString(8,yr);
    ps4.executeUpdate();
    
    PreparedStatement ps5=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps5.setString(1,"6th");
    ps5.setString(2,stringArray[1]);
    ps5.setString(3,stringArray[2]);
    ps5.setString(4,stringArray[3]);
    ps5.setString(5,stringArray[4]);
    ps5.setString(6,stringArray[5]);
    ps5.setString(7,stringArray[0]);
    ps5.setString(8,yr);
    ps5.executeUpdate();
    
    PreparedStatement ps6=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps6.setString(1,"7th");
    ps6.setString(2,stringArray[2]);
    ps6.setString(3,stringArray[3]);
    ps6.setString(4,stringArray[4]);
    ps6.setString(5,stringArray[5]);
    ps6.setString(6,stringArray[0]);
    ps6.setString(7,stringArray[1]);
    ps6.setString(8,yr);
    ps6.executeUpdate();
        
    response.sendRedirect("generate.jsp?msg=Success");
        
    }
    
    if(year==4){    
    String query = "select * from fourth ";
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery(query);  
    
    while(rs.next()){
    stringArray[i] = rs.getString("subject");
    i++;
    }
    
    PreparedStatement ps=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps.setString(1,"1st");
    ps.setString(2,stringArray[3]);
    ps.setString(3,stringArray[4]);
    ps.setString(4,stringArray[5]);
    ps.setString(5,stringArray[0]);
    ps.setString(6,stringArray[1]);
    ps.setString(7,stringArray[2]);
    ps.setString(8,yr);
    ps.executeUpdate();
    
    
    PreparedStatement ps1=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps1.setString(1,"2nd");
    ps1.setString(2,stringArray[4]);
    ps1.setString(3,stringArray[5]);
    ps1.setString(4,stringArray[0]);
    ps1.setString(5,stringArray[1]);
    ps1.setString(6,stringArray[2]);
    ps1.setString(7,stringArray[3]);
    ps1.setString(8,yr);
    ps1.executeUpdate();
    
    
    PreparedStatement ps2=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps2.setString(1,"3rd");
    ps2.setString(2,stringArray[5]);
    ps2.setString(3,stringArray[0]);
    ps2.setString(4,stringArray[1]);
    ps2.setString(5,stringArray[2]);
    ps2.setString(6,stringArray[3]);
    ps2.setString(7,stringArray[4]);
    ps2.setString(8,yr);
    ps2.executeUpdate();
    
    
    PreparedStatement ps3=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps3.setString(1,"4th");
    ps3.setString(2,stringArray[0]);
    ps3.setString(3,stringArray[1]);
    ps3.setString(4,stringArray[2]);
    ps3.setString(5,stringArray[3]);
    ps3.setString(6,stringArray[4]);
    ps3.setString(7,stringArray[5]);
    ps3.setString(8,yr);
    ps3.executeUpdate();
    
    
    PreparedStatement ps4=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps4.setString(1,"5th");
    ps4.setString(2,stringArray[1]);
    ps4.setString(3,stringArray[2]);
    ps4.setString(4,stringArray[3]);
    ps4.setString(5,stringArray[4]);
    ps4.setString(6,stringArray[5]);
    ps4.setString(7,stringArray[0]);
    ps4.setString(8,yr);
    ps4.executeUpdate();
    
    PreparedStatement ps5=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps5.setString(1,"6th");
    ps5.setString(2,stringArray[2]);
    ps5.setString(3,stringArray[3]);
    ps5.setString(4,stringArray[4]);
    ps5.setString(5,stringArray[5]);
    ps5.setString(6,stringArray[0]);
    ps5.setString(7,stringArray[1]);
    ps5.setString(8,yr);
    ps5.executeUpdate();
    
    PreparedStatement ps6=connection.prepareStatement("insert into 1st values(?,?,?,?,?,?,?,?)");
    ps6.setString(1,"7th");
    ps6.setString(2,stringArray[3]);
    ps6.setString(3,stringArray[4]);
    ps6.setString(4,stringArray[5]);
    ps6.setString(5,stringArray[0]);
    ps6.setString(6,stringArray[1]);
    ps6.setString(7,stringArray[2]);
    ps6.setString(8,yr);
    ps6.executeUpdate();
        
    response.sendRedirect("generate.jsp?msg=Success");
        
    }
       
    
      out.write("\n");
      out.write("    \n");
      out.write("    ");

    }
    catch(Exception e)
    {
            out.println(e.getMessage());
    }
    
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