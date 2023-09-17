package practiceset6;
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
        // sum of first even numbers
        System.out.println("enter n");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        while(i<=n){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("sum is "+ sum);

    }
}
