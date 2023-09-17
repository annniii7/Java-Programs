package javatopics;

import java.util.Scanner;

public class nested_try_catch {
    public static void main(String[] args) {
        int []arr=new int[3];
        arr[0]=50;
        arr[1]=40;
        arr[2]=80;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the index you want to access ");
        int ind = sc.nextInt();
        try {
            try {
                System.out.println("the value at index " + arr[ind]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException" + e);
            }
        }
        catch (Exception e){
            System.out.println("exception handled " + e);
        }
    }
}
