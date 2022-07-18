import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 2 so can tim uoc chung lon nhat");

        System.out.println("Nhap so a: ");
        int a = scanner.nextInt();

        System.out.println("Nhap so b: ");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
        {
            System.out.println("Khong co GCD do 1 so bang 0");
        }

        while (a!=b)
        {
            if (a>b)
                a = a - b;
            else
                b = b-a;
        }

        System.out.println("GCD cua 2 so a va b la: " + a);
    }
}
