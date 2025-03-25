package project;

import org.junit.Test;
import renuka.DecodeWays;

public class DecodeWaysTest {
DecodeWays decodeWays=new DecodeWays();
    @Test
    public void numDecodings() {
       int r= decodeWays.numDecodings("12");
        System.out.println(r);
    }
}