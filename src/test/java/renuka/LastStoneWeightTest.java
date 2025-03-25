package renuka;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LastStoneWeightTest {
    LastStoneWeight obj = new LastStoneWeight();
    @Test
    public void lastStoneWeight() {
        assertEquals(obj.lastStoneWeight(new int[]{2,7,4,1,8,1}),1);
        assertEquals(obj.lastStoneWeight(new int[]{1}),1);
        assertEquals(obj.lastStoneWeight(new int[]{1,2,9,6,15,10,7}), 0);
        assertEquals(obj.lastStoneWeight(new int[]{9,3,2,10}), 0);
        assertEquals(obj.lastStoneWeight(new int[]{8,3,5,10}), 0);
        assertEquals(obj.lastStoneWeight(new int[]{8,3,5,10,1}), 1);
        assertEquals(obj.lastStoneWeight(new int[]{1,3}),2);
    }
}

