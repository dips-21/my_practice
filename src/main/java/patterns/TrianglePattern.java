package patterns;

public class TrianglePattern extends Pattern {
    TrianglePattern(int lines) {
        super(lines);
    }

    @Override
    void draw() {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1 + " ");

            }
            System.out.println(" ");
        }
        System.out.println();
    }
}
