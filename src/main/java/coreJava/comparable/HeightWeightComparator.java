package coreJava.comparable;

import java.util.Comparator;

public class HeightWeightComparator implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        int result = Integer.compare(person1.height, person2.height);
        if (result == 0) {
               result=Integer.compare(person1.weight,person2.weight);
        }
        return result;

    }


}
