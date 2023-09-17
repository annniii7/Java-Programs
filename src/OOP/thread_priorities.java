package OOP;

class mythr1 extends Thread{
    public mythr1(String name){
        super(name);
    }

    @Override
    public void run() {
        int i=0;
        while(i<40){
        System.out.println("thank" + this.getName());
        i++;
        }
    }
}
public class thread_priorities {
    public static void main(String[] args) {
        mythr1 th=new mythr1("Ani");
        mythr1 th1=new mythr1("Ani 1");
        mythr1 th2=new mythr1("Ani 2");
        mythr1 th3=new mythr1("Ani 3");
        th1.setPriority(Thread.MAX_PRIORITY);
        th1.setPriority(Thread.MIN_PRIORITY);
        th.start();
        th1.start();
        th2.start();
        th3.start();



    }
}
