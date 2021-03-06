package DAO;

import com.mycompany.pi3_zorg.Unidade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fabricio
 */
public class UnidadeDAO {
    private Connection con;
    
    public UnidadeDAO(Connection con){
        this.con = con;
    }
    
    public ArrayList<Unidade> listarUnidades(){
        ArrayList<Unidade> unidades = new ArrayList<>();
        
        String sql = "SELECT * FROM unidade ORDER BY unidade_estado";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            
            while (rs.next()) {
                Unidade unidade = new Unidade();
                
                unidade.setCodUnidade(rs.getInt("idunidade"));
                unidade.setUf(rs.getString("unidade_estado"));
                unidade.setCidade(rs.getString("unidade_cidade"));
                unidades.add(unidade);
            }
            ps.close();
            return unidades;
        }catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }
        return unidades;
    }
}