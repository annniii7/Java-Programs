package OOP;

class mythre1 extends Thread{
    public void run(){
        int i=0;
        while (i < 40) {
            System.out.println("heelooooo");
            i++;
            try {
                Thread.sleep(450);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }  
        }
    }

}
class mythre2 extends Thread{
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("heyyyyyyyy");
            i++;
        }
    }

}
public class thread_methods {
    public static void main(String[] args) {
        mythre1 th=new mythre1();
        mythre2 th1=new mythre2();
        th.start();
//        try {
//            th.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        th1.start();
    }
}
