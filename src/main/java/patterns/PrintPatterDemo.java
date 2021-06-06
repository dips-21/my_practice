package patterns;

class PrintPatterDemo {
    public static void main(String[] args) {
        Pattern p = new TrianglePattern(6);
       // p.draw();

        Pattern p1 = new SquarePattern(5);
        //p1.draw();

        // Pattern[] patterns=new Pattern[2];
        //patterns[0]=new TrianglePattern(5);
        Pattern[] patterns = {new SquarePattern(4), new TrianglePattern(3), new TrianglePattern(4),
                new SquarePattern(5)};
        Pattern.draw(patterns);
    }
}


