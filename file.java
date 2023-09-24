import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file {
    public static void main(String[] args){
        // File myFile = new File("file1.txt");

        //code to create a new file
        // try{
        // myFile.createNewFile();
        // }
        // catch(IOException e){
        //     // e.printStackTrace();
        //     System.out.println("Unable to create this file.");
        // }

        //code to write a new file
        // try{
        // FileWriter fileWriter = new FileWriter("files1.txt");
        // fileWriter.write("This is our first file from java");
        // fileWriter.close();
        // }
        // catch(IOException e){
        //     System.out.println("Error something occurs");
        // }

        // File myfile = new File("files1.txt");
        // try{
        //     Scanner sc = new Scanner(myfile);
        //     while(sc.hasNextLine()){
        //         String Line = sc.nextLine();
        //         System.out.println(Line);


        //     }
        //     sc.close();
        
        //       }      catch   (FileNotFoundException e ){
        //     System.out.println("Error occur due to some error");
        // }
       File myFile = new File("files1.txt");
       if(myFile.delete()){
        System.out.println("I have deleted a file"+myFile.getName());
       }    
       else{
        System.out.println("Some error occur while deleting the file");
       }
}
}
