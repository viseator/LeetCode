package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class BestTimetoBuyandSellStock2 {
    public static void main(String[] args) {

    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i + 1] - prices[i] > 0) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }

}
