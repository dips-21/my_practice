package loops;

public class DescendingTheOrderNum {
    static void printPattern(int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = lines; j > i; j--) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        //printPattern(4);
       // printPattern01(4);
        //printPattern02(4);
        //printPattern03(4);
        printPattern04(4);
    }


    static void printPattern01(int lines) {
        for (int i = lines; i > 0; i--) {
            for (int j = i; j < 0; j++) {
                System.out.print(j + "");
            }
            System.out.println(" ");
        }
    }


    static void printPattern02(int lines){
        for (int i = lines; i >0 ; i--) {
            for (int j = lines; j >lines-i ; j--) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
/*
4 3 2 1
3 2 1
2 1
1

 */
    static void printPattern03(int lines){
        for (int i = 0; i < lines ; i++) {
            for (int j = lines-i; j >0 ; j--) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }

       /* 4 3 2 1
          3 2 1
          2 1
          1            */

    static void printPattern04(int lines){
        for (int i = lines; i >0 ; i--) {
            for (int j = i; j >=1 ; j--) {  //j>0
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }


}