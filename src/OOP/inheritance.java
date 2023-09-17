package OOP;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derived extends Base{
    int y;
    public int getY(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}
public class inheritance {
    public static void main(String[] args) {
        //Base class object
        Base b=new Base();
        b.setX(4);
        System.out.println(b.getX());
        // derived class object
        Derived d=new Derived();
        d.sety(5);
        System.out.println(d.getY());

    }
}
