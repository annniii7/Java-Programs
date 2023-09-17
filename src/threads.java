import java.util.*;
class thread0 extends Thread{
    @Override
    public void run() {
        int m=15;
                while(m==15){
        System.out.println("to print fibonacci series upto 10 numbers");
        int n=0;
        int i=0;
        int j=1;
        System.out.print(i + " " + j + " " );
        while(n<8){
            int k=i+j;
            System.out.print(k + " ");
            int temp=j;
            j=k;
            i=temp;
            n++;
        }
                    System.out.println();

                }
        
    }
}
class thread1 extends Thread{
    @Override
    public void run() {
        int l=15;
        while(l==15){
        int i=10;
        while(i>0){
            System.out.print(i +" ");
            i--;
        }
            System.out.println();

    }
}
}
public class threads extends Thread{
    public static void main(String[] args) {
        thread0 t1=new thread0();
        thread1 t2=new thread1();
        t1.start();
        t2.start();
        
    }
    
}

