package javatopics;

import java.util.Scanner;

public class exception_handling1 {
    public static void main(String[] args) {
        int []arr=new int[3];
        arr[0]=50;
        arr[1]=40;
        arr[2]=80;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the index you want to access ");
        int ind = sc.nextInt();
        System.out.println("enter the you want to divide with");
        int num=sc.nextInt();
        try {
            System.out.println("The value at of array " +arr[ind]);
            System.out.println("The result of division is " +arr[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException" + e);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException" + e);

        }
        catch (Exception e){
            System.out.println("Some other exception" + e);

        }

    }
}
