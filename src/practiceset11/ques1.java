package practiceset11;

abstract class pen{
    abstract void write();
    abstract void refill();
}
class fountainpen extends pen{
    public void nib(){
        System.out.println("Hello I am nib");
    }
    @Override
    void write() {
        System.out.println("I am writing ");
    }

    @Override
    void refill() {
        System.out.println("Need To Refill");
    }
}
public class ques1 {
    public static void main(String[] args) {
        fountainpen c=new fountainpen();
        c.write();
        c.refill();
        c.nib();


    }
}
