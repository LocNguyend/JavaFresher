import java.util.*;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        //Nhap kich thuoc cua mang
        do{
            System.out.println("Enter size of array: ");
            size = scanner.nextInt();
            if (size > 20) System.out.println("Size does not exceed 20");
        }while(size > 20);

        //Nhap mang
        array = new int[size];
        int i =0;
        while (i< array.length){
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        //In mang
        System.out.printf("%-20s%s","Elements in array: ","");
        for (int j = 0; j< array.length; j++){
            System.out.print(array[j]+"\t");
        }

        //Tim max trong bang
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if (array[j] > max){
                max = array[j];
                index = j+1;
            }
        }

        System.out.println("\nMax of array is " + max + " at position "
                + index);
    }
}
