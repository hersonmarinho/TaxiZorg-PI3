package DAO;

import java.sql.Connection;
import com.mycompany.pi3_zorg.Endereco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDAO {

    private Connection con;

    public EnderecoDAO(Connection con) {
        this.con = con;
    }

    public List<Endereco> listarEndereco(Endereco endereco) {
        String sql = "SELECT ENDERECO WHERE CEP = ?";
        List<Endereco> listaEndereco = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, endereco.getCep());
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                Endereco enderecos = new Endereco();
                enderecos.setLogadouro(enderecos.getLogadouro());
                enderecos.setNumero(enderecos.getNumero());
                enderecos.setCep(enderecos.getCep());
                listaEndereco.add(enderecos);
            }

            ps.close();
            return listaEndereco;

        } catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }

        return listaEndereco;
    }

    public boolean inserirEndereco(Endereco endereco) {
        String sql = "INSERT INTO ENDERECO (CEP_ENDERECO, LOGADOURO_ENDERECO, NUMERO_ENDERECO) VALUES (?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, endereco.getCep());
            ps.setString(2, endereco.getLogadouro());
            ps.setInt(3, endereco.getNumero());

            if (ps.executeUpdate() > 0) {
                System.out.println("Endereço inserido com sucesso!");
                return true;
            } else {
                System.out.println("Endereco não inserido!");
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }

        return false;
    }

    public boolean atualizarEndereco(Endereco endereco) {
        String sql = "UPDATE ENDERECO SET CEP_ENDERECO, LOGADOURO_ENDERECO, NUMERO_ENDERECO WHERE CEP_ENDERECO = ? VALUES(?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, endereco.getCep());
            ps.setString(1, endereco.getCep());
            ps.setString(3, endereco.getLogadouro());
            ps.setInt(4, endereco.getNumero());

            if (ps.executeUpdate() > 0) {
                System.out.println("Endereço alterado com sucesso!");
                return true;
            } else {
                System.out.println("Endereço não alterado!");
            }

            ps.close();
        } catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }

        return false;
    }
}