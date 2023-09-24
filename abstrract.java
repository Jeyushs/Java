abstract class Base{
    public Base(){
        System.out.println("I am constructor of base");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Base2 extends Base{
    @Override
    public void greet(){
        System.out.println("Goodmorning");
    }
    @Override
    public void greet2(){
        System.out.println("Goodevening");
    }
}
abstract class Base3 extends Base{
    public void th(){
        System.out.println("Greet");
    }
    abstract public void gree();
}
public class abstrract {
    public static void main(String[] args) {
    Base2 b = new Base2();
    b.greet();
    }
}
