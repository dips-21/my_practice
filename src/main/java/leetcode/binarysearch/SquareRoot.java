package leetcode.binarysearch;

public class SquareRoot {
    int sqrt(int target) {
        for (int i = 0; i < target; i++) {
            if (target == i * i)
                return i;

            if (i * i > target)
                return i - 1;

        }
        return 0;
    }
}

class SquareRootWithBinarySearch extends SquareRoot {
    @Override
    int sqrt(int target) {
        int low = 0, high = target;
        int mid = 0;
        long sqr=low;
        while (high >= low) {
            mid = low + (high - low) / 2;  //(low+high)/2
            sqr = mid * (long)mid;
            if (sqr == target)
                return mid;

            if (target < sqr) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return sqr > target ? mid - 1 : mid;
    }

}