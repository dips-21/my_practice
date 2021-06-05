package loops;

public class PrintPairsOfGreaterNum {
    static int printPairsOfGreaterNum(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <=array.length-1; j++) {
                if (array[i] > array[j]) {
                   // System.out.println(i + " " + j);
                    System.out.println(array[i]+" "+array[j]);
                }
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        int[] array={9,4,5,8,1};
        printPairsOfGreaterNum(array);
    }
}