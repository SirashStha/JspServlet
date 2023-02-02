package com.square;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Square", value = "/Square")
public class Square extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Request Dispatcher -- used when switching to same server (1 rq & 1 response)
//        int k = (int)request.getAttribute("k");
//        k *= k;
//        PrintWriter out = response.getWriter();
//        out.println("Hello from Square Servlet implementing request dispatcher");
//        out.println("Square is "+k);

        //Url rewriting -- used when switching from one server to another (more than 1 req & responses)
//        System.out.println("Square Servlet Called");
//        int k = Integer.parseInt(request.getParameter("k"));
//        k *= k;
//        PrintWriter out = response.getWriter();
//        out.println("Hello from Square Servlet implementing url rewriting");
//        out.println("Square is "+k);

        //Session -- used when switching from one server to another (more than 1 req & responses)
//        HttpSession session = request.getSession();
//        int k = (int)session.getAttribute("k");
////        session.removeAttribute("k"); // -- removes attribute value from session
//        k *= k;
//        PrintWriter out = response.getWriter();
//        out.println("Hello from Square Servlet implementing session");
//        out.println("Square is "+k);

        //Cookie
        int k = 0;
        Cookie cookies[] = request.getCookies();
        for(Cookie c: cookies)
        {
            if(c.getName().equals("k"))
                k = Integer.parseInt(c.getValue());
        }
        k *= k;
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Hello from Square Servlet implementing cookies<br/>");
        out.println("Square is "+k);
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
