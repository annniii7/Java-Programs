package practiceset6;

public class maxinarray {
    public static void main(String[] args) {
        int[] arr = {4, 9, 16, 1,71, 99, 190};
       int min=arr[0];
        for (int  i = 0;i<arr.length ;i++) {
            if(arr[i]<min){
                min=arr[i];
            }


        }
        System.out.println(min);
    }
//

    }
