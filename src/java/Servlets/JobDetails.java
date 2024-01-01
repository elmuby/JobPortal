/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Project.ConnectionProvider;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Base64;
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
            //retrieving the jobID and EmployerId from job_listing.jsp 
            String jobId = request.getParameter("jobID");
            String employerId = request.getParameter("employerID");
            String joinQuery = "SELECT B.EmployerID, EmployerName, company_logo, website, Email, JobID, JobTitle, B.Location, JobNature,"
                    + "  SalaryRange, JobDescription, RequiredKnowledge, EducationNExperience,vacancy ,ApplicationDate ,"
                    + "FORMAT(postedDate, 'd, MMMM yyyy') AS 'PostedDate' From Employer A Join JobDetails B ON B.EmployerID = A.EmployerID "
                    + "WHERE B.JobID = ?  AND A.EmployerID = ?";
            PreparedStatement preparedStatement = con.prepareStatement(joinQuery);
            preparedStatement.setString(1, jobId);
            preparedStatement.setString(2, employerId);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                // Retrieving image data as bytes
                byte[] imageData = rs.getBytes("company_logo");
                // Converting image data to Base64
                String base64Image = Base64.getEncoder().encodeToString(imageData);

                //to keep track of jobID and EmployerID
                request.setAttribute("EmployerID", rs.getString("EmployerID"));
                request.setAttribute("JobID", rs.getString("JobID"));

                // Setting attributes to the columns requested in the query so we can retrive them from jobDetails.jsp
                request.setAttribute("jobTitle", rs.getString("JobTitle"));
                request.setAttribute("employerName", rs.getString("EmployerName"));
                request.setAttribute("Location", rs.getString("Location"));
                request.setAttribute("salaryRange", rs.getString("SalaryRange"));
                request.setAttribute("jobDescription", rs.getString("JobDescription"));

                request.setAttribute("base64Image", base64Image);
                request.setAttribute("requiredKnowledge", rs.getString("RequiredKnowledge"));
                request.setAttribute("educationNExperience", rs.getString("EducationNExperience"));
                request.setAttribute("postedDate", rs.getString("PostedDate"));

                request.setAttribute("location", rs.getString("Location"));
                request.setAttribute("vacancy", rs.getString("vacancy"));
                request.setAttribute("jobNature", rs.getString("JobNature"));

                request.setAttribute("salaryRange", rs.getString("SalaryRange"));
                request.setAttribute("applicationDate", rs.getString("ApplicationDate"));
                request.setAttribute("website", rs.getString("website"));
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