package practiceset6;

public class reversearray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int [] arr2= new int[6];
        int j=0;
        for (int i = arr.length-1; i>=0 ; i--) {
            arr2[j]=arr[i];
          j+=1;
        }
        for (int k : arr2) {
            System.out.print(k);
            System.out.print(" ");
        }
    }
}
