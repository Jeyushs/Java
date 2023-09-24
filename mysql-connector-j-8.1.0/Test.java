import java.sql.DriverManager;
import java.sql.Connection;
public class Test {
    public static void main(String[] args) {
        try{
      System.out.println("database tutorial");
      Class.forName("com.mysql.jdbc.Driver");        
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bca3rd","root","newpassword");
        }
        catch(Exception e){
            System.out.println("Database Tutorial");
        }

    }
}
