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
@WebServlet(name = "JobDetails", urlPatterns = {"/JobDetails"})
public class JobDetails extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection con = ConnectionProvider.getConnection();
            Statement stmnt = con.createStatement();
            Statement stmt2 = con.createStatement();
            ResultSet rs = stmnt.executeQuery("select * from Employer ");
            ResultSet rs1 = stmt2.executeQuery("select * from jobdetails");
            while (rs.next() && rs1.next()) {
                byte[] imageData = rs.getBytes("company_logo");
                String base64Image = java.util.Base64.getEncoder().encodeToString(imageData);

                // Setting attributes to the columns requested in the query
                request.setAttribute("jobTitle", rs1.getString("JobTitle"));
                request.setAttribute("employerName", rs.getString("EmployerName"));
                request.setAttribute("Location", rs1.getString("Location"));
                request.setAttribute("salaryRange", rs1.getString("SalaryRange"));
                request.setAttribute("jobDescription", rs1.getString("JobDescription"));
                request.setAttribute("base64Image", base64Image);
                request.setAttribute("requiredKnowledge", rs1.getString("RequiredKnowledge"));
                request.setAttribute("educationNExperience", rs1.getString("EducationNExperience"));
                request.setAttribute("postedDate", rs1.getString("PostedDate"));
                
                request.setAttribute("location", rs1.getString("Location") );
                request.setAttribute("vacancy", rs1.getString("vacancy") );
                request.setAttribute("jobNature", rs1.getString("JobNature"));
               
                request.setAttribute("salaryRange",rs1.getString("SalaryRange") );
                request.setAttribute("applicationDate", rs1.getString("ApplicationDate") );
                request.setAttribute("website", rs.getString("website") );
                request.setAttribute("email", rs.getString("Email"));
            }

            // Forwarding the request to the JSP
            request.getRequestDispatcher("/job_details.jsp").forward(request, response);

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
