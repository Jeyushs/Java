import java.util.*;
public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(16);
        l2.add(17);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.addAll(l2);
        System.out.println(l1.contains(6 ));
        System.out.println(l1.contains(1 ));
        System.out.println(l1.indexOf(4));
        System.out.println(l1.lastIndexOf(15));
        System.out.println(l1.remove(5));
        // l1.clear();
        l1.set(1, 1000);
        System.out.println(l1.isEmpty());
        System.out.println(l1.get(4));
       l1.listIterator(5);
        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(",");
            
        }
    }
}
