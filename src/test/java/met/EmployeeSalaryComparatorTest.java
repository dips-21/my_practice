package met;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class EmployeeSalaryComparatorTest {

    @Test
    public void compare() {
        Employee one=new Employee("",5,5,2000,Gender.FEMALE);
        Employee two=new Employee("",5,5,3000,Gender.FEMALE);
        assertThat(new EmployeeSalaryComparator().compare(one,two),is(-1));
    }

    @Test
    public void compare_first_greater() {
        Employee one=new Employee("",5,5,5000,Gender.FEMALE);
        Employee two=new Employee("",5,5,3000,Gender.FEMALE);
        String c=Employee.company; //
        one.compareTo(two); //
        assertThat(new EmployeeSalaryComparator().compare(one,two),is(1));
    }

    @Test
    public void compare_equal() {
        Employee one=new Employee("",5,5,5000,Gender.FEMALE);
        Employee two=new Employee("",5,5,5000,Gender.FEMALE);
        assertThat(new EmployeeSalaryComparator().compare(one,two),is(0));
    }
}