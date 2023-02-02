package com.add;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i + j;

//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("The sum of "+i+" and "+j+" is "+k);
//        out.println("</body></html>");


        //Request Dispatcher
//        //Session Management -- Share data between servlets
//        request.setAttribute("k", k);
//
//        //Request Dispatcher -- call another servlet
//        RequestDispatcher rd = request.getRequestDispatcher("/Square");
//        rd.forward(request, response);


        //redirect -- calling another servlet from other website
        //Url Rewriting
//        response.sendRedirect("Square?k="+k); //one way to pass value via redirect-- url rewriting

        //Session
//        HttpSession session = request.getSession();
//        session.setAttribute("k", k);
//        response.sendRedirect("Square");

        //Cookies
        Cookie cookie = new Cookie("k", k + "");
        response.addCookie(cookie);
        response.sendRedirect("Square");

    }
}
