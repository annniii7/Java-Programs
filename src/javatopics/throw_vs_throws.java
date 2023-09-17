package javatopics;

class NegativeradiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class throw_vs_throws {
    public static double area(int radius) throws NegativeradiusException{
        if(radius<0){
            throw new NegativeradiusException();
        }
        double result1 =Math.PI*radius*radius;
        return result1;

    }
    public static int division(int a,int b) throws ArithmeticException{
        int result=a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
            int c=division(6,0);
            System.out.println(c);

        }
        catch (Exception c){
            System.out.println("exception caught");
        }
        try {
            double ar=area(-2);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
        }



    }
}
