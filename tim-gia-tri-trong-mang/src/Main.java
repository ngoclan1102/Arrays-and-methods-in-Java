import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student : ");
        String name = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)){
                System.out.println("Position of the students in the list " + name + " is: " + i);
               check = false;
               break;
            }
        }
        if (check) {
            System.out.println("Not found " + name + " in the list.");
        }
    }
}
