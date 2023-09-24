interface sample{
    void method1();
    void method2();
}
interface child extends sample{
    void method3();
    void method4();
}
class mysample implements child{
    public void method3(){
        System.out.println("method3");
    }
    public void method4(){
        System.out.println("method4");
    }
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method2");
    }
}
public class intergfaceinheritance {
    public static void main(String[] args) {
        mysample s = new mysample();
        s.method1();
        s.method2();
        s.method3();
        s.method4();
    }
}
