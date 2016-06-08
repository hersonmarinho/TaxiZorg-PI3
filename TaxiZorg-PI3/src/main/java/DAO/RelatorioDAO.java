package DAO;

import com.mycompany.pi3_zorg.Relatorio;
import com.mycompany.pi3_zorg.Taxista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class RelatorioDAO {

    private Connection con;

    public RelatorioDAO(Connection con) {
        this.con = con;
    }

    public ArrayList<Relatorio> listarRelatorio() {
        String sql = "select nome_funcionario, sobrenome_funcionario, cliente_viagem, tipo_viagem, inicio_viagem, fim_viagem, status_viagem "
                + "from viagem join funcionario on viagem.matricula_funcionario = funcionario.matricula_funcionario "
                + "order by nome_funcionario";
        ArrayList<Relatorio> relatorios = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                Relatorio relatorio = new Relatorio();
                
                relatorio.setNomeFuncionario(rs.getString("nome_funcionario"));
                relatorio.setSobrenomeFuncionario(rs.getString("sobrenome_funcionario"));
                relatorio.setNomeCliente(rs.getString("cliente_viagem"));
                relatorio.setTipoViagem(rs.getString("tipo_viagem"));
                relatorio.setStatusViagem(rs.getString("status_viagem"));
                relatorio.setInicioViagem(rs.getDate("inicio_viagem"));
                relatorio.setFimViagem(rs.getDate("fim_viagem"));
                relatorios.add(relatorio);
            }

            ps.close();
            return relatorios;
            
        } catch (SQLException ex) {
            System.out.println("Erro de SQL no relatorio!");
        }

        return relatorios;
    }

}
