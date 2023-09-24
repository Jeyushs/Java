class rthread implements Runnable{
    public void run(){
        int i = 0;
        while(i<10){
                System.out.println("I am thread 1");
                i++;
        }
    }
}
class rthread2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<10){
        System.out.println("I am thread 2");
        i++;
        }
    }
}
public class runthread {
    public static void main(String[] args) {
    rthread r1 = new rthread();
    Thread t1 = new Thread(r1);
    
    rthread2 r2 = new rthread2();
    Thread t2 = new Thread(r2);

    t1.start();
    t2.start();
    }
}
