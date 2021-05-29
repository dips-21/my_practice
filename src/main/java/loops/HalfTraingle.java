package loops;
/*    1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1
*/
public class HalfTraingle {
    static void printPattern(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = i; j < lines; j++) {
                System.out.print(" x ");
            }
            int k;
            for (k = 1; k <= i; k++) {
                System.out.print( k + " ");
            }
            for (int l = k - 2; l >=1; l--)
                System.out.print(l + " ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(4);
    }
}
