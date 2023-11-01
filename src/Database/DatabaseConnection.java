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
            // Здесь вы можете выполнять операции с базой данных
            connection.close(); // Закройте соединение, когда оно больше не нужно
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
