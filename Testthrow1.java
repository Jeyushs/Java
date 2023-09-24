class test{
    public static void validate(int age){
        if(age>18){
            throw new ArithmeticException("not valid");
        }
        else{
            System.out.println("Welcome to vote ");
        }
    }
}
public class Testthrow1{
    public static void main(String[] args){
        test.validate(19);
    }
}
        
