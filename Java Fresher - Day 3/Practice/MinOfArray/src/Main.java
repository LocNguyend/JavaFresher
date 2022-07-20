import java.util.*;

public class Main {

    public static int minValue(int[] array){
        int index = 0;
        for (int i = 1; i < array.length; i++){
            if (array[i] < array[index]){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {3,4,13,42,3,4,1};
        int index = minValue(array);
        System.out.println("The minimum element in the array is: "+array[index]
                + " at position " + (index+1));
    }
}
