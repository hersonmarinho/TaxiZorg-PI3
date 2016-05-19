package DBConnection;

import DAO.FuncionarioDAO;
import com.mycompany.pi3_zorg.Funcionario;
import com.mycompany.pi3_zorg.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static String status = "Falha ao conectar.";

    // Construtor
    public DBConnection() {

    }
    // Métodos
    public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;

        try {
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            String serverName = "localhost";
            String mydatabase = "zorg";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                status = ("Conectado com sucesso.");
            } else {
                status = ("Não foi possivel realizar a conexão.");
            }

            return connection;
        } catch (ClassNotFoundException e) {
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }
    }

    public static String statusConection() {
        return status;
    }

    public static boolean FecharConexao() {
        try {
            DBConnection.getConexaoMySQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static java.sql.Connection ReiniciarConexao() {
        FecharConexao();
        return DBConnection.getConexaoMySQL();
    }

}
