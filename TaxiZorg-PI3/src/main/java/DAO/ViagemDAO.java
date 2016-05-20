package DAO;

import com.mycompany.pi3_zorg.Viagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ViagemDAO {
    
    private Connection con;
    
    public ViagemDAO(Connection con) {
        this.con = con;
    }
    
    public boolean agendarViagem(Viagem viagem){
        String sql = "INSERT INTO viagem (cliente_viagem, status_viagem, tipo_viagem, matricula_funcionario, id_end_partida, id_end_destino) VALUES (?,?,?,?,?,?);";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, viagem.getNomeCliente());
            ps.setString(2, "PROGRESSO");
            ps.setString(3, viagem.getTipoViagem());
            ps.setInt(4, viagem.getMatricula_funcionario());
            ps.setInt(5, viagem.getId_end_partida());
            ps.setInt(6, viagem.getId_end_destino());
            
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
        String sql = "UPDATE VIAGEM SET STATUS_VIAGEM = 'F' WHERE COD_VIAGEM = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, viagem.getCodViagem());
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
        String sql = "UPDATE VIAGEM SET STATUS_VIAGEM = 'C' WHERE COD_VIAGEM = ? ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, viagem.getCodViagem());
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
}