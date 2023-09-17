package OOP;

 abstract class parent{
    public void greet(){
        System.out.println("good morning");
    }
    public void greet1(){
        System.out.println("Have a Nice Day");
    }
    abstract public void fun();
}
class child extends parent{
    @Override
    public void fun() {
        System.out.println("I am fun function");
    }
}
abstract class child2 extends parent{
  public void call(){
      System.out.println("I am call function");
  }
}
public class abstract_Class {
     public static void fun1(){
         System.out.println("i am fun1");
     }
    public static void main(String[] args) {
//        child c=new child();
//        c.fun();
//        c.greet();
//        c.greet1();
        fun1();
     
//        abstract_Class obj=new abstract_Class();
//        obj.fun1();
    }
}
/*1.we cannot create an object of an abstract class.
  2.we have to override the abstract method in the derived class in  order to make it work.
  3. An abstract class is created by creating an abstract method in it.
  4.with the object of derived class we can access any method or data member of the abstract class.
  5.In abstract class simple methods can also be declared.
*/