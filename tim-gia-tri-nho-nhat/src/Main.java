public class Main {
    public static void main(String[] args) {
        int[] array = { 10, 22, 33, 4, 5, 6, 7, 8, 9};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất là : " + min);
    }
}
