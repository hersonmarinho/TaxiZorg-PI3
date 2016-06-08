/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.EnderecoDAO;
import DAO.TaxistaDAO;
import DAO.ViagemDAO;
import DBConnection.DBConnection;
import com.mycompany.pi3_zorg.Endereco;
import com.mycompany.pi3_zorg.Funcionario;
import com.mycompany.pi3_zorg.Viagem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dateTime;
import java.util.GregorianCalendar;

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
        String numPartida = request.getParameter("numpartida");
        
        Endereco enderecoPartida = new Endereco();
        enderecoPartida.setCep(cepPartida);
        enderecoPartida.setLogadouro(logradouroPartida);
        enderecoPartida.setNumero(numPartida);
        
        EnderecoDAO daoPartida = new EnderecoDAO(con.getConexaoMySQL());
        daoPartida.inserirEndereco(enderecoPartida);
        
        Endereco endPartida = new Endereco();
        endPartida = daoPartida.listarEndereco(enderecoPartida);
        //--------------------------------------------------------------------
        // Cadastra o endereço de destino
        String cepDestino = request.getParameter("cepdestino");
        String logradouroDestino = request.getParameter("logdestino");
        String numDestino = request.getParameter("numdestino");
        
        Endereco enderecoDestino = new Endereco();
        enderecoDestino.setCep(cepDestino);
        enderecoDestino.setLogadouro(logradouroDestino);
        enderecoDestino.setNumero(numDestino);
        
        EnderecoDAO daoDestino = new EnderecoDAO(con.getConexaoMySQL());
        daoDestino.inserirEndereco(enderecoDestino);
        
        Endereco endDestino = new Endereco();
        endDestino = daoPartida.listarEndereco(enderecoDestino);
        
        // Dados do cliente
        String cliente = request.getParameter("cliente");
        
        //Matricula Taxista
        int matriculaTaxista = Integer.parseInt(request.getParameter("taxista"));
        
        //Tipo de Viagem
        String tipoViagem = request.getParameter("viagem");
        
        //Objeto VIAGEM
        Viagem viagem = new Viagem();
        viagem.setNomeCliente(cliente);
        viagem.setTipoViagem(tipoViagem);
        viagem.setMatricula_funcionario(matriculaTaxista);
        viagem.setId_end_partida(endPartida.getCodEndereco());
        viagem.setId_end_destino(endDestino.getCodEndereco());
        
        //Dao VIAGEM
        ViagemDAO daoViagem = new ViagemDAO(con.getConexaoMySQL());
        daoViagem.agendarViagem(viagem);
        
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
