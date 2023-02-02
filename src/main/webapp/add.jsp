<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/18/2022
  Time: 8:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="blue">

<%-- Directive Tag '<%@ page import = "packageName","packageName2" %>'  --> To import packages --%>

<%-- Declaration Tag '<%! %>' --> to declare variables inside class --%>

<%-- Expression Tag '<%= k %>'--> To print besides out.println(k) --%>

<%--  Scriplet -- that goes to service method --%>
    <%
      int i = Integer.parseInt(request.getParameter("num1"));
      int j = Integer.parseInt(request.getParameter("num2"));
      int k = i+j;

      out.print("Output: "+k);


    %>
</body>
</html>
