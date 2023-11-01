package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseQuery {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:5432/clothes";
        String username = "postgres";
        String password = "21112004";

        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "SELECT * FROM clothes";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                System.out.println("Name: " + name);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

