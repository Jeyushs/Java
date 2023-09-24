class Myth extends Thread{
    public Myth(String name){
        super(name);
    }
    public void run(){
        System.out.println("I am a Thread");
    }
}
public class conthread {
    public static void main(String[] args) {
        Myth t1 = new Myth("Dipesh");
        t1.start();
        System.out.println("The id of thread is " + t1.getId());
        System.out.println("The id of thread is " + t1.getName());
    }
}
