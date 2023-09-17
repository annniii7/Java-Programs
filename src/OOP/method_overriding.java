package OOP;

class A{
    public void method(){
        System.out.println("I am inside class A");
    }
}
class B extends A{
    @Override
    public void method(){
        System.out.println("I am inside class B");
    }
}
public class method_overriding {
    public static void main(String[] args) {
        A obj=new A();
        obj.method();
        B obj1=new B();
        obj1.method();

    }
}
