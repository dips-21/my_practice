package patterns;

public abstract class Pattern {
    int lines;
    Pattern(int lines){
        this.lines=lines;
    }
    abstract void draw();

    static void draw(Pattern[] patternArray){
        for (Pattern p:patternArray)
        p.draw();
    }


}
