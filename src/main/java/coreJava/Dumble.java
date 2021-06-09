package coreJava;

enum COLOR {
    BLACK, RED, WHITE, PURPLE
}

public class Dumble implements Comparable<Dumble> {
    COLOR color;
    int kgs;
    int grams;

    public Dumble(COLOR color, int kgs, int grams) {
        this.color = color;
        this.kgs = kgs;
        this.grams = grams;
    }

    //8 50      5 200
    //50 20 30 10
    @Override
    public int compareTo(Dumble o) {
        if (kgs == o.kgs) {
            return grams > o.grams ? 1 : (grams == o.grams ? 0 : -1);
        }

        if (this.kgs > o.kgs) {
            return 1;
        }
        return -1;
    }
}
