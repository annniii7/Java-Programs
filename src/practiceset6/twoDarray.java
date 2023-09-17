package practiceset6;
import java.util.Scanner;
public class twoDarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[][]={{1,2,4},{4,5,6}};
        for (int i = 0; i <2 ;i++) {
            for (int j = 0; j <3; j++) {
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        int arr2[][]={{7,8,9},{10,11,12}};
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        int arr3[][]=new int[2][3];
        for (int i = 0; i <2 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr3[i][j]=arr[i][j]+arr2[i][j];
            }

        }
        for (int i = 0; i <2; i++) {
            for (int j = 0; j <3 ; j++) {
                System.out.print(arr3[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }


    }
}
