/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.dao.*;
import com.db.*;
import com.entities.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Surya Jyoti
 */
@WebServlet(name = "servletlogin", urlPatterns = {"/servletlogin"})
public class servletlogin extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String email=request.getParameter("email");
       String password=request.getParameter("password");
       connectdao dao=new connectdao(connect.getConnection());
       user user=dao.getLogin(email,password);
       if(user!=null)
       {
           HttpSession session=request.getSession();
           session.setAttribute("user-ob",user);
           response.sendRedirect("index.jsp");
       }
       else
       {
             PrintWriter out=response.getWriter();
           out.print("Invaild email & password");
       }
    }



}
