package javatopics;

public class Varargs {
    static int  sum(int ...arr){// values which are passed are stored in the form, of array
        int sum=0;
        for (int a:arr) {// for each a in an array
            sum+=a;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("sum is:" + sum(1,2));
        System.out.println("sum is:" + sum(1,2,3,4,54));

    }
}
/* We use Varargs to pass any any no. of parameters while calling the function. */