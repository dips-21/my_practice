package loops;
/*
xxxx5
xxx4 5 4
xx3 4 5 4 3
x2 3 4 5 4 3 2
1 2 3 4 5 4 3 2 1

 */
public class Patterns04 {
    static void patternprint(int lines) {
       // System.out.printf("%d %d", 15, 5);
        //System.out.println("\n" + 15 + " " + 5);
        for (int i = 0, start = lines; i < lines; i++, start--) {
            for (int j = lines-1; j > i; j--) {
                System.out.print("x");
            }

            for (int k = 0, num = start; k <= i; k++) {
                System.out.print(num + " ");
                num++;
            }
            for (int l = 0, num =lines-1; l < i ; l++ ) {
                System. out.print(num +" ");
                num--;
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
       // int num = Integer.parseInt(args[0]);
       // patternprint(3);
        patternprint(5);
    }
}


