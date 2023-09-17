package practiceset13;

class mythread extends Thread{
    mythread(String name){
        super(name);

    }
    @Override
    public void run() {
        int i=0;
        while (i<40) {
            System.out.println("Good Morning");
            i++;
        }
    }
}
class mythread1 extends Thread{
    mythread1(String name){
        super(name);
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(200);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        int i=0;
        while (i<40) {
            System.out.println("Welcome");
            i++;

        }
    }
}
public class ques1 {
    public static void main(String[] args) {
        mythread thr=new mythread("ANIRUDH");
        mythread1 thr1=new mythread1("VASU");
//        thr.setPriority(Thread.MAX_PRIORITY);
//        thr.setPriority(Thread.MIN_PRIORITY);
//        System.out.println("get state of thr:" + thr.getState());
//        System.out.println("get state of thr1:" + thr1.getState());
         thr.start();
        thr1.start();
        System.out.println( Thread.currentThread());

//        System.out.println("get state of thr:" + thr.getState());
//        System.out.println("get state of thr1:" + thr1.getState());
//        System.out.println("get priority of thr:" + thr.getPriority());
//        System.out.println("get priority of thr1:" + thr1.getPriority());



    }
}
