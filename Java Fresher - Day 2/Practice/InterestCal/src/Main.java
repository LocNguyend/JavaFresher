import java.util.*;

public class Main {

    public static void main(String[] args) {
        double money = 0.0;
        int month = 0;
        double interestRate = 1.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount: ");
        money = scanner.nextDouble();

        System.out.println("Enter number of month: ");
        month = scanner.nextInt();

        System.out.println("Enter interest rate in percentage: ");
        interestRate = scanner.nextDouble();

        double total =0;
        for (int i =0; i<month; i++)
            {
            total += money * (interestRate/100)/12 * month;
        }

        System.out.println("Total of interest: " + total);
    }
}
