/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Project.ConnectionProvider;
import java.io.IOException;
import java.sql.*;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(name = "edit_job", urlPatterns = {"/editJob"})
public class edit_job extends HttpServlet {

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
        try{
        Connection con = ConnectionProvider.getConnection();

 

        String sql = "SELECT * FROM job WHERE JobID = ? and EmployerID = ?";
        String employerId = request.getParameter("");
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "1");// temporary for now, youl select from the job page
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            String JobTitle = rs.getString("JobTitle");
            String JobDescription = rs.getString("JobDescription");
            String RequiredKnowledge = rs.getString("jobRequirement");
            String EducationNExperience = rs.getString("EducationNExperience");
            String SalaryRange = rs.getString("Salary");
            String Location = rs.getString("JobLocation");
            String vacancy = rs.getString("vacancy");

            String JobNature = rs.getString("JobNature");
            String ApplicationDate = rs.getString("DeadlineDate");

            request.setAttribute("JobTitle", JobTitle);
            request.setAttribute("JobDescription", JobDescription);
            request.setAttribute("RequiredKnowledge", RequiredKnowledge);
            request.setAttribute("EducationNExperience", EducationNExperience);
            request.setAttribute("SalaryRange", SalaryRange);
            request.setAttribute("Location", Location);
            request.setAttribute("JobNature", JobNature);
            request.setAttribute("ApplicationDate", ApplicationDate);

            System.out.println("edit_job_input.processRequest()");
            request.getRequestDispatcher("edit_job.jsp").forward(request, response);
        }
        }catch(Exception e){
            System.out.println(e);
        }}

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
        protected void doGet
        (HttpServletRequest request, HttpServletResponse response)
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
        protected void doPost
        (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo
        
        
            () {
        return "Short description";
        }// </editor-fold>

    }
