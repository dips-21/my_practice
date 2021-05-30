package loops;

public class PrintArrForBackward {
    static void printArrForBack(int array[], int number) {
        for (int k = 0; k < number; k++) {
            if (k % 2 == 0) {
                for (int i = 0; i < array.length; i++)
                    System.out.print(array[i] + " ");
            }
            else {
                for (int j = array.length-1; j >= 0; j--)
                    System.out.print(array[j] + " ");
            }
            System.out.println();

        }
    }

        public static void main (String[]args){
            int array[] = {5, 9, 8, 7};
            int number = 5;
            printArrForBack(array, 5);
        }
}
