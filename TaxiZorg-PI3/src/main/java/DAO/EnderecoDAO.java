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

    public Endereco listarEndereco(Endereco endereco) {
        String sql = "select * from endereco where cep = ? and numero_endereco = ?";
        Endereco enderecos = new Endereco();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, endereco.getCep());
            ps.setString(2, endereco.getNumero());
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();

            while (rs.next()) {
                
                enderecos.setCep(rs.getString("CEP"));
                enderecos.setLogadouro(rs.getString("logradouro_endereco"));
                enderecos.setNumero(rs.getString("numero_endereco"));
                enderecos.setCodEndereco(rs.getInt("id_endereco"));
                
            }
            System.out.println(enderecos.getCep());
            System.out.println(enderecos.getNumero());
            System.out.println(enderecos.getCodEndereco());

            ps.close();
            return enderecos;

        } catch (SQLException ex) {
            System.out.println("Erro de SQL!");
        }

        return null;
    }

    public boolean inserirEndereco(Endereco endereco) {
        String sql = "INSERT INTO endereco (CEP, logradouro_endereco, numero_endereco) VALUES (?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, endereco.getCep());
            ps.setString(2, endereco.getLogadouro());
            ps.setString(3, endereco.getNumero());

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
            ps.setString(4, endereco.getNumero());

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