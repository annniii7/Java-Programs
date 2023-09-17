package practiceset6;

public class sortedarray {
    static void change(int arr[]){
        arr[1]=33;
    }

    public static void main(String[] args) {
        int arr[]={1,25,98,-1,2100};
        change(arr);
        System.out.println("after executing change function:" + arr[1]);
//     boolean issorted=true;
//        for (int i = 0; i <arr.length-1 ; i++) {
//            if(arr[i]>arr[i+1]){
//                issorted=false;
//            }
//        }
//        if (issorted){
//            System.out.println("array is sorted");
//        }
//        System.out.println("array is not sorted");
//    }
}}
