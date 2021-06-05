package loops;

public class GoldPrices {
    static int getHighest(int[] prices) {
        int highest = 0;
        for (int i = 0; i < prices.length; i++) {
            if (highest < prices[i]) {
                highest = prices[i];
            }
        }
        return highest;
    }

    static int getDayOfHighestIncrease(int[] prices) {
        int highest = 0, day = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int diff = prices[i + 1] - prices[i];
            if (highest < diff) {
                highest = diff;
                day = i + 1;
            }
        }
        return day;
    }

    static int getDaysWithHighestPrice(int[] prices) {
        for (int i = 1; i < prices.length; i++) {
            boolean isHighestTill = true;
            for (int j = i - 1; j >= 0; j--) {
                if (prices[i] < prices[j]) {
                    isHighestTill = false;
                    break;
                }
            }
            if (isHighestTill) {
                System.out.println("day " + i + " price " + prices[i]);
            }
        }
        return 0;
    }

    static int getDaysWithLowestPrice(int[] prices) {
        for (int i = 1; i < prices.length; i++) {
            boolean isLowestSoFar = true;
            for (int j = i - 1; j >= 0; j--) {
                if (prices[i] > prices[j]) {
                    isLowestSoFar = false;
                    break;
                }
            }

            if (isLowestSoFar) {
                System.out.println("day" + i + "price" + prices[i]);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(sumClosestToZero(new int[]{-3, 1, 2, -4, 8, 5}));
    }

    static int sumClosestToZero(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int closestSumToZero = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int sum = Math.abs(prices[i] + prices[j]);
                if (closestSumToZero > sum) {
                    closestSumToZero = sum;
                }
            }
        }
        return closestSumToZero;
    }

    static int getProfit(int[] prices, int dayOfBuy, int dayOfSell) {
        int profit = prices[dayOfSell] - prices[dayOfBuy];
        return profit;
    }

    static int getHighestProfitPair(int[] prices) {
        //int maxProfit=0;
        int maxProfit = Integer.MIN_VALUE;
        for (int buyDay = 0; buyDay < prices.length; buyDay++) {
            for (int sellDay = buyDay + 1; sellDay < prices.length; sellDay++) {
                int current = prices[sellDay] - prices[buyDay];
                if (maxProfit < current) {
                    maxProfit = current;
                }

            }

        }
        return maxProfit;
    }

    static int getLowestProfitPair(int []prices){
        int minProfit=Integer.MAX_VALUE;
        for (int buyDay = 0; buyDay <prices.length; buyDay++) {
            for (int sellDay = buyDay+1; sellDay <prices.length ; sellDay++) {
                int currentProfit=prices[sellDay]-prices[buyDay];
                if(minProfit>currentProfit)
                minProfit=currentProfit;

            }

        }
        return minProfit;
    }
}

