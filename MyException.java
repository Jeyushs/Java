import java.util.Scanner;

class exc extends Exception{
    public exc(String name){
        super(name);
    }
   public String toString(){
    return  "I am toString()";
   }    
   public String getMessage(){
    return "I am getmessage";
   }
}
public class MyException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int a = sc.nextInt();
        if(a<99){
            try{
                throw new exc("Myexception");
                // throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                // System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
    }
}
