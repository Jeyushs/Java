import javax.swing.*;
import java.sql.*;

public class display {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/BCA3rd"; // Use your database name
        String username = "root";
        String dbPassword = "newpassword"; // Use your database password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(jdbcUrl, username, dbPassword);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");

            StringBuilder result = new StringBuilder();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                result.append("Name: ").append(name).append(", Email: ").append(email).append(", Address: ").append(address).append("\n");
            }

            if (result.length() > 0) {
                JOptionPane.showMessageDialog(null, result.toString(), "Student Information", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No student information found.", "Student Information", JOptionPane.INFORMATION_MESSAGE);
            }

            con.close(); // Close the database connection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
