import java.util.*;

public class main {

    public static void main(String[] args) {

        String[] students = {"Chirstian", "Michael", "Camila", "Sienna",
                "Tanya","Loc","Connor","Zoe", "Mallory","Emily"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name's student: ");
        String input = scanner.nextLine();

        boolean isExist = false;
        for (int i =0; i< students.length; i++){
            if (students[i].equalsIgnoreCase(input)){
                System.out.println("Position of the students in the list "
                        + input + " is " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) System.out.println("Not found" + input + " in the list.");
    }
}
