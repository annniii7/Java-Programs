package javatopics;

public class recursion {
    static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else
            return n * factorial(n-1);

    }
    static void fibo(int n){
        int a=0;
        int b=1;
        int c=a+b;
        for (int i = 0; i <n ; i++) {
            System.out.print(c + " ");
             c=a+b;
            a=b;
            b=c;

        }

    }
    static int fiborecursion(  int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return fiborecursion(n-1)+fiborecursion(n-2);//1

    }
    public static void main(String[] args) {
        System.out.println(" to find factorial of a number using recursion");
        int n=5;
//        System.out.println("factorial of " + n + "is " + factorial(n));
//        fibo(1);
        for (int i = 0; i <4 ; i++) {
            System.out.print(fiborecursion(i) + " ");

        }
    }
}
