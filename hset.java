import java.util.*;
public class hset {
    public static void main(String[] args) {
        HashSet<Integer> h1 = new HashSet<>(7,0.5f);
        h1.add(5);
        h1.add(6);
        h1.add(10);
        h1.add(2);
        h1.add(4);
        h1.add(4);
        System.out.println(h1);
    }
}
