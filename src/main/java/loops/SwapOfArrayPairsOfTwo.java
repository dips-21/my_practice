package loops;

public class SwapOfArrayPairsOfTwo {
    static void swapOfArrayPairs(int[] array) {
        // for (int start = 0, end = start + 1; start < array.length; start += 2, end--) {
        for (int i = 0; i < array.length; i += 2) {
            int end = i+1;

            int temp = array[i];
            array[i] = array[end];
            array[end] = temp;

        }
    }
}

        // a[i] a[i+1] i=0;i<end ;i+=2 //
/* static void swapOfArrayInPairs(int[] array) {
        for (int start = 0, end = start + 1; start < array.length; start += 2, end--) {
            for (int i = start; i < end; i++) {
                int temp = array[i];
                array[i] = array[end];
                array[end] = temp;
            }*/

