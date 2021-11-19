import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng điểm cần nhập :");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Số lượng không được quá 30 !");
            }
        }while (size > 30);
        int[] array = new int[size];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập điểm :");
            array[i] = scanner.nextInt();
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }

        System.out.println("Số lượng học sinh thi đỗ : " + count);
    }
}
