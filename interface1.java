interface bicycle{
    public void applybrake(int decrement);
    public void speedup(int increment);
}
interface blow{
    public void horn();
    public void horn1();
}
class AoneCycle implements bicycle,blow{
    int speed = 7;
    public void applybrake(int decrement){
        
        speed = speed - decrement;
        System.out.println(speed);
    }
    public void speedup(int increment){
    
    speed = speed + increment;
    System.out.println(speed);
    }
    public void horn(){
        System.out.println("Horn");
    }
    public void horn1(){
        System.out.println("Horn2");
    }
}

public class interface1 {
    public static void main(String[] args) {
        AoneCycle a = new AoneCycle();
        // System.out.println(a.applybrake(3););
    //    a.applybrake(3);
    a.applybrake(3);
    a.speedup(3);
    a.horn();
    a.horn1();
    }
}
