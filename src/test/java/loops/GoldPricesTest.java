package loops;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GoldPricesTest {

    @Test
    public void getHighest() {
        int[] prices={45,36,95,32};
        assertThat(GoldPrices.getHighest(prices),is(95));
    }

    @Test
    public void getHighest_01() {
        int[] prices={10};
        assertThat(GoldPrices.getHighest(prices),is(10));
    }

    @Test
    public void getDayOfHighestIncrease() {
        int[] prices={64,3,8,50,35,98};
        assertThat(GoldPrices.getDayOfHighestIncrease(prices),is(5));
    }

    @Test
    public void getDayOfHighestTill() {
        int[] prices={64,3,8,50,35,98};
        GoldPrices.getDaysWithHighestPrice(prices);
    }

    @Test
    public void getDaysWithLowestPrice() {
        int[] prices={45,36,95,32};
        GoldPrices.getDaysWithLowestPrice(prices);
    }
    @Test
    public void getProfit() {
        int[] prices={64,3,8,50,35,98};
        assertThat(GoldPrices.getProfit(prices,2,5),is(90));
    }

    @Test
    public void getHighestProfit() {
        int[] prices={64,3,8,50,35,98};
        assertThat(GoldPrices.getHighestProfitPair(prices),is(95));
    }


    @Test
    public void getHighestProfit_all_loss() {
        int[] prices={15,10,5,2};
        assertThat(GoldPrices.getHighestProfitPair(prices),is(-3));
    }


}
