package loops;
/*
1->2 2->3 3->4 4->5
 */
public class PatternPrint02 {
    static void printPattern(int num) {
        for (int i = 1; i < num; i++) {
            int j=i+1;
            System.out.print(i + "->" + j+" ");

        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}