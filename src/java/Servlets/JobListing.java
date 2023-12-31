/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Project.ConnectionProvider;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "JobListing", urlPatterns = {"/JobListing"})
public class JobListing extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement statement = con.createStatement();
            Statement countStatement = con.createStatement();
            String countQuery = "SELECT COUNT(*) As 'count' FROM JobDetails";
            String joinQuery = "SELECT B.EmployerID, EmployerName, company_logo, website, Email, JobID, JobTitle, B.Location, JobNature,"
                    + "  SalaryRange, JobDescription, RequiredKnowledge, EducationNExperience,vacancy ,ApplicationDate ,"
                    + "FORMAT(postedDate, 'd, MMMM yyyy') AS 'PostedDate' From Employer A Join JobDetails B ON B .EmployerID = A.EmployerID order by JobID desc";
            ResultSet rs = statement.executeQuery(joinQuery);
            ResultSet countResult = countStatement.executeQuery(countQuery);
            while(countResult.next()){
                request.setAttribute("count", countResult.getString("count"));
            }
            request.getRequestDispatcher("job_listing.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace();
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
