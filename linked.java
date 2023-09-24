import java.util.*;
public class linked {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.addAll(l2);
        l1.addLast(22);
        l1.addFirst(32);
        System.out.println(l1.contains(6 ));
        System.out.println(l1.contains(1 ));
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(15));
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(",");
            
        }
    }
}
