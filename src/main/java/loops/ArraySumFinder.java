package loops;

public class ArraySumFinder {
    static boolean hasTwoSum(int[] array, int sum) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {            //j=1
               //  if(i == j)                                      //in case  of 1;
                 //   continue;
                System.out.println(i + " -> " + j);
                result = array[i] + array[j];
//                System.out.printf("\ni= %d j= %d \n", i, j);
//                System.out.println(" ");
                if (sum == result)
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 7, 3};
        System.out.println(hasTwoSum(arr, 14));
    }
}
