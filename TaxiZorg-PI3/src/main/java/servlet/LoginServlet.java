package servlet;

import DAO.UsuarioDAO;
import DBConnection.DBConnection;
import com.mycompany.pi3_zorg.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginServlet", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession sessao = request.getSession(false);
        if (sessao == null) {
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
            rd.forward(request, response);
        }
        response.sendRedirect(request.getContextPath() + "/MainServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        HttpSession sessao = request.getSession(false);
        Usuario userTela = new Usuario();
        userTela.setLogin(usuario);
        userTela.setSenha(senha);
        
        DBConnection con = new DBConnection();
        UsuarioDAO dao = new UsuarioDAO(con.getConexaoMySQL());
        
        
        if(dao.login(userTela)){
        
            response.sendRedirect(request.getContextPath() + "/MainServlet");
        
        } else {
            
            RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/login.jsp");
            rd.forward(request, response);
            
        }
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
