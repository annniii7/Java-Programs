package OOP;

class mythr extends Thread{
       public mythr (String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("mythr is running");
    }
}
public class multithreading2 {
    public static void main(String[] args) {
        mythr th=new mythr("Anirudh");
        mythr th1=new mythr("Anirudh sharma");
        th.start();
        th1.start();
        System.out.println("The id of thread is:" + th.getId());
        System.out.println("The id of thread is:" + th.getName());
        System.out.println("The id of thread is:" + th1.getName());
        System.out.println("The id of thread is:" + th1.getId());



    }
}
