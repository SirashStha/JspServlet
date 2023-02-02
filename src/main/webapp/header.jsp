<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 11/18/2022
  Time: 11:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Header</title>
</head>
<body>
  <%
        out.print("Hello from Header Page");
        String name = "Shirash";
        session.setAttribute("name", name);

        String dept = "CSIT";
        pageContext.setAttribute("dept", dept, PageContext.SESSION_SCOPE);
  %>
</body>
</html>
