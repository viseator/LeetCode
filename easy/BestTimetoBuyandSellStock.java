package xyz.viseator.leetcode.easy;

/**
 * Created by viseator on 2/6/17.
 * Wu Di
 * viseator@gmail.com
 */
public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {

    }

    public static int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        int profit, maxProfit = 0;
        int right = prices[prices.length - 1];
        int left = right;
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[i] < left) {
                left = prices[i];
                profit = right - left;
                if (profit > maxProfit) maxProfit = profit;
            } else if (prices[i] > right) {
                left = right = prices[i];
            }
        }
        return maxProfit;
    }
}
