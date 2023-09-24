import java.io.*;
public class byte1 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream ou = null;
        try{
          in =  new FileInputStream("input.txt");
           ou = new FileOutputStream("output.txt");
          int c;
          while((c=in.read())!=-1){
            ou.write(c);
          }
          System.out.println("Data copied successfully");
        }
        catch (IOException e){
            System.out.println("Some error occur data not copied");
        }
        finally{
            if(in!=null){
                in.close();
            }
            if(ou!=null){
                ou.close();
            }
        }
    }
    
}
