/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.TaxistaDAO;
import DBConnection.DBConnection;
import com.mycompany.pi3_zorg.Funcionario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Fabricio
 */
@WebServlet(name = "ViagemServlet", urlPatterns = {"/Cadastrar/Viagem"})
public class ViagemServlet extends HttpServlet {

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
               
        response.sendRedirect(request.getContextPath() + "/MainServlet#two");
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
        // Logica de cadastro de viagem
        DBConnection con = new DBConnection();
        // Cadastra o endereço de partida
        String cepPartida = request.getParameter("ceppartida");
        String logradouroPartida = request.getParameter("logpartida");
        int numPartida = Integer.parseInt(request.getParameter("numpartida"));
        // Cadastra o endereço de destino
        String cepDestino = request.getParameter("cepdestino");
        String logradouroDestino = request.getParameter("logdestino");
        int numDestino = Integer.parseInt(request.getParameter("numdestino"));
        // Dados do cliente
        String cliente = request.getParameter("cliente");
        
        response.sendRedirect(request.getContextPath() + "/MainServlet#two");
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
