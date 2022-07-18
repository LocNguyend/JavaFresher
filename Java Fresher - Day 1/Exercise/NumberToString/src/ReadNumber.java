import java.util.*;

public class ReadNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so can doc: ");
        int number = scanner.nextInt();

        //doc so co 1 chu so
        if (number < 10 && number >= 0) {
            switch (number) {
                case 0 -> System.out.println("Zero");
                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Nine");
                default -> System.out.println("Valid number");
            }
        }

        // do so co 2 chu so tu 10 -> 20
        else if (number >= 10 && number < 20)
            {
               int sur = number % 10;

                switch (sur) {
                    case 0 -> System.out.println("Ten");
                    case 1 -> System.out.println("Eleven");
                    case 2 -> System.out.println("Twelve");
                    case 3 -> System.out.println("Thirteen");
                    case 4 -> System.out.println("Fourteen");
                    case 5 -> System.out.println("Fifteen");
                    case 6 -> System.out.println("Sixteen");
                    case 7 -> System.out.println("Seventeen");
                    case 8 -> System.out.println("Eighteen");
                    case 9 -> System.out.println("Nineteen");
                    default -> System.out.println("Valid number");
                }
            }

        // doc so co 2 chu so tu 20 -> 100
        else if (number >= 20 && number < 100)
        {
            int number_tens = number / 10;
            int number_ones = number % 10;

            String tens = null, ones = null;

            // doc so hang chuc
            switch (number_tens) {
                case 2 -> tens = "Twenty";
                case 3 -> tens = "Thirty";
                case 4 -> tens = "Forty";
                case 5 -> tens = "Fifty";
                case 6 -> tens = "Sixty";
                case 7 -> tens = "Seventy";
                case 8 -> tens = "Eighty";
                case 9 -> tens = "Ninety";
                default -> System.out.println("Valid number");
            }
            // doc so hang don vi
            switch (number_ones) {
                case 0 -> ones = "";
                case 1 -> ones = "One";
                case 2 -> ones = "Two";
                case 3 -> ones = "Three";
                case 4 -> ones = "Four";
                case 5 -> ones = "Five";
                case 6 -> ones = "Six";
                case 7 -> ones = "Seven";
                case 8 -> ones = "Eight";
                case 9 -> ones = "Nine";
                default -> System.out.println("Valid number");
            }
            // doc so
            System.out.printf("%s %s",tens,ones);
        }

        else if (number >= 100 && number <1000)
        {
            int hundred = number / 100;
            int tenones = number % 100;

            String hhunderd = null;

            // doc so hang tram
            switch (hundred) {
                case 1 -> hhunderd = "One";
                case 2 -> hhunderd = "Two";
                case 3 -> hhunderd = "Three";
                case 4 -> hhunderd = "Four";
                case 5 -> hhunderd = "Five";
                case 6 -> hhunderd = "Six";
                case 7 -> hhunderd = "Seven";
                case 8 -> hhunderd = "Eight";
                case 9 -> hhunderd = "Nine";
                default -> System.out.println("Valid number");
            }

            int hnumber_tens = tenones / 10;
            int hnumber_ones = tenones % 10;

            String htens = null, hones = null;

            // doc so hang chuc
            switch (hnumber_tens) {
                case 2 -> htens = "Twenty";
                case 3 -> htens = "Thirty";
                case 4 -> htens = "Forty";
                case 5 -> htens = "Fifty";
                case 6 -> htens = "Sixty";
                case 7 -> htens = "Seventy";
                case 8 -> htens = "Eighty";
                case 9 -> htens = "Ninety";
                default -> System.out.println("Valid number");
            }
            // doc so hang don vi
            switch (hnumber_ones) {
                case 0 -> hones = "";
                case 1 -> hones = "One";
                case 2 -> hones = "Two";
                case 3 -> hones = "Three";
                case 4 -> hones = "Four";
                case 5 -> hones = "Five";
                case 6 -> hones = "Six";
                case 7 -> hones = "Seven";
                case 8 -> hones = "Eight";
                case 9 -> hones = "Nine";
                default -> System.out.println("Valid number");
            }

            // doc so
            System.out.printf("%s Hundred and %s %s",hhunderd,htens,hones);
        }
        else
        {
            System.out.println("Out of ability");
        }
    }
}
