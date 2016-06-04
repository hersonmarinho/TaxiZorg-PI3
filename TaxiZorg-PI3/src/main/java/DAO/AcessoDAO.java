/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.pi3_zorg.Acesso;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fabricio
 */
public class AcessoDAO {
    private Connection con;
    
    public AcessoDAO(Connection con) {
        this.con = con;
    }
    
    public ArrayList<Acesso> listarAcessos(){
        ArrayList<Acesso> acessos = new ArrayList<>();
        String sql = "SELECT * FROM acesso";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            
            while(rs.next()){
                Acesso acesso = new Acesso();
                acesso.setIdAcesso(rs.getInt("idacesso"));
                acesso.setTipoAcesso(rs.getString("tipoacesso"));
                acessos.add(acesso);
            }
        }catch(SQLException ex){
            System.err.println("Não foi possível obter a lista de acessos");
        }
        return acessos;
    }
}
