package OOP;
// creating threads using thread class
class mythread1 extends Thread
{
    @Override
    public void run(){ //--> overriding the run function which is already declared in the thread class
        int i=0;
    while(i<4000){
        System.out.println("thread 1 is running");
        System.out.println("i am happy");
        i++;
    }
    }


}
class mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<4000){
            System.out.println("thread 2 is running");
            System.out.println("i am sad");
            i++;
        }
    }

}
public class multithreading {
    public static void main(String[] args) {
        mythread1 t1=new mythread1();
        mythread2 t2=new mythread2();
        t1.start();
        t2.start();


    }
}
