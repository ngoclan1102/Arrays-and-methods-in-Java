import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Menu ");
        System.out.println("1. Fahrenheit to Celsius ");
        System.out.println("2. Celsius to Fahrenheit ");
        System.out.println("0. Exit ");
        System.out.println("Enter your choice : ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 :
                System.out.println("Nhập số độ F cần đổi :");
                int fahrenheit = scanner.nextInt();
                double celsius = (5.0 / 9) * (fahrenheit - 32);
                System.out.println(fahrenheit + " độ F bằng " + celsius + " độ C");
                break;
            case 2 :
                System.out.println("Nhập số độ C cần đổi :");
                int Celsius = scanner.nextInt();
                double Fahrenheit = (9 / 5.0) * (Celsius - 32);
                System.out.println(Celsius + " độ C bằng " + Fahrenheit + " độ F");
                break;
            case 0 :
                System.exit(0);
                break;
            default :
                System.out.println("No choice !");
        }
    }
}
