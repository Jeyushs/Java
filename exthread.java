
class MyThread extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("My first thread is runnning");
            System.out.println("I am happy");
            i++;
        }
    }
}
class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<10){
            System.out.println("My second thread is runnning");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class exthread {
    public static void main(String[] args) {
   MyThread t1 = new MyThread();
   MyThread1 t2 = new MyThread1();
   t1.start();
   t2.start();        
   t2.start();        
    }
}
