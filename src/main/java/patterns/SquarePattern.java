package patterns;

public class SquarePattern extends Pattern {

    SquarePattern(int lines) {
        super(lines);
    }

    @Override
    void draw() {
        for (int i = 0; i <= lines; i++) {
          //  int start = 1, end = 5;
            if (i % 2 == 0) {
                for (int j = 1; j <= lines; j++) {
                    System.out.print(j + " ");
                }
            }
            else {
                for (int k = lines; k > 0 ; k--) {
                    System.out.print(k + " ");
                }
            }
            System.out.println(" ");
        }
        System.out.println();
    }
}

