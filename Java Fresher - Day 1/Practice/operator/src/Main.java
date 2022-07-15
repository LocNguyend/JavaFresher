import java.util.*;

public class Main {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Width: ");
        width = scanner.nextFloat();

        System.out.println("Height: ");
        height = scanner.nextFloat();

        float area = width*height;

        System.out.println("Area is: " + area);
    }
}
