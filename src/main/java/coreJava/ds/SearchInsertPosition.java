package coreJava.ds;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for (int position = 0; position < nums.length; position++) {
            if (target <= nums[position])
                return position;

        }
        return nums.length;
    }

    int bSearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;


        int mid = 0;
        while (high >= low) {
            mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {  // 1 3 5 7 9
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println("not found");
        return arr[mid] > target ? mid : mid + 1;
    }
}
