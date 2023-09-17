package javatopics;

import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=6000;
        System.out.println("enter a number");
        try {
            int b=sc.nextInt();
            int c=a/b;
            System.out.println("The result is " + c);

        }
        catch (Exception e){
            System.out.println("the program is stopped due to absurd input");
            System.out.println(e);

        }
        finally {
            System.out.println("Program ends");
        }





    }
}
