/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.dao.*;
import com.db.connect;
import com.entities.*;
import java.io.IOException;
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
@WebServlet(name = "servletregister", urlPatterns = {"/servletregister"})
public class servletregister extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String n=request.getParameter("uname");
        String e=request.getParameter("uemail");
        String p=request.getParameter("upass");
        user us=new user();
        us.setName(n);
        us.setEmail(e);
        us.SetPassword(p);
        connectdao dao=new connectdao(connect.getConnection());
        boolean f=dao.userRegister(us);
        if(true)
        {
            HttpSession session=request.getSession();
            session.setAttribute("reg-msg","Sign Up Successfully.....");
            response.sendRedirect("SignUp.jsp");
        }
        else
        {
            HttpSession session=request.getSession();
            session.setAttribute("error-msg","Something Went Wrong Server");
            response.sendRedirect("SignUp.jsp");
        }
    }

}
