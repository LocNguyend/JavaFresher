import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.println("Nhap vao so nam: ");
        year = scanner.nextInt();

        boolean isLeapYear = false;

        boolean isDiviBy4 = year % 4 == 0;
        if(isDiviBy4)
        {
            boolean isDiviBy100 = year % 100 == 0;
            if(isDiviBy100){
                boolean isDiviBy400 = year % 400 == 0;
                if(isDiviBy400){
                    isLeapYear = true;
                }
            }
            else
            {
                isLeapYear = true;
            }
        }

        if(isLeapYear){
            System.out.printf("Nam %d la nam nhuan\n",year);
        }
        else
        {
            System.out.printf("Nam %d khong phai la nam nhuan\n",year);
        }
    }
}
