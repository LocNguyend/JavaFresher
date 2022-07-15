import java.util.*;

public class Main {
    public static void main(String[] args) {

        int rate = 23000;
        double VND,USD;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien USD chuyen doi sang VND ?");
        USD = scanner.nextDouble();

        VND = USD * rate;

        System.out.printf("%0.2f USD chuyen thanh %0.2f VND",USD, VND);
    }
}
