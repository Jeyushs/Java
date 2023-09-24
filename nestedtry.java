import java.util.Scanner;

public class nestedtry {
    public static void main(String[] args) {
        int [] marks = new int [3];
        marks[0] = 2;
        marks[1] = 3;
        marks[2] = 4;
        Scanner sc = new Scanner(System.in);
         boolean flag = true;
         while(flag){
        System.out.println("Enter the index");
        int ind = sc.nextInt();
        try{
            System.out.println("Hello");
            try{
                System.out.println(marks[ind]);
                flag = false;   
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Sorry the index does not occur");
                // System.out.println(e);
                System.out.println("Exception level 2");
            }
        }
        catch(Exception e){
            System.out.println("Exception level 1");
        }
    }
    System.out.println("Thank you");
    }
}
