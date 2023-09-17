package javatopics;

import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return "I AM TO STRING";
    }

    @Override
    public String getMessage() {
        return "I AM GET MESSAGE";
    }
}

public class Exception_class {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a<9){
        try {
            throw new  MyException();
        }
        catch (Exception e){
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("finished");

        }
        }



    }
}
