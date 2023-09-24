class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank you"+this.getName());
    }
}
class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
}
public class threadpriorities {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Dipesh");
        MyThr t2 = new MyThr("Rizan");
        MyThr t3 = new MyThr("Bijay");
        MyThr t4 = new MyThr("Sujan");
        MyThr t5 = new MyThr("Rohan");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.NORM_PRIORITY);
        // t5.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
    }
}
