import java.util.*;

public class Main {

    public static boolean isPrime(int number){
        boolean check = true;
        if (number < 2)
        {
            check = false;
        }
        else
        {
            int i =2;
            while (i <= Math.sqrt(number))
            {
                if (number % i == 0)
                {
                    check = false;
                    break;
                }
                i ++;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int N = 2;

        while (count < 20){
            if (isPrime(N)) {
                System.out.print(N + " ");
                count ++;
            }
            N++;
        }
    }
}
