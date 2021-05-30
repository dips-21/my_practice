package loops;

public class PrintGreaterNumRIght {
    static void printGreaterNumOfRight(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            boolean greaterThanRight = true;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    greaterThanRight = false;
                    break;
                }
            }
            if (greaterThanRight) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {4, 7, 6, 9, 2, 11, 3};
        printGreaterNumOfRight(array);

    }
}
