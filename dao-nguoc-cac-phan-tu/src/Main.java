import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array;
         array  = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number : ");
           array[i] = scanner.nextInt();
        }
        for (int j = 0; j < 10; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println(" ");
        for (int k = 0; k < array.length/2; k++) {
            int number = array[k];
            array[k] = array[array.length - 1 - k];
            array[array.length - 1 - k] = number;
        }
        for (int arr : array) {
            System.out.print(arr + "\t");
        }
    }
}