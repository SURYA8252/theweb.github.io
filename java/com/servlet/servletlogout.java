/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

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
@WebServlet(name = "servletlogout", urlPatterns = {"/servletlogout"})
public class servletlogout extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                      HttpSession session=request.getSession();
                      session.removeAttribute("user-ob");
                      HttpSession session2=request.getSession();
                      session.setAttribute("logout-msg", "Logout Successfully......");
                      response.sendRedirect("signin.jsp");
    }

}
