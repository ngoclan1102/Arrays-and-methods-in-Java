public class Main {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Giá trị lớn nhất là : " + max);
    }
}
