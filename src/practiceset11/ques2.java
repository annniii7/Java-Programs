package practiceset11;
 class Monkey{
     public void jump(){
         System.out.println("I am jumping");
     }
     public void bite(){
         System.out.println("stay away else i'll bite you");
     }
 }
 interface BasicAnimal{
     void eat();
     void sleep();
 }
 class Human extends Monkey implements BasicAnimal{
     @Override
     public void eat() {
         System.out.println("I have to work to earn bread ");
     }

     @Override
     public void sleep() {
         System.out.println("rest is the ultimate recovery");
     }
 }
public class ques2 {
     public int a=5;
     protected int b=1;
     int c=11;
    public static void main(String[] args) {
        Human h=new Human();
        h.eat();
        h.sleep();
        h.jump();
        h.bite();
    }
}
