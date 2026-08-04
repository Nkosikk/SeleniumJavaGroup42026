package testData;

import java.sql.*;

public class ReadFromDatabase {

    public static String getUsername;
    public static String getPassword;

    public static void dbConnection() {
        // Implement your database connection logic here
        // For example, you can use JDBC to connect to your database and retrieve the username and password
        // Assign the retrieved values to getUsername and getPassword variables
        String dbUrl = "jdbc:mysql://102.222.124.22:3306/ndosian6b8b7_teaching"; // Replace with your database URL
        String dbUsername = "ndosian6b8b7_teaching"; // Replace with your database username
        String dbPassword = "^{SF0a=#~[~p)@l1"; // Replace with your database password

        try (Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword)) {
            try (Statement statement = connection.createStatement()) {
                ResultSet resultSet = statement.executeQuery("SELECT * FROM users WHERE id = 2"); // Replace with your query
                while (resultSet.next()) {
                    getUsername = resultSet.getString("email"); // Replace with your column name
                    getPassword = resultSet.getString("password"); // Replace with your column name
                    System.out.println("Email: " + getUsername + ", Password: " + getPassword);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error occurred while fetching data from the database.");
            e.printStackTrace();
        }

    }
}
