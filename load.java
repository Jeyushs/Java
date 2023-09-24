import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class load {
    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish a database connection
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BCA3rd", "root", "newpassword");
            
            // Perform database operations here
            
            // Close the connection when done
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
