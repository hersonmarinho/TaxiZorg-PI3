package DAO;

import com.mycompany.pi3_zorg.Funcionario;
import com.mycompany.pi3_zorg.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    private Connection con;

    public UsuarioDAO(Connection con) {
        this.con = con;
    }

    public List<Usuario> listarUsuarios() {
        String sql = "SELECT USUARIO WHERE STATUS = 'A';";
        List<Usuario> listaUsuario = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                Usuario usuario = new Usuario();

                usuario.setLogin(usuario.getLogin());
                usuario.setSenha(usuario.getSenha());
                listaUsuario.add(usuario);
            }
            ps.close();
            return listaUsuario;

        } catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }
        return listaUsuario;
    }

    public Usuario getUsuario(String usuario, String senha) {
        String sql = "SELECT * from usuario WHERE login_usuario = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            Usuario user = new Usuario();
            
            while (rs.next()) {
                user.setCodUsuario(rs.getInt("idusuario"));
                user.setLogin(rs.getString("login_usuario"));
                user.setSenha(rs.getString("senha_usuario"));
            }
            ps.close();
            return user;

        } catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }
        return null;
    }
    
    public boolean login(Usuario usuario){
        String sql = "SELECT * from usuario WHERE login_usuario = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getLogin());
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            Usuario user = new Usuario();
            
            while (rs.next()) {
                user.setCodUsuario(rs.getInt("idusuario"));
                user.setLogin(rs.getString("login_usuario"));
                user.setSenha(rs.getString("senha_usuario"));
            }
            ps.close();
            
            if(user.getLogin() == null){
                return false;
            } else {
                return true;
            }

        } catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }
        return false;
    }

    public boolean inserirUsuario(Usuario usuario) {
        String sql = "insert into usuario (login_usuario, senha_usuario, idacesso) values (?, ?, ?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setInt(3, usuario.getAcesso());

            if (ps.executeUpdate() > 0) {
                System.out.println("Usuario inserido com sucesso!");
                return true;
            } else {
                System.out.println("Usuario não inserido!");
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }

        return false;
    }
}
