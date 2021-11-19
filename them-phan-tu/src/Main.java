import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 };
        int[] newArray = new int[array.length + 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần thêm :");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm :");
        int index = scanner.nextInt();
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
            System.out.println(newArray[i]);
        }
        for (int i = index; i < newArray.length; i++) {
            newArray[index + 1] = array[index];
            System.out.println(newArray[i]);
        }
    }
}
