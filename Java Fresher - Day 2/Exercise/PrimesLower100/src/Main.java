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
        for (int i =2; i<=100; i++)
        {
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
