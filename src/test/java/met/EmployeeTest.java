package met;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EmployeeTest {

    @Test
    public void sort() {
        Employee[] employees = {new Employee("Dips", 5.6, 45, 30000, Gender.FEMALE),
                new Employee("Aashu", 7.8, 56, 50000, Gender.FEMALE),
                new Employee("Dips", 5.6, 48, 30000, Gender.FEMALE)};
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees)); //Default ordering uses Comparable ,Employee comparable on name
    }
    @Test
    public void sortByWeight(){
        Employee[] employees = {new Employee("Jessica", 5.6, 45, 30000, Gender.FEMALE),
                new Employee("Aashu", 7.8, 56, 50000, Gender.FEMALE),
                new Employee("Deepika", 5.6, 42, 30000, Gender.FEMALE)};
        assertThat(employees[0].getEmpName(),is("Jessica"));
        Arrays.sort(employees,new EmployeeWeightComparator());
        System.out.println(Arrays.toString(employees));
        assertThat(employees[0].getWeight(),is(42.0));
        assertThat(employees[0].getEmpName(),is("Deepika"));
    }
    @Test
    public void compare() {
        assertThat(Employee.compareString("orange".toCharArray(), "oreo".toCharArray()), is(-1));
    }
    @Test
    public void compare_1() {
        assertThat(Employee.compareString("apple".toCharArray(), "ape".toCharArray()), is(1));
    }
    @Test
    public void compare_equal() {
        assertThat(Employee.compareString("orange".toCharArray(), "orange".toCharArray()), is(0));
    }

}