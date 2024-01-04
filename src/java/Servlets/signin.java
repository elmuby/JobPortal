/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Project.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
@WebServlet(name = "Signin", urlPatterns = {"/signin"})
public class signin extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            try {

                Connection con = ConnectionProvider.getConnection();
                System.out.println("succesfull");

                String sql = "SELECT * FROM [dbo].[user] where Email = ? AND password = ?";

                //extract the values from the sign up form
                String pass = request.getParameter("your_pass");
                String email = request.getParameter("your_email");

                try (PreparedStatement ps = con.prepareStatement(sql)) {
                    ps.setString(1, email);
                    ps.setString(2, pass);

                    //executing the query
                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        HttpSession session = request.getSession();
                        int id = rs.getInt("Userid");
                        session.setAttribute("userLoggedIn", id);
                        response.sendRedirect("index.jsp");
                    } else {
                        request.setAttribute("errorMessage", "Invalid username or password");
                        RequestDispatcher dispatcher = request.getRequestDispatcher("signin.jsp");
                        dispatcher.forward(request, response);

                    }

                } catch (Exception e) {
                    out.print(e);
                }

            } catch (Exception e) {
                out.print(e);
            }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
