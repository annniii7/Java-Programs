import java.util.Scanner;
public class incometaxcalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's annual income: ");
        double income = scanner.nextDouble();
        scanner.close();
        double tax = 0.0;
        if (income <= 50000) {
            tax = 0.0;
        } else if (income <= 60000) {
            tax = (income - 50000) * 0.10;
        } else if (income <= 150000) {
            tax = (10000 * 0.10) + (income - 60000) * 0.20;
        } else {
            tax = (10000 * 0.10) + (90000 * 0.20) + (income - 150000) * 0.30;
        }
        System.out.println("Income Tax to be paid: Rs. " + tax);
    }
}
