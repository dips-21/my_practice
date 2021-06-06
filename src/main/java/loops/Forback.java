package loops;

public class Forback {
    static void printArrForBack(int[] array, int number) {
        boolean isLeftToRight = true;
        for (int k = 0; k < number; k++) {
            if (isLeftToRight) {
                for (int i = 0; i < array.length; i++){
                    System.out.print(array[i] + " ");
                }
               // isLeftToRight = false;
            } else {
                for (int j = array.length - 1; j >= 0; j--)
                    System.out.print(array[j] + " ");
                //isLeftToRight = true;
            }
            isLeftToRight=!isLeftToRight;
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 9, 8, 7};
        int number = 5;
        printArrForBack(array, number);
    }
}
