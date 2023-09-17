package OOP;

interface camera{
    void takesnap();
    void recordvideo();
    private void GPS(){
        System.out.println("enabling gps");
    }
    default void recordin4k(){
        GPS();
        System.out.println("recording in 4k");
    }
}
interface WiFi{
    String[] getnetworks();
    void connecttonetwork(String network);

}
class Myphone{
    public void callnumber(long phone_number){
        System.out.println("calling" + phone_number);
    }
    public void pickcall(){
        System.out.println("connecting");
    }
}

class Smartphone extends Myphone implements WiFi,camera{
    @Override
    public void takesnap() {
        System.out.println("taking snap");
    }

    @Override
    public void recordvideo() {
        System.out.println("recording video");
    }

    @Override
    public String[] getnetworks() {
        String [] networks={"anirudh","dadichi","sharma"};
        return networks;
    }

    @Override
    public void connecttonetwork(String network) {
        System.out.println("connecting to " + network);
    }
}
public class interfaces1 {
    public static void main(String[] args) {
        Smartphone sp=new Smartphone();
        sp.callnumber(600501675);
        sp.pickcall();
        sp.takesnap();
        sp.getnetworks();
        sp.connecttonetwork("anirudh");
        sp.recordin4k();


    }
}
