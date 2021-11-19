public class Main {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};
        int[] arr = new int[array1.length + array2.length];
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= 5) {
                arr[i] = array2[count1];
                System.out.print(arr[i] + " ");
                count1++;
            }else {
                arr[i] = array1[count2];
                System.out.print(arr[i] + " ");
                count2++;
            }
        }
    }
}
