/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Model.Habitacion;
import Model.Reservacion;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author papiv
 */
@WebServlet(name = "NewReservationServlet", urlPatterns = {"/NewReservation"})
public class NewReservationServlet extends HttpServlet {

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
        
        Reservacion res = new Reservacion();
        res.cliente = Integer.parseInt(request.getParameter("cliente"));
        res.usuario = Integer.parseInt(request.getParameter("usuario"));
        res.abonado = Double.parseDouble(request.getParameter("abonado"));
        res.extras = Double.parseDouble(request.getParameter("extras"));
        res.fecha_inicial = request.getParameter("fecha_inicial");
        res.fecha_final = request.getParameter("fecha_final");
        res.dias = Integer.parseInt(res.fecha_final.split("-")[2]) - Integer.parseInt(res.fecha_inicial.split("-")[2]);
        res.habitacion = request.getParameter("habitacion");
        res.observaciones = request.getParameter("observaciones");
        res.usuario = Integer.parseInt(request.getParameter("usuario"));
        
        Habitacion hab = new Habitacion();
        ResultSet habitacion = hab.getOne(res.habitacion, "string");
        try {
            if(habitacion.next()){
                res.costo_total = hab.priceByDay(habitacion.getDouble("precio"), res.dias, res.extras);
                
                if(res.create()){
                    response.sendRedirect("reservaciones.jsp");
                }else
                    try (PrintWriter out = response.getWriter()) {
                        out.println("<h1>Hubo un error al guardar... " + res.costo_total + "</h1>");
                    }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewReservationServlet.class.getName()).log(Level.SEVERE, null, ex);
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
