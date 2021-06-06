package loops;

public class PrintGreaterNumLeft {
    static void printGreaterNumOfLeft(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean greaterThanLeft = true;
            for (int j = i - 1; j >= 0; j--) {
                if (array[i] < array[j]) {
                    greaterThanLeft = false;
                    break;
                }
            }
            if (greaterThanLeft) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {13, 2, 6, 9, 15, 7};
         printGreaterNumOfLeft(array);

    }
}
