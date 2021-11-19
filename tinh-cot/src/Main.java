import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = {{1,2,3},{3,4,5},{6,5,4},{7,8,9}};
        int sum = 0;
        System.out.println("Nhập cột muốn tính tổng :");
        int number = scanner.nextInt();

        for (int i = 0; i < array[1].length; i++) {
                    sum = sum + array[i][number - 1];

            }
        System.out.println("sum = " + sum);
        }
    }

