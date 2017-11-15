
package test_back;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // Faz a conexão com o BD
    // No caso utilizei o BD postgres
   public Connection getConnection() throws SQLException {
       return DriverManager.getConnection("jdbc:postgresql://localhost/postgres","postgres","123");
   }
}
