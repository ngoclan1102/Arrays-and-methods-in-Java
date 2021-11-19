import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Nhập bậc của mảng :");
        int number = scanner.nextInt();
        int[][] array = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "]" + "[" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("sum = " + sum);
    }
}
