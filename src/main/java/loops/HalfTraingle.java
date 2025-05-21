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

    static void printPattern2(int lines){
        for (int i = 0; i < lines; i++) {     // lines

            for (int j = lines; j > i; j--) {   // space
                System.out.print(" ");
            }
                for (int k = 0; k <= i; k++) {
                    System.out.print("*");
                }

            System.out.println();
            }
        }


        static void printPattern3(int lines){
        int num=1;
            for (int i = 0; i < lines ; i++) {
                for (int j = lines; j>= i ; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i+1; k++) {
                    System.out.print(k+" ");
                    //System.out.print(" ");
                    num++;
                }

                System.out.println();
            }

        }

    public static void main(String[] args) {
        //printPattern(4);
       // printPattern2(3);
        printPattern3(5);
    }


}
