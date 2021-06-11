package datastructure.binarysearch;

public class Search {

    boolean search(int[] numbers, int key) {
        int start = 0;
        int end = numbers.length - 1;
        // int mid = start + (end - start) / 2;

        while (start <= end) {
            int mid = (end + start) / 2;

            if (key == numbers[mid]) {
                return true;
            }

            if (key > numbers[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return false;
    }
}