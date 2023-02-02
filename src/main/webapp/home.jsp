<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage = "Error.jsp"%>
<%@ page import="java.util.*, java.sql.*" %>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <%
        out.print("<br/><br/>Hello from Home Page");


        String name1 =(String) session.getAttribute("name");
        out.println("<br/><br/>My name is "+name1);

        String dept1 = (String) pageContext.getAttribute("dept", PageContext.SESSION_SCOPE);
        out.println("<br/><br/>My department of study is "+dept1);

        //int k = 9/0;
    %>
</body>
</html>


<%--
    Builtin Objects

    request     (HttpServletRequest)
    response    (HttpServletResponse)
    pageContext (PageContext)
    out         (JspWriter) ~ PrintWriter Object
    session     (HttpeSession)
    application (ServletContext)
    config      (ServletConfig)
--%>