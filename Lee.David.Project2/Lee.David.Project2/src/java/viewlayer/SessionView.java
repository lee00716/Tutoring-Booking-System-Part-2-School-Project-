/*
 * File name: SessionView.Java
 * @author David Lee, 040-959-646
 * Course: CST8288
 * Assignment: Project 2
 * Date: July 16 2019 
 * Professor: George Kriger 
 * Purpose: this is a JavaFX class in the peer tutoring application
 */
package viewlayer;

import businesslayer.SessionBusinessLogic;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import transferobjects.Session;

/**
 * this class talks to the Servlet and shows the result
 * @author David
 */
@WebServlet(name = "SessionView", urlPatterns = {"/SessionView"})
public class SessionView extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Authors Summary View</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Authors Summary View at " + request.getContextPath() + "</h1>");
           SessionBusinessLogic logic = new SessionBusinessLogic();
            List<Session> sessions = logic.getAllSessions();
            out.println("<table border=\"1\">");
            out.println("<tr>");
            out.println("<td>Date</td>");
            out.println("<td>Time</td>");
           out.println("<td>Student's Last Name</td>");
            out.println("<td>Session Status</td>");
            out.println("<td>Session Topic</td>");
            out.println("</tr>");

            for (Session session : sessions) {
                out.printf("<tr><td>%s</td><td>%s</td><td>%s</td><td>%d</td><td>%s</td></tr>",
                        session.getDate(), session.getTime(), session.getStudentLastName(), session.getSessionStatus(), session.getSessionTopic());
            }
//for(Session session : sessions){
//out.printf("<tr><td>%s</td><tr>", session.getStudentLastName());}

            out.println(
                    "</table>");
            out.println(
                    "</body>");
            out.println(
                    "</html>");
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
