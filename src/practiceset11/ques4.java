package practiceset11;
interface tvremote{
    void nxtchannel();
    void volumeup();
    void volumedown();

}
interface Smartremote extends tvremote{
    void prime();
    void netflix();
}
class smarttv implements Smartremote{
    @Override
    public void prime() {
        System.out.println("opening amazon prime video");
    }
    @Override
    public void netflix() {
        System.out.println("opening netflix ");
    }

    @Override
    public void nxtchannel() {
        System.out.println("next channel");
    }

    @Override
    public void volumedown() {
        System.out.println("turning volume down");
    }

    @Override
    public void volumeup() {
        System.out.println("raising the volume");
    }
}
public class ques4 {
    public static void main(String[] args) {
        smarttv mi=new smarttv();
        mi.prime();
        mi.netflix();
        mi.nxtchannel();
        mi.volumedown();
        mi.volumeup();

    }
}
