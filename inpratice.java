///practice1
// abstract class pen{
//    abstract void write();
//     abstract void refill();
// }
// class Fountainpen extends pen{
//     void write(){
//         System.out.println("Writing");
//     }
//     void refill(){
//         System.out.println("refilling");
//     }
// }

//practice 2
// class monkey {
//     public void jump(){
//         System.out.println("Monkey is jumping");
//     }
//     public void bite(){
//         System.out.println("Monkey is bitting");
//     }
// }
// interface Animal{
//     public void eat();
//     public void sleep();
// }
// class Human extends monkey implements Animal{
//     public void eat(){
//         System.out.println("Monkey is eating");
//     }
//     public void sleep(){
//         System.out.println("Monkey is sleeping");
//     }
// }

//practice 4
// abstract class Telephone{
//     abstract public void ring();
//     abstract public void lift();
//     abstract public void disconnect();
// }
// class smartphone extends Telephone{
//     public void ring(){
//         System.out.println("Phone is ringing");
//     }
//     public void lift(){
//         System.out.println("Phone is lift");
//     }
//     public void disconnect(){
//         System.out.println("Phone is disconnect");
//     }
//     public void received(){
//         System.out.println("phone recived");
//     }
// }

// practice 6
// interface smarttvremote{
//     public void volumeup();
//     public void volumedown();
// }
// interface TVremote extends smarttvremote{
//     public void mute();
// }
// class remote implements TVremote{
//     public void volumeup(){
//         System.out.println("Volume increase");
//     }
//     public void volumedown(){
//         System.out.println("Volume decrease");
//     }
//     public void mute(){
//         System.out.println("sound is mute");
//     }
// }

// practice 7
interface TVremote{
    public void mute();
}
class TV implements TVremote{
    public void mute(){
        System.out.println("Just mute");
    }
}
public class inpratice {
    public static void main(String[] args) {
        //practice1
        // Fountainpen f = new Fountainpen();
        // f.write();
        // f.refill();

        //practice 2
        // Human h = new Human();
        // h.bite();
        // h.jump();
        // h.eat();
        // h.sleep();

        //practice 4
        // Telephone t = new smartphone();
        // t.disconnect();
        // t.lift();

        // smartphone s = new smartphone();
        // s.received();

        //practice6
        // remote r = new remote();
        // r.volumedown();
        // r.volumeup();
        // r.mute();

        //practice 7
        TV t = new TV();
        t.mute();
    }
}
