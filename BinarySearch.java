import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;  // Move this inside the loop

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid; // target found
            }
        }
        return -1; // target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11, 12, 13};
        int target = 5;
        int ans = binarySearch(arr, target);

        if (ans == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element at index: " + ans);
        }
    }
}
