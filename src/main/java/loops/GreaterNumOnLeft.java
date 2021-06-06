package loops;

public class GreaterNumOnLeft {
    static void greaterNumOnLeft(int[] array) {
        for (int start = 1; start < array.length; start++) {
            boolean isHighest = true;
            int count = 0;
            for (int j = 0; j < start; j++) {  //{3, 1, 4, 9, 6, 2};
                if (array[start] < array[j]) {
                    isHighest = false;
                    break;
                }

            }
            if (isHighest)
                System.out.print(array[start] + " ");

        }
    }


    static void greaterNumOnLeftIfConstantK(int[] array, int k) {
        for (int start = 1; start < array.length; start++) {
            boolean isHighest = true;
            int count = 0;
            for (int j = start - 1; j >= 0; j--) {  //{3, 1, 4, 9, 6, 2};
                if (array[start] > array[j]) {
                    isHighest = true;
                    count++;
                }
            }
            if(count==k)
            System.out.println(array[start]);
        }
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 9, 6, 2};
        int k = 2;
        //  greaterNumOnLeftIfConstantK(array,k);
        greaterNumOnLeftIfConstantK(array, 3);
    }
}
