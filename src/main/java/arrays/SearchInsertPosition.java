package arrays;

public class SearchInsertPosition {
        public static int searchInsert(int[] nums, int target) {

            if (nums[nums.length - 1] < target) {
                return nums.length;
            }

            for (int j = 0; j < nums.length; j++) {
                if (target > nums[j]) {
                    return j + 1;
                }
            }
            int i;
            for (i = 0; i < nums.length; i++) {
                if ((nums[i] != target)) {
                    return -1;
                }

            }
            return i;
        }


    public static void main(String[] args) {
            int[] nums = {1,4,5,7};
        System.out.println(searchInsert(nums,5));


        int[]numss= {1,3,5,6};
        System.out.println(searchInsert(numss,2));

        int []numsss= { 1,3,5,6};
        System.out.println(searchInsert(numsss,7));

    }
}
