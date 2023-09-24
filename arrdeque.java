import java.util.*;
public class arrdeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1 = new ArrayDeque<>();
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        a1.addFirst(7);
        a1.removeFirst();
        a1.add(6);
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
        // for (int i : a1) {
        //     System.out.println(i);
            
        // }
    }
}
