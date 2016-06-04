package DAO;

import com.mycompany.pi3_zorg.Funcionario;
import com.mycompany.pi3_zorg.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class FuncionarioDAO {
    
    private Connection con;
    
    public FuncionarioDAO(Connection con) {
        this.con = con;
    }
    
    public ArrayList<Funcionario> listarFuncionarios() {
        String sql = "SELECT * from FUNCIONARIO WHERE status_funcionario = 'A';";
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            
            while (rs.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setMatricula(rs.getInt("matricula_funcionario"));
                funcionario.setNome(rs.getString("nome_funcionario"));
                funcionario.setSobrenome(rs.getString("sobrenome_funcionario"));
                funcionario.setTelefone(rs.getString("telefone_funcionario"));
                funcionario.setStatus(rs.getString("status_funcionario"));
                listaFuncionario.add(funcionario);
            }
            
            ps.close();
            return listaFuncionario;
            
        } catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }
        
        return listaFuncionario;
    }
    
    public boolean inserirFuncionario(Funcionario funcionario){
        String sql = "insert into funcionario (nome_funcionario, sobrenome_funcionario, telefone_funcionario, status_funcionario, idusuario) values (?, ?, ?, ?, ?);";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getSobrenome());
            ps.setString(3, funcionario.getTelefone());
            ps.setString(4, "A");
            ps.setInt(5, funcionario.getUsuario().getCodUsuario());
            
            if (ps.executeUpdate() > 0){
                System.out.println("Funcioanrio inserido com sucesso!");
                return true;
            } else {
                System.out.println("Funcionario não inserido!");
            }
            
            ps.close();
        }catch(SQLException ex){
            System.out.println("Erro de SQL!");
        }
        
        return false;
    }
    
    public boolean desativarFuncionario(Funcionario funcionario){
        String sql = "UPDATE funcionario SET status_funcionario = 'D' WHERE matricula_funcionario = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, funcionario.getMatricula());
            
            if(ps.executeUpdate() > 0){
                System.out.println("Usuário desativado com sucesso!");
                return true;
            } else {
                System.out.println("Usuário não desativado!");
            }
            
        } catch(SQLException ex){
            System.out.println("Erro de SQL!");
        }
        
        return false;
    }
    
    public boolean alterarFuncionario(Funcionario funcionario){
        String sql = "UPDATE funcionario SET nome_funcionario = ?, sobrenome_funcionario = ?, telefone_funcionario = ?, status_funcionario = ? WHERE matricula_funcionario = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getSobrenome());
            ps.setString(3, funcionario.getTelefone());
            ps.setString(4, funcionario.getStatus());
            ps.setInt(5, funcionario.getMatricula());
            
            if(ps.executeUpdate() > 0){
                System.out.println("Funcionário alterado com sucesso!");
                return true;
            } else {
                System.out.println("Funcionario não alterado!");
            }
            
            ps.close();
        } catch(SQLException ex){
            System.out.println("Erro de SQL!");
        }
        
        return false;
    }
}