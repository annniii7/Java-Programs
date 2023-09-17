package precticeset7;

public class patternwithrecursion {
    static void recursion(int n){
        if(n>0){
            for (int i = 0; i <n ; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            recursion(n-1);
        }
    }
    static void pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for (int i = 0; i <n ; i++) {
                System.out.print("*" + " ");

            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
//        recursion(4);
        pattern_rec(4);

    }
}
