import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        // int a = 6000;
        // int b = 0;
        // try{
        //     int c = a/b;
        //     System.out.println("The result is "+c);
        // }
        // catch(Exception e){
        //     System.out.println("We failed to divide. Reason:");
        //     System.out.println(e);
        // }
        // System.out.println("We failed to divide");
        int marks[] = new int[3];
        marks[0] = 2;
        marks[1] = 3;
        marks[2] = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = sc.nextInt();
        
        System.out.println( "Enter the number you want to divide the value with");
        int number = sc.nextInt();  

        try{
            System.out.println("The value of array index entered is"+ marks[ind]);
            System.out.println( "The value of arr/number is "+ marks[ind]/number);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmeticexception occur");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Arrayindexoutofbonds occur");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some exception occur");
            System.out.println(e);
        }
    }
}
