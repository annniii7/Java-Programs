package precticeset7;

public class average {
    static float average(int...arr){
        float average=0;
        int c=0;
        for (int a :arr) {
           average+=a;
            c++;
        }
        average=average/c;
        return average;


    }
    public static void main(String[] args) {
        System.out.println(average(1,2,3,4,7,9,11));
    }
}
