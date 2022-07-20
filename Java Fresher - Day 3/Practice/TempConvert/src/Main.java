import java.util.*;

public class Main {

    public static double CtoF(double C){
        double F = (9.0 / 5) * C + 32;
        return F;
    }

    public static double FtoC(double F){
        double C = (5.0 / 9) * (F - 32);
        return C;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double F;
        double C;

        int choice;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            choice = scanner.nextInt();

            switch (choice){
                case 1: {
                    System.out.println("Enter fahrenheit: ");
                    F = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: "+ FtoC(F));
                    break;
                }

                case 2: {
                    System.out.println("Enter Celsius: ");
                    C = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + CtoF(C));
                    break;
                }
                case 0:
                    System.exit(0);
            }

        }while (choice != 0);
    }
}
