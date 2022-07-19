import java.util.*;

public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while (choice != 0)
        {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle.");
            System.out.println("2. Print the square triangle. ");
            System.out.println("3. Print the isosceles triangle. ");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("Input length: ");
                    int length = scanner.nextInt();
                    System.out.println("Input Width: ");
                    int width = scanner.nextInt();
                    //ve hinh chu nhat
                    for (int i = 1; i <= width; i++)
                    {
                        for (int j = 1; j <= length; j++) {
                            System.out.print("*");
                        }
                    System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Draw the triangle square");
                    //nhap chieu cao cua tam giac
                    System.out.println("Input height of triangle: ");
                    int height = scanner.nextInt();

                    //lua chon ve goc vuong o top-bot-left, top-bot-right
                    System.out.println("1. Corner Square at bot-left");
                    System.out.println("2. Corner Square at top-left");
                    System.out.println("3. Corner Square at bot-right");
                    System.out.println("4. Corner Square at top-right");
                    int choice1 = scanner.nextInt();
                    switch (choice1)
                    {
                        //ve tam giac vuong o bot-left
                        case 1:
                            System.out.println("Corner Square at bot-left");
                            for (int i = 1; i <= height;i++){
                                for (int j =1; j <= i; j++){
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            //ve tam giac vuong o top left
                            System.out.println("Corner Square at top-left");
                            for (int i = height; i>=1; i--){
                                for (int j = 1; j<=i;j++){
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;

                        case 3:
                            //ve tam giac vuong o bot right
                            System.out.println("Corner Square at bot-right");
                            for (int i = 1; i <= height; i++)
                            {
                                for (int j = 1; j <= height - i; j++)
                                {
                                    System.out.print(" ");
                                }
                                for (int k = 1; k <= i; k++){
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;

                        case 4:
                            // ve tam giac o top right
                            System.out.println("Corner Square at top-right");
                            for (int i = height; i >= 1 ; i--) {
                                for (int j = 1; j <= height - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 1; k <= i; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles rectangle");

                    //nhap vao chieu cao tam giac
                    System.out.println("Input height: ");
                    int height1 = scanner.nextInt();
                    for (int i = 1; i <= height1; i++)
                    {
                        for (int j = 1; j <= height1 - i; j++)
                        {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2*i - 1; k++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
