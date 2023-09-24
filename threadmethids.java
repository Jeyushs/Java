class MyThr extends Thread{
    // public MyThr(String name){
    //     super(name);
    // }
        public void run(){
            int i =0;
            while(i<5){
            System.out.println("Thank you");
            i++;    
            }
        }
}
class MyThr1 extends Thread{
    // public MyThr1(String name){
    //     super(name);
    // }
      public void run(){
        int i = 0;
        while(i<5){
        System.out.println("My Thank you");
        
        try{
            Thread.sleep(455);

        } catch (InterruptedException e){
            e.printStackTrace();
        }
        i++;
        }
    }
}
public class threadmethids {
    public static void main(String[] args) {
        MyThr t1 = new MyThr();
        MyThr1 t2 = new MyThr1();
        t1.start();
            try{
                t1.join();
            }
            catch(Exception e){
                System.out.println(e);
            }
            t2.start();
        }
    }

