interface camera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good morning");
    }
   default void record4kvideo(){
    greet();
    System.out.println("Recording in 4k");
   }
}
interface wifi{
    String[] getnetworks();
    void connecttonetwork(String network);
}
class cellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickcall(){
        System.out.println("Connnecting.");
    }
}
class smartphone extends cellphone implements camera,wifi{
   public void takesnap(){
    System.out.println("Taking snap");
   }    
   public void recordvideo(){
    System.out.println("recording video ");
   }
   public String[] getnetworks(){
    System.out.println("Getting list of network");
    String[] networklist = {"dipesh","Jeyush","Rizan"};
    return networklist;
   }
   public void connecttonetwork(String network){
    System.out.println("Network connect to"+network);
   }
}
public class defaultmethods {
    public static void main(String[] args) {
        smartphone ms = new smartphone();
        String[]arr = ms.getnetworks();
        for (String i : arr) {
            System.out.println(i);
        } 
        ms.takesnap();
        ms.recordvideo();
        ms.connecttonetwork("Dipesh");
        ms.record4kvideo();
    }
    
}
