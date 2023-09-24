import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datetimeformatter {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-mm-yyyy--E H:m a");
        // System.out.println(df);
        DateTimeFormatter df1 = DateTimeFormatter.ISO_LOCAL_DATE;
        String mat = dt.format(df);
        System.out.println(mat);
     
    }
}
