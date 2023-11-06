package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:5432/clothes";
        String username = "postgres";
        String password = "21112004";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database");
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
