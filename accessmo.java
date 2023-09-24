class c1{
    public int x = 5;
    protected int y = 45;
    int z = 6;
    private int a = 78;
    public int geta(){
        return a;
    }
}
public class accessmo {
    public static void main(String[] args) {
        c1 c = new c1();
        System.out.println(c.geta());
    }
}
