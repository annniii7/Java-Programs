package precticeset7;

public class methods {
    static void table(int n){
        int product=1;
        for (int i = 1; i <=10 ; i++) {
            product=n*i;
        System.out.println(n+ " *" + i + " =" + product);
        }

    }
    public static void main(String[] args) {
        table(8);

    }
}
