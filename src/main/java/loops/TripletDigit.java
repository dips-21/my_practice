package loops;

public class TripletDigit {
    static void printTripletDigit(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = 0; k < array.length; k++) {
                    // if (i==j||j==k||k==i)
                    //continue;
                    if (i != j && j != k && k != i) {
                        System.out.printf("\ni= %d j= %d k= %d\n", i, j, k);
                        System.out.printf("%d -> %d -> %d", array[i], array[j], array[k]);
                    }
                }

            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        printTripletDigit(arr);
    }
}
