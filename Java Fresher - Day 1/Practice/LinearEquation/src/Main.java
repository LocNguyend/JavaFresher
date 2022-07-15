import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Linear Equation Resolve");
        System.out.println("Given a equation 'a * x + b = c', enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if(a != 0)
        {
            double ans = (c-b)/a;
            System.out.printf("Equation pass with x=%f\n",ans);
        }
        else
        {
            if (b == c)
            {
                System.out.println("All x pass");
            }
            else
            {
                System.out.println("No solution");
            }
        }
    }
}
