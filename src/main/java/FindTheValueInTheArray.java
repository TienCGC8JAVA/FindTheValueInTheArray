import java.util.Scanner;

public class FindTheValueInTheArray {
    static String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name’s student:");
        String input_name = scanner.nextLine();
        int count = isExist(input_name);
        outputName(count, input_name);
    }

    private static int isExist(String input_name) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                count = i;
                break;
            }
        }
        return count;
    }

    private static void outputName(int count, String input_name) {
        if (count != 0) System.out.println("Position of the students in the list " + input_name + " is: " + (count + 1));
        else  System.out.println("Not found" + input_name + " in the list.");
    }
}