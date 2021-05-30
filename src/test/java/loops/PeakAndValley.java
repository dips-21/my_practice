package loops;

public class PeakAndValley {
    static void printPeakAndValleyValues(int array[]) {
        for (int i = 1; i < array.length-1; i++) {
            if (array[i - 1] < array[i] && array[i + 1] < array[i]) {
                System.out.printf(" %d is peak ",array[i]);
            } else if (array[i-1] >array[i] && array[i] < array[i + 1]) {
                System.out.printf(" %d is valley",array[i]);
            } else {
                System.out.print("No Peak No Valley");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int array[] = {13, 2, 6, 9, 15, 7};
        //int length=6;
        printPeakAndValleyValues(array);
    }
}
