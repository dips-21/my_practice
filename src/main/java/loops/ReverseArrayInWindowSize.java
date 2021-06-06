package loops;

public class ReverseArrayInWindowSize {
    static void reverseArrayInWindowSize(int[] array, int size) {
        int i=0;
        for (;i+size-1 < array.length; i += size) {
            int start = i, end = start + size - 1;
            reverseSubArray(array, start, end);
        }
       /* //i-len to reverse last window smaller than window size
        if(i<array.length) {
            reverseSubArray(array,i,array.length-1);
        }*/

    }

    private static void reverseSubArray(int[] array,int start, int end) {
        for ( ; start < end; start++, end--) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
    }
}
