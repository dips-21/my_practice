package loops;

public class AdditionOfArray {
    static void additionOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                sum = array[i] + array[j];
                System.out.printf(" %d +%d = %d ", array[i], array[j], sum);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
//(5 6 7) (5 6 8) (5 7 8) (6,7,8)
        int arr[] = {1,2,3};
        //additionOfArray(arr);
        //printPairs(arr);
        printTriplet(arr);

    }

    //5-6 5-7 5-8 , 6-7 ,6-8
    static void printPairs(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                result = arr[i] + arr[j];
                System.out.printf("%d->%d", arr[i], arr[j], result);
                System.out.println(" ");
            }
        }
    }

    //(5 6 7) (5 6 8) (5 7 8) (6,7,8)
    static void printTriplet(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = i+2; k < arr.length; k++) {
                    if(k==j)
                        continue;
                    result = arr[i] + arr[j] + arr[k];
                    System.out.printf("i=%d j=%d k=%d\n", i, j, k);
                    System.out.printf("%d+%d+%d =%d", arr[i], arr[j], arr[k], result);
                    System.out.println("  ");
                }
            }
        }
    }
}
