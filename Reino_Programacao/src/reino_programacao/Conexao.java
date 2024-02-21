package reino_programacao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kstan
 */
public class Conexao {

    public static Connection conexao() {

        String usuario = "sa";
        String senha = "";
        String url = "jdbc:h2:~/test";

        try {
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar ao banco de dados: ", e);
        }
            
    }

}
