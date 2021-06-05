package loops;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import junit.framework.TestCase;

public class FindSecondMaxTest extends TestCase {

    public void testFindSecondMaxNum() {
        int []array={ 9,4,8,1,15};
        int res= FindSecondMax.findSecondMaxNum(array);
        assertThat(res,is(9));
    }
}