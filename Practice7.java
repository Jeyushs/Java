import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public class Practice7 {
    public static void main(String[] args) {
        //Practice 1
        // ArrayList<String> a = new ArrayList<>(10);
        // a.add("Student1");
        // a.add("Student2");
        // a.add("Student3");
        // a.add("Student4");
        // a.add("Student5");
        // a.add("Student6");
        // a.add("Student7");
        // a.add("Student8");
        // a.add("Student9");
        // a.add("Student10");
        // for (String string : a) {
        //     System.out.println(string);
            
        // }
        // HashSet<Integer> s = new HashSet<>(5);
        // s.add(1);
        // s.add(3);
        // s.add(2);
        // s.add(4);
        // s.add(1);
        //  System.out.println(s);
             
    //  Date d  = new Date();
    // //  System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());         
    // Calendar c = Calendar.getInstance();
    // System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
    // }
    // LocalTime t = LocalTime.now();
    // System.out.println(t);
    LocalDateTime t = LocalDateTime.now();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
    String f = df.format(t);
    System.out.println(f);
}
}