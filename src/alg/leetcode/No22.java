package alg.leetcode;

public class No22 {
    public int maxProfit(int[] prices) {
        int max = 0;
        int size = prices.length;
        for (int i = 0; i < size - 1; ++i)
            if (prices[i] < prices[i + 1])
                max += prices[i + 1] - prices[i];
        return max;
    }
}
