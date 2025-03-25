package renuka;

import org.junit.Test;

import static org.junit.Assert.*;

public class RelativeRankTest {
    RelativeRank obj = getRelativeRank();

    protected RelativeRank getRelativeRank() {
        return new RelativeRank();
    }

    @Test
    public void findRelativeRanks() {
        int[] score = {10,3,8,9,4};
        String[] output = obj.findRelativeRanks(score);
        String[] expected = {"Gold Medal","5","Bronze Medal","Silver Medal","4"};
        assertArrayEquals(expected, output);
    }
    @Test
    public void findRelativeRanks_1() {
        int[] score = {5,4,3,2,1};
        String[] output = obj.findRelativeRanks(score);
        String[] expected = {"Gold Medal","Silver Medal","Bronze Medal","4","5"};
        assertArrayEquals(expected, output);
    }
}
