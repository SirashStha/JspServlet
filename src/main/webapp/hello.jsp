<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/18/2022
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello Word!</h1>
<%--  Directive Tag  --%>
<%--    page --> specify for entire page --%>
<%--    include --> to include other jsp in page --%>
<%--    taglib -->  --%>
    <%@ page import="java.util.Scanner" %>

<%--    Declaration Tag   --%>
    <%!
        int c = 3;
    %>

<%--    Scriplet Tag    --%>
    <%
        int i = 8;
        out.print(i);
    %>

<%--Expression Tag--%>
    My Fav number is <%=c%>

</body>
</html>
