package 动态规划;
//7.  00:04:36
//同类型：122、123、188、714
public class _121_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
    	if (prices == null || prices.length == 0) return 0;
    	int minPrice = prices[0];//扫描过的最小买入值
    	int maxProfix = 0;//扫描过的卖出最大记录
    	for (int i = 1; i < prices.length; i++) {
			if (minPrice > prices[i]) {
				minPrice = prices[i];
			}
			maxProfix = Math.max(maxProfix, prices[i] - minPrice);
		}
    	
    	return maxProfix;
    }
}
