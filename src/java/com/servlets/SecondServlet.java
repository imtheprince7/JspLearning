package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import sun.util.calendar.BaseCalendar;


public class SecondServlet extends GenericServlet{

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("This is Generic Servlet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Making Genric Servlet</h1>");
        out.println("<h2>Only extends Service() not all 5 methods</h2>");
        out.println("<h2> This is date</h2>");
       
        
    }
    
}
