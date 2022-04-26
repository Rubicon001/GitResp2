package 动态规划;

//7.  00:34:38
public class _72_编辑距离 {
    public int minDistance(String word1, String word2) {
    	if (word1 == null || word2 == null) return 0;
    	
    	char[] chars1 = word1.toCharArray();
    	char[] chars2 = word2.toCharArray();
    	int[][] dp = new int[chars1.length + 1][chars2.length + 1];
    	
    	dp[0][0] = 0;
    	//第0列
    	for (int i = 1; i < dp.length; i++) {
			dp[i][0] = i;
		}
    	//第0行
    	for (int i = 1; i < dp[0].length; i++) {
			dp[0][i] = i;
		}
    	//其他行其他列9787302568254
    	for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int top = dp[i - 1][j] + 1;
				int left = dp[i][j - 1] + 1;
				int leftTop = chars1[i - 1] == chars2[j - 1] ? dp[i - 1][j - 1] : dp[i - 1][j - 1] + 1;
				dp[i][j] = Math.min(Math.min(top, left), leftTop);//选top、left、leftTop的最小值
			}
		}
    	
    	return dp[chars1.length][chars2.length];
    }
}
