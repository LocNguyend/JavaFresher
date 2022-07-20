import java.util.*;
import java.lang.*;

public class Test {

    private static int Fibonacci(int n) {
        if (n < 2)
            return 1;
        else
            return Fibonacci(n - 1) + (Fibonacci(n - 2));
    }

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        System.out.println(Fibonacci(45));
        watch.end();
        System.out.println("Time has passed " + watch.getElapsedTime() + " milisecond" );
    }
}
