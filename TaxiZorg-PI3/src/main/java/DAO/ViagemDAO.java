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
        String sql = "INSERT INTO viagem (id_end_partida, id_end_destino, cliente_viagem, status_viagem, inicio_viagem, fim_viagem) VALUES (?,?,?,?,?,?);";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, viagem.getEnderecoPartida());
            ps.setObject(2, viagem.getEnderecoDestino());
            ps.setString(3, viagem.getNomeCliente());
            ps.setString(4, viagem.getStatus());
            ps.setObject(5, viagem.getInicioViagem());
            ps.setObject(6, viagem.getFimViagem());
            
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