package OOP;

class Base1{
    public Base1(){
        System.out.println("I am base class constructor");
    }
    public Base1(int x){
        System.out.println("I am an overloaded constructor with value:" + x);
    }
}
class Derived1 extends Base1{
    public Derived1(){
        System.out.println(" I am derived class constructor");
    }
    public Derived1(int x,int y){
        super(x);
        System.out.println("I am derived class constructor with value:" +y);
    }
}
class childderived extends Derived1{
    public childderived(){
        System.out.println("I am childofderived class constructor");
    }
    public childderived(int x,int y,int z){
        super(x,y);
        System.out.println("I am overloaded constructor with value:" +z);
    }
}
public class constructor {
    public static void main(String[] args) {
        childderived ob=new childderived(1,2,3);

    }
}
