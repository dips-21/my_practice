package loops;
/*
5 9 8 7 6
6 7 8 9 5
5 9 8 7
7 8 9 5
5 9 8
8 9 5
5 9
9 5
5
5
*/

public class PrintArrforback02 {
    static void printArrforback02(int[] arr, int number) {

        for (int k = number; k >= 0; k--) {
            for (int i = 0; i <= k; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int j = k; j >= 0; j--)
                System.out.print(arr[j] + " ");
            System.out.println(" ");

        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 9, 8, 7, 6};
        int number = 4;
        printArrforback02(arr,4);
    }
}
