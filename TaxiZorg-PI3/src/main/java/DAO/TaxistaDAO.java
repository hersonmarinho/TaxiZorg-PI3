/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import com.mycompany.pi3_zorg.Funcionario;
import com.mycompany.pi3_zorg.Taxista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fabricio
 */
public class TaxistaDAO {

    private Connection con;

    public TaxistaDAO(Connection con) {
        this.con = con;
    }

    public ArrayList<Taxista> listarTaxista(){
        String sql = "SELECT * FROM funcionario JOIN usuario ON funcionario.idusuario = usuario.idusuario " +
                "JOIN acesso ON usuario.idacesso = acesso.idacesso "
                + "LEFT JOIN viagem on funcionario.matricula_funcionario = viagem.matricula_funcionario "
                + "WHERE tipoacesso = 'taxi' AND (viagem.status_viagem <> 'progresso' "
                + "or viagem.matricula_funcionario is null)";
        ArrayList<Taxista> taxistas = new ArrayList<>();

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                Taxista taxista = new Taxista();

                taxista.setMatricula(rs.getInt("matricula_funcionario"));
                taxista.setNome(rs.getString("nome_funcionario"));
                taxista.setSobrenome(rs.getString("sobrenome_funcionario"));
                taxista.setTelefone(rs.getString("telefone_funcionario"));
                taxista.setStatus(rs.getString("status_funcionario"));
                taxistas.add(taxista);
            }

            ps.close();
            return taxistas;
        }catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }

        return taxistas;
    }

}
