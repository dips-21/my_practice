package loops;

public class ArrayTripletSumFinder {
    static boolean hasThreeSum(int[] array, int sum) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = i + 2; k < array.length; k++) {
                    //System.out.println(i + " -> " + j);
                    result = array[i] + array[j] + array[k];
                    if (sum == result)
                        return true;
                }
            }

        }
        return false;
    }

        public static void main (String[]args){
            int[] arr = {5, 6, 8, 9, 7};
            System.out.println(hasThreeSum(arr,10));
        }
    }
