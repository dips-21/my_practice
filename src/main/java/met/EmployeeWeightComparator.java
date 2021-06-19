package met;

import javax.swing.*;
import java.util.Comparator;

public class EmployeeWeightComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        }
        if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        return 0;
    }
}
