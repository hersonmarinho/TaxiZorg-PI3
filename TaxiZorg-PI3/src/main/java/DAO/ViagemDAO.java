package DAO;

import com.mycompany.pi3_zorg.Usuario;
import com.mycompany.pi3_zorg.Viagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class ViagemDAO {
    
    private Connection con;
    
    public ViagemDAO(Connection con) {
        this.con = con;
    }
    
    public boolean agendarViagem(Viagem viagem){
        String sql = "INSERT INTO viagem (cliente_viagem, status_viagem, tipo_viagem, matricula_funcionario, id_end_partida, id_end_destino, inicio_viagem) VALUES (?,?,?,?,?,?,?);";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, viagem.getNomeCliente());
            ps.setString(2, "PROGRESSO");
            ps.setString(3, viagem.getTipoViagem());
            ps.setInt(4, viagem.getMatricula_funcionario());
            ps.setInt(5, viagem.getId_end_partida());
            ps.setInt(6, viagem.getId_end_destino());
            Date utilDate = new java.util.Date();
            Date data = new java.sql.Date(utilDate.getTime());
            ps.setDate(7, (java.sql.Date) data);
            
            if (ps.executeUpdate() > 0){
                System.out.println("viagem inserida com sucesso!");
                return true;
            } else {
                System.out.println("Viagem não inserida!");
            }
            
            ps.close();
        } catch (SQLException ex){
            System.out.println("Erro de SQL!");
        }
        
        return false;
    }
    
    public boolean finalizarViagem(Viagem viagem){
        String sql = "UPDATE viagem SET status_viagem = 'CONCLUIDA', fim_viagem = date(?) where idviagem = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            Date utilDate = new java.util.Date();
            Date data = new java.sql.Date(utilDate.getTime());
            ps.setDate(1, (java.sql.Date) data);
            ps.setInt(2, viagem.getCodViagem());
            ps.executeUpdate();
            
            if(ps.executeUpdate() > 0){
                System.out.println("Viagem finalizada com sucesso!");
                return true;
            } else {
                System.out.println("Viagem não finalizada!");
            }
            
            ps.close();
        } catch(SQLException ex){
            System.out.println("Erro de SQL!");
        }
        
        return false;
    }
    
    public boolean cancelarViagem(Viagem viagem){
        String sql = "UPDATE viagem SET status_viagem = 'CANCELADA', fim_viagem = date(?) WHERE idviagem = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            Date utilDate = new java.util.Date();
            Date data = new java.sql.Date(utilDate.getTime());
            ps.setDate(1, (java.sql.Date) data);
            ps.setInt(2, viagem.getCodViagem());
            ps.executeUpdate();
            
            if(ps.executeUpdate() > 0){
                System.out.println("Viagem cancelada com sucesso!");
                return true;
            } else {
                System.out.println("Viagem não cancelada!");
            }
            
            ps.close();
        } catch(SQLException ex){
            System.out.println("Erro de SQL!");
        }
        
        return false;
    }
    
    public ArrayList<Viagem> listarViagens() {
        String sql = "SELECT * FROM viagem WHERE status_viagem = 'PROGRESSO'";
        ArrayList<Viagem> listaViagens = new ArrayList<>();
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            
            while (rs.next()) {
                Viagem viagem = new Viagem();
                
                viagem.setCodViagem(rs.getInt("idviagem"));
                viagem.setNomeCliente(rs.getString("cliente_viagem"));
                
                listaViagens.add(viagem);
            }
            ps.close();
            
            return listaViagens;
        } catch(SQLException ex){
            System.out.println("Erro de SQL!");
        }
        
        return listaViagens;
    }
}