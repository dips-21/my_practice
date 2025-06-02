package loops;

public class Pyramid02 {
    static void printPattern(int lines) {
        /*
      1 1
    2 1 1 2
  3 2 1 1 2 3
4 3 2 1 1 2 3 4
*/
        for (int i = 1; i <= lines; i++) { //lines
            for (int j = i; j < lines; j++) { //space
                System.out.print("  ");
            }
            int k;
            for (k = i; k >= 1; k--) {   //numbers of LHS//decrease
                System.out.print(k + " ");


            }
            for (int l = 1; l <= i ; l++) //Numbers of RHS
                System.out.print(l + " ");

            System.out.println();
        }

    }



    public static void main(String[] args) {
        printPattern(04);
    }
}
