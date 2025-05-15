package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "";
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");
            // Insert data into the table
            Statement st = connection.createStatement();
            int rowsAffected = st.executeUpdate("INSERT INTO group16 (stdID, stdName, age) VALUES (1001, 'Prabh', 20)");

            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully!");
            }
            // Close connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("SQL Exception occurred!");
            e.printStackTrace();
        }
    }
}
