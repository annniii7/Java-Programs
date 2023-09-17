package javatopics;

public class finally_block {
    public static int div(int a,int b){
        try {
            int c=a/b;
            return c;

        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        finally {//--->code inside finally will always run despite  any condition.
            System.out.println("program ends");
        }
        return -1;

    }
    public static void main(String[] args) {
        int r=div(5,2);
        System.out.println(r);

    }
}

//points to remember about finally block
//1.even after break condition finally block will run.
