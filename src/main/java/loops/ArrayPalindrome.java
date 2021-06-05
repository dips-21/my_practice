package loops;

public class ArrayPalindrome {
    static boolean isArrayPalindrome(int []array){
        int result;
        for (int i = 0,end= array.length-1; i < array.length-1 ; i++,end--) {
            if(array[i]!= array[end])
            {
                return false;
            }
        }
        return true;
    }

    static boolean isArraySymmetric(int [] array){
        int result;
        for (int i = 0,end= array.length/2; i <array.length-1 ; i++,end--) {
            if (array[i] != array[end] / 2) {
                return true;
            }
        }
        return false;
    }
}

