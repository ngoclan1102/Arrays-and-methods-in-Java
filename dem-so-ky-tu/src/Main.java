import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array = {"a","s","a","d","f","a","h","a","s"};
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ký tự :");
        String Characters = scanner.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (Characters.equals(array[i])) {
                count++;
            }
        }
        System.out.println("Ký tự " + Characters + " xuất hiện " + count + " lần");
    }
}
