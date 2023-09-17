package precticeset7;
import java.util.Scanner;

public class fiborecursion {
    static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1 ||n==2){
            return 1;
        }
        return fibo(n-1) +fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the nth term");
        int n=sc.nextInt();
        System.out.println(fibo(n));

    }
}
