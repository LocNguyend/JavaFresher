import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao thang so may ?");
        int month = scanner.nextInt();

        switch (month) {
            case 2 -> System.out.println("Thang 2 co 28 hoac 29 ngay");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.printf("Thang %d co 31 ngay", month);
            case 4, 6, 9, 11 -> System.out.printf("Thang %d co 30 ngay", month);
            default -> System.out.print("Nhap so thang tu 1-12");
        }

    }
}
