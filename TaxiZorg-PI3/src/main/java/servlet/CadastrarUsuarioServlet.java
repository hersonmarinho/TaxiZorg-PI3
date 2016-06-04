/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import DAO.FuncionarioDAO;
import DAO.UsuarioDAO;
import DBConnection.DBConnection;
import com.mycompany.pi3_zorg.Funcionario;
import com.mycompany.pi3_zorg.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "CadastrarUsuarioServlet", urlPatterns = {"/Cadastrar/Usuario"})
public class CadastrarUsuarioServlet extends HttpServlet {

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
        RequestDispatcher rd
                = request.getRequestDispatcher("/WEB-INF/cadastro-usuario.jsp");
        rd.forward(request, response);
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
        DBConnection con = new DBConnection();

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String telefone = request.getParameter("telefone");
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        int unidade = Integer.parseInt(request.getParameter("unidade"));
        int acesso = Integer.parseInt(request.getParameter("acesso"));
        
        Usuario user = new Usuario();
        user.setLogin(usuario);
        user.setSenha(senha);
        user.setUnidade(unidade);
        user.setAcesso(acesso);

        UsuarioDAO userDao = new UsuarioDAO(con.getConexaoMySQL());
        userDao.inserirUsuario(user);
        user = userDao.getUsuario(usuario, senha);
        
        Funcionario funcionario = new Funcionario(nome, sobrenome, telefone, user);
        
        FuncionarioDAO dao = new FuncionarioDAO(con.getConexaoMySQL());
        dao.inserirFuncionario(funcionario);
        
        response.sendRedirect(request.getContextPath() + "/MainServlet#three");
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
