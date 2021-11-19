
public class Main {
    public static void main(String[] args) {
        int[][] array = {{ 1, 2, 3, 4} , { 4, 5, 6, 7} , { 6, 7, 8, 9}};
        int max = array[1][1];
        for (int[] arr : array) {
            for (int j = 0; j < 4; j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
        }
        System.out.println(max);
    }
}
