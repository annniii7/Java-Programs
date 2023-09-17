package practiceset6;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        float arr[]={1.2f,2.4f,5.5f,6.9f,10.5f};
//        float sum=0;
//        for (int i = 0; i < arr.length; i++) {
//            sum=sum+arr[i];
//        }
//        System.out.println("sum is :" + sum);
        Scanner sc =new Scanner(System.in);
        System.out.println("enter n");
        int n= sc.nextInt();

        int arr[]={1,3,5,9,11,16,17};
        System.out.println(linearsearch(arr,n));

        }
      static   int  linearsearch(int arr[],int m){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==m){
                    return m;
                }

                }

            System.out.println("number not found");
              return -1;

            }
    }



