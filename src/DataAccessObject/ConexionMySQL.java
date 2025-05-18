package DataAccessObject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {
    private static final String URL = "jdbc:mysql://crossover.proxy.rlwy.net:53418/railway";
    private static final String USER = "root";
    private static final String PASSWORD = "DwANksROPbDRjSfnJihxdgHuvopUUekQ";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}