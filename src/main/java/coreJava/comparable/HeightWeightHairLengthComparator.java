package coreJava.comparable;

import java.util.Comparator;

public class HeightWeightHairLengthComparator implements Comparator<Model> {
    HeightWeightComparator heightWeightComparator = new HeightWeightComparator();

    @Override
    public int compare(Model model1, Model model2) {
       int result= heightWeightComparator.compare(model1, model2); //if extend HeightWeight then super.compare
                                                                    //
        if (result == 0) {
            result = Integer.compare(model1.hairLength, model2.hairLength);
        }
        return result;
    }

/*    @Override
    public int compare(Model model1, Model model2) {
        int result = Integer.compare(model1.height, model1.height);
        if (result == 0) {
            result = Integer.compare(model1.weight, model1.weight);
            if (result == 0) {
                result = Integer.compare(model1.hairLength, model2.hairLength);
            }
        }
        return result;
    }*/
}


