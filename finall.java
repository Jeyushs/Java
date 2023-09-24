public class finall {
public static int greet(){

        try{
            int a = 50;
            int b = 2;
            int c = a/b;
            return c;
        }
        catch(Exception e){
            // System.out.println(e);
            System.out.println("Number cannot be divide by 0");
        }
        finally{
            System.out.println("This is the end of the program");
        }
        return 0;
    }

    public static void main(String[] args) {
                
        int k = greet();
        System.out.println(k);
         
        }
        }
