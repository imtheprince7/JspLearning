package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;

public class ThirdServlet extends HttpServlet{
//    public void doGet(HttpServletResponse req, HttpServletResponse resp) throws ServletException,IOException{
//       
//        System.out.println("This is Get Method");
//        resp.setContentType("text/html");
//        PrintWriter out = resp.getWriter();
//        out.println("<h1> This is Get Method response </h1>");
//    }

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      ArrayList<String> arr = new ArrayList<>();
        System.out.println("This is Post Method");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        arr.add(req.getParameter("user_name"));
        arr.add(req.getParameter("emailId"));
        arr.add(req.getParameter("password"));
        arr.add(req.getParameter("gender_type"));
        arr.add(req.getParameter("user_course"));
        String cond = req.getParameter("condition");
       
       if(cond!=null){
        if(cond.equals("checked")){
           out.println("term and Conditions are checked");
            out.println("<h2>Details of User:</h2>");
            for(String details: arr){
                out.println(details+" ");
            }
         }
       }
       else{
           out.println("<h2>Please check the term and Conditions</h2>");
           RequestDispatcher rd = req.getRequestDispatcher("index.html");
           rd.include(req, resp);
       }
       
       
        
    }    
}
