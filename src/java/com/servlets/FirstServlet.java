package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
 import javax.servlet.*;

public class FirstServlet implements Servlet{

    ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Initialize init");
         }

    @Override
    public ServletConfig getServletConfig() {
         return this.config;
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Coming from Servlet</h2>");
        out.println("<h3>Hello World !</h3>");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getServletInfo() {
       return "This servlet is config by Prince Kumar";
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void destroy() {
        System.out.println("Going to Destroy");
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
