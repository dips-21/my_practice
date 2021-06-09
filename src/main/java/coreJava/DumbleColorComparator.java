package coreJava;

import java.util.Comparator;

public class DumbleColorComparator implements Comparator<Dumble> {

    @Override
    public int compare(Dumble o1, Dumble o2) {
        return o1.color.name().compareTo(o2.color.name());
    }
}
