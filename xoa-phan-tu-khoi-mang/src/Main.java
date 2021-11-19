
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArray = new int[array.length - 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int index = scanner.nextInt();
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
            System.out.println(newArray[i]);
        }
        for (int i = index; i < array.length - 1; i++) {
            newArray[i] = array[i + 1];
            System.out.println(newArray[i]);
        }
    }
}

