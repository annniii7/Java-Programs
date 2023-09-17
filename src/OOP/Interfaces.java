package OOP;

interface Bicycle{
    int a=5;
    void applybrake(int decrement);
    void speedup(int increment);
}
interface hornbicycle{
    void blowhorn1();
    void blowhorn2();
}
class Avoncycle implements Bicycle,hornbicycle{
    public void blowhorn(){
        System.out.println("pepe peeep ppp");
    }

    @Override
    public void applybrake(int decrement) {
        System.out.println("Applying brakes");
    }
    public void speedup(int increment){
        System.out.println("speeding up");

    }

    @Override
    public void blowhorn1() {
        System.out.println("I am blowhrn1");
    }

    @Override
    public void blowhorn2() {
        System.out.println("I am blowhorn2");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Avoncycle cycle=new Avoncycle();
        cycle.applybrake(2);
        cycle.speedup(3);
        cycle.blowhorn();
        //you can create properties in interface
        System.out.println(cycle.a);
        // you cannot modify properties in interfaces as they are final.
    }
}
/*
1. Interfaces are by default abstract classes in which all the methods are abstracted.
2.The data members in the interfaces are final & we cannot modify them.
3.They are used with the help of implements keyword.
4.they support multiple inheritances.
5.methods declared in interfaces must be overridden in the derived class.
*/



