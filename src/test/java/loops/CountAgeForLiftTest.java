package loops;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class CountAgeForLiftTest {

    @Test
    public void countTotalNumberOfMatches() {
        String maleNames[] = {"rohan", "rahul", " akshay", "saurav", "jayant"};
        String femaleNames[] = {"rupali", "nita", "neha", "anjali", "nisha"};
        int weightOfMale[]={25,35,36,29,27};
        int weightOfFemale[]={21,24,35,36,19};
        assertThat(CountAgeForLift.countTotalNumberOfMatches(weightOfMale,weightOfFemale,maleNames,femaleNames),is(7));
    }


    @Test
    public void countTotalNumberOfMatches_1() {
        String maleNames[] = {"rohan", "rahul", " akshay", "saurav", "jayant"};
        String femaleNames[] = {"rupali", "nita", "neha", "anjali", "nisha"};
        int weightOfMale[]={25,35,36,29,27};
        int weightOfFemale[]={2,4,5,6,9};
        assertThat(CountAgeForLift.countTotalNumberOfMatches(weightOfMale,weightOfFemale,maleNames,femaleNames),is(0));
    }
}