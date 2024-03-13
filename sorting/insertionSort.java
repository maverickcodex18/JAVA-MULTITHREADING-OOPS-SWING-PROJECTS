package sorting;
import java.util.Arrays;
public class insertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j--];
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        System.out.println("Chitransh Agrawal\n22115026");
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
