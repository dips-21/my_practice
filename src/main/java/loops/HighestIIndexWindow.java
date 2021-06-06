package loops;

public class HighestIIndexWindow {
    static void printHighestInSlidingWindow(int[] array, int windowSize) {

        for (int start = 0; start <= array.length - windowSize; start++) {
            int max = Integer.MIN_VALUE;
            for (int end = start ; end < start + windowSize; end++) {
                if (max < array[end]) {
                    max = array[end];
                }
            }
            System.out.print(max + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {16, 3, 9, 4, 10, 3, 12};
       printHighestInSlidingWindow(array, 3);
        printLowestIndexWindow(array,3);
    }

    static void printLowestIndexWindow(int[] array, int windowSize) {
        for (int start = 0; start < array.length - windowSize; start++) {
            int min = Integer.MAX_VALUE;
            for (int end = start ; end < start + windowSize; end++) {
                if (min > array[end]) {
                    min = array[end];
                }

            }
            System.out.print(min + " ");
        }
    }
}









