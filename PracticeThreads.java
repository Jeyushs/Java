// class q1 extends Thread{
//     public void run(){
//         // int i = 0;
//         while(true){
//             System.out.println("Goodmorning");
//             // i++;
//         }
//     }
// }
// class qq1 extends Thread{
//     public void run(){
//         // int i=0;
//         while(true){
//             System.out.println("welcome");
//             // i++;
//         }
//     }
// }

// class q2 extends Thread {
//     public void run(){
//         int i =0;
//         while(true){
//                 try{
//                 Thread.sleep(200);
//                 }
//                 catch(Exception e){
//                         System.out.println(e);
//                 }   
//             System.out.println("Welcome");
//         }
//     }
// }
class q3 extends Thread{
    public void run(){
        int i =0;
        while(i<5){
            System.out.println("Goodmorning");
            i++;
        }
    }
}
class qq3 extends Thread{
    public void run(){
        int i =0;
        while(i<5){
            System.out.println("Welcome");
            i++;
        }
    }
}
public class PracticeThreads {
    public static void main(String[] args) {
        // q1 t1 = new q1();
        // qq1 t2 = new qq1();
        // t1.start();
        // t2.start();
    //  q2 t1 = new q2();
    //  t1.start();
    q3 t1 = new q3();
    qq3 t2 = new qq3();
    t1.setPriority(10);
    t2.setPriority(5);
    System.out.println(t1.getPriority());
    System.out.println(t2.getPriority());
    System.out.println(t2.getState());
    System.out.println(Thread.currentThread().getState());

    // t1.start();
    // t2.start();
    }
}
