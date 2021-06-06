package loops;

import junit.framework.TestCase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FindSecondMinTest extends TestCase {

    public void testFindSecondMinNum() {
        int []array={ 9,4,8,1,15};
        int res= FindSecondMin.findSecondMinNum(array);
        assertThat(res,is(4));
    }

    public void testFindSecondMinNum01() {
        int []array={ 4,3,8,9,1,0,10};
        int res= FindSecondMin.findSecondMinNum(array);
        assertThat(res,is(1));
    }
}