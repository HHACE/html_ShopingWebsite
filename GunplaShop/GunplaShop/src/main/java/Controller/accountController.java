/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAOs.accountDAO;
import Models.account;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

/**
 *
 * @author namti
 */
public class accountController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet accountControlle</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet accountControlle at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cookie[] cookies = request.getCookies();
        Cookie usCook = null;
        Cookie fullCook = null;
        
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("username")) {
                    usCook = cookies[i];
                }
                if (cookies[i].getName().equals("fullname")) {
                    fullCook = cookies[i];
                }
            }
            
            if (usCook != null && fullCook != null) {
                response.sendRedirect("/home");
            } else {
                request.getRequestDispatcher("/login.jsp").forward(request, response);
            }
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("btnSubmit") != null) {
            String us = request.getParameter("username");
            String pwd = request.getParameter("pass");
            
            accountDAO dao = new accountDAO();
            account acc = dao.login(us, pwd);
            
            if (acc != null) {   //dang nhap thanh cong
                Cookie username = new Cookie("username", us);
                Cookie fullname = new Cookie("fullname", URLEncoder.encode(acc.getA_Fullname(), "UTF-8"));
                
                username.setPath("/");
                fullname.setPath("/");
                
                if (request.getParameter("remember") != null) {
                    username.setMaxAge(3 * 24 * 60 * 60);
                    fullname.setMaxAge(3 * 24 * 60 * 60);
                }
                
                response.addCookie(username);
                response.addCookie(fullname);
                response.sendRedirect("/home");
                
            } else {
                request.setAttribute("mess", "Wrong username or password");

                //Dang nhap that bai
                //Chuyen lai trang dang nhap
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
