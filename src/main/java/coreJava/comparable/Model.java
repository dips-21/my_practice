package coreJava.comparable;

import java.util.Comparator;

public class Model extends Person {
    int hairLength;
    String color;
    Comparator<Model> modelComparator;


    public Model(String name, int height, int weight, int age, int hairLength,
                 String color, Comparator<Model> modelComparator) {
        super(name, height, weight, age);
        this.hairLength = hairLength;
        this.color = color;
        this.modelComparator = modelComparator;
    }
    public Model(String name, int height, int weight, int age, int hairLength, String color) {
        super(name, height, weight, age);
        this.hairLength = hairLength;
        this.color = color;
    }


    public int compareTo(Model model) {
        if (modelComparator != null)
            return modelComparator.compare(this,model);

        int result = Integer.compare(this.hairLength, model.hairLength);
        if (result == 0) {
            return this.color.compareTo(model.color);
        }
        return result;
    }

}
