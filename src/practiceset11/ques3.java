package practiceset11;

 abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void  disconnect();
}
class Smartphone extends telephone{
     public void music(){
         System.out.println("playing music");
     }

    @Override
    void ring() {
        System.out.println("Ringing");
    }

    @Override
    void lift() {
        System.out.println("lifting the phone");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting the call");
    }
}
public class ques3 {
    public static void main(String[] args) {
        telephone nokia=new Smartphone();// only those functions are accessible which are mentioned inside the telephone class.bcz the reference is telephone class
        nokia.ring();
        nokia.lift();
        nokia.disconnect();
        Smartphone nord=new Smartphone();
        nord.music();//here all functions of the smartphone class are accessible



    }
}
