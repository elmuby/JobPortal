/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Project.ConnectionProvider;
import Project.JobListBean;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
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
@WebServlet(name = "JobListing", urlPatterns = {"/JobListing"})
public class JobListing extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            HttpSession session = request.getSession();
            session.setAttribute("userLoggedIn", "allowed");
            Connection con = ConnectionProvider.getConnection();
            Statement statement = con.createStatement();
            Statement countStatement = con.createStatement();
            String countQuery = "SELECT COUNT(*) As 'count' FROM JobDetails";
            String joinQuery = "SELECT B.EmployerID, EmployerName, company_logo, website, Email, JobID, JobTitle, B.Location, JobNature,"
                    + "  SalaryRange, JobDescription, RequiredKnowledge, EducationNExperience,vacancy ,ApplicationDate ,"
                    + "FORMAT(postedDate, 'd, MMMM yyyy') AS 'PostedDate' From Employer A Join JobDetails B ON B .EmployerID = A.EmployerID order by JobID desc";
            ResultSet rs = statement.executeQuery(joinQuery);
            ResultSet countResult = countStatement.executeQuery(countQuery);
            //creating arraylist to store the object of joblistbean class
            List<JobListBean> jobList = new ArrayList<>();
            while(countResult.next()){
                request.setAttribute("count", countResult.getString("count"));
            }
            while (rs.next()) {
                
                //retrieving from the database
                String jobID = rs.getString("jobID");
                String employerID = rs.getString("EmployerID");
                String location = rs.getString("Location");
                String salaryRange = rs.getString("SalaryRange");
                String employerName = rs.getString("EmployerName");
                String jobTitle = rs.getString("JobTitle");
                String jobNature = rs.getString("JobNature");

                byte[] imageData = rs.getBytes("company_logo");
                // Converting image data to Base64
                String base64Image = Base64.getEncoder().encodeToString(imageData);

                //creating an object of JobListBean Class
                JobListBean jobListBean = new JobListBean();
                //setting the setters fields in the JoblistBean Class
                jobListBean.setBase64Image(base64Image);
                jobListBean.setEmployerID(employerID);
                jobListBean.setJobID(jobID);
                jobListBean.setEmployerName(employerName);
                jobListBean.setJobNature(jobNature);
                jobListBean.setJobTitle(jobTitle);
                jobListBean.setLocation(location);
                jobListBean.setSalaryRange(salaryRange);

                //adding the JobListBean object to the List jobList
                jobList.add(jobListBean);
            }
            
            request.setAttribute("jobList", jobList);
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
