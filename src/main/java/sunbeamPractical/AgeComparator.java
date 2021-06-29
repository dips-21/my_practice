package sunbeamPractical;

import java.util.Comparator;

public class AgeComparator implements Comparator<Singer> {


    @Override
    public int compare(Singer o1, Singer o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }
        if (o1.getAge() < o2.getAge()) {
            return -1;
        }
        //if(o1.getAge() == o2.getAge()) {
            return 0;
    }

}

