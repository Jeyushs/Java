import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
public class tut{
    public static void main(String[] args) {
        try{
        System.out.println("Database Tutorial");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BCA3rd","root","newpassword");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from Student");
        System.out.println("DataBase Connected");
        rs.first();
        System.out.println("Id is"+rs.getInt(1)+"Name is"+rs.getString(2)+"email is"+rs.getString(3)+"address is"+rs.getString(4));
        rs.next();
        // System.out.println("Database Connected");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}