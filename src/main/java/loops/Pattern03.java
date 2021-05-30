package loops;
/*
1
3  2  1
5  4  3  2  1
7  6  5  4  3  2  1
9  8  7  6  5  4  3  2  1
11  10  9  8  7  6  5  4  3  2  1
13  12  11  10  9  8  7  6  5  4  3  2  1

 */
public class Pattern03 {
    public static void main(String[] args) {
        //printPattern(5);
        // printPattern01(5);
        printpattern02(7);

    }

    static void printPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "->" + i + "  ");
            }
            System.out.println();
        }
    }

    /* 1->1
    2->2  2->2
    3->3  3->3  3->3
    4->4  4->4  4->4  4->4
    5->5  5->5  5->5  5->5  5->5

     */
    static void printPattern01(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "->" + +i + "  ");
            }
            System.out.println();
        }
    }

    /*
    1
    3 2 1
    5 4 3 2 1
    7 6 5 4 3 2 1
     */
    static void printpattern02(int numLines) {
        int startOfRow=1;
        for (int i = 1; i <= numLines; i++) {
            {
                for (int j = startOfRow; j >= 1; j--) {
                    System.out.print(j + "  ");
                }
                startOfRow+=2;
                System.out.println();
            }
        }
    }
}




