package algo.recursion;

public class BinarySearchWithoutRecursion {
    int getBinarySearch(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        for (int i = 0; i < arr.length; i++) {
            mid = arr[start] + (arr[start] - arr[end]) / 2;
            if (num == mid) {
                return mid;
            }
            if (num > mid) {
                end = arr[i];
                start = mid + 1;
                return mid;
            }

            if (num < mid) {
                end = mid - 1;
                start = arr[i];
                return mid;
            }
        }
        return -1;
    }
}
