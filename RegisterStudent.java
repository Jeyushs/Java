    import javax.swing.*;
    import java.awt.event.*;
    import java.sql.*;

    public class RegisterStudent implements ActionListener {
        JTextField tfname;
        JTextField tfemail;
        JTextField tfAddress;
        JFrame f;

        public RegisterStudent() {
            f = new JFrame("Registration Form");
            JLabel lName = new JLabel("Name");
            lName.setBounds(20, 20, 100, 30);
            f.add(lName);
            tfname = new JTextField();
            tfname.setBounds(140, 20, 100, 30);
            f.add(tfname);
            JLabel Lemail = new JLabel("Email");
            Lemail.setBounds(20, 60, 100, 30);
            f.add(Lemail);

            tfemail = new JTextField();
            tfemail.setBounds(140, 60, 100, 30);
            f.add(tfemail);
            JLabel laddress = new JLabel("Address");
            laddress.setBounds(20, 100, 100, 30);
            f.add(laddress);
            tfAddress = new JTextField();
            tfAddress.setBounds(140, 100, 100, 30);
            f.add(tfAddress);

            JButton bLogin = new JButton("Register");
            bLogin.setBounds(100, 150, 100, 30);
            bLogin.addActionListener(this);
            f.add(bLogin);
            f.setSize(500, 250);
            f.setLayout(null);
            f.setVisible(true);
        }

        public static void main(String[] args) {
            new RegisterStudent();
        }

        public void actionPerformed(ActionEvent ae) {
            String name = tfname.getText();
            String email = tfemail.getText();
            String address = tfAddress.getText();

            System.out.println(name + " " + email + " " + address);

            String jdbcUrl = "jdbc:mysql://localhost:3306/BCA3rd"; // Use your database name
            String username = "root";
            String dbPassword = "newpassword"; // Use your database password

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(jdbcUrl, username, dbPassword);
                PreparedStatement ps = con.prepareStatement("INSERT INTO Student (name, email, address) VALUES (?, ?, ?)");
                ps.setString(1, name);
                ps.setString(2, email);
                ps.setString(3, address);

                int x = ps.executeUpdate();
                if (x > 0) {
                    JOptionPane.showMessageDialog(f, "Data Saved Successfully");
                }

                con.close(); // Close the database connection
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
