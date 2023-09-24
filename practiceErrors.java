import java.util.Scanner;
// class maxretries extends Exception{
//    public String toString(){
//     return "Error";
//    }
// }
class max extends Exception{
    public max(String  message){
        super(message);
    }
    public String toString(){
        return "Print";
    }
}
public class practiceErrors {
    // public static void num(int i) throws maxretries{
    //   if(i>5){
    //     throw new maxretries();
    //   }
        
    
    public static void main(String[] args) {
        //p1 syntax error
        // int a = 4;
        // b = 4-a;
        //logical error
        // int a1 = 78;
        // int year = 2000-78; 
        //runtime error
        // System.out.println(6/0);

        // problem2
        // try{
        //     int a = 6/0;
        // }
        // catch(IllegalArgumentException e){
        //     System.out.println("HeHe");

        // }
        // catch(ArithmeticException e){
        //     System.out.println("HAHA");
        // }

        // problem 3
        //  int [] marks = new int[4];
        //  marks[0] = 1;
        //  marks[1] = 2;
        //  marks[2] = 3;
        //  marks[3] = 4;
        //  int index;
        //  boolean flag = true;
        // Scanner sc = new Scanner(System.in);
        //  int i = 0;
        //  while(flag && i<5){
        //     try{
        //         System.out.println("Enter the value of index:");
        //         index = sc.nextInt();
        //         System.out.println("The value of given marks[index] is "+ marks[index]);
        //         break;
        //     }
        //     catch(Exception e){
        //         System.out.println("Invalid index");
        //         i++;
        //     }
        //  }
        //  if(i>=5){
        //     System.out.println("Error");
        //  }

         int [] marks = new int[4];
         marks[0] = 1;
         marks[1] = 2;
         marks[2] = 3;
         marks[3] = 4;
         int index;
         boolean flag = true;
        Scanner sc = new Scanner(System.in);
         int i = 0;
         while(flag && i<5){
            try{
                System.out.println("Enter the value of index:");
                index = sc.nextInt();
                System.out.println("The value of given marks[index] is "+ marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
         }
         if(i>=5){
               try{
                throw new max("Error");
               }
               catch(max e){
                System.out.println(e.toString());
               }
          
         }

    }

}