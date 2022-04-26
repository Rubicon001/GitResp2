package 动态规划;


//7.  1:34:27
public class _5_最长回文子串 {
	//扩展中心法
	
	public String longestPalindrome(String s) {
		if (s == null) return null;
    	
    	char[] chars = s.toCharArray();
    	int maxLen = 1;
    	int begin = 0;
    	
    	
    	for (int i = chars.length - 2; i >= 1; i--) {
    		//以字符为中心往两边扩展
			int len1 = palindromeLength(chars, i - 1, i + 1);
			//以字符的右边间隙为中心往两边扩展
			int len2 = palindromeLength(chars, i, i + 1);
			
			len1 = Math.max(len1, len2);
			if (len1 > maxLen) {
				maxLen = len1;
				begin = i - ((maxLen - 1) >> 1);
			}
		}
    	
    	//以0号字符右边的间隙还未处理（此时的最长回文子串长度是2）
    	if (chars[0] == chars[1] && maxLen < 2) {
			//chars[0, 1]就是最长回文子串
    		maxLen = 2;
    		begin = 0;
		}
    	return new String(chars, begin, maxLen);
    }
	private int palindromeLength(char[] chars, int l, int r) {
		while (l >= 0 && r < chars.length && chars[l] == chars[r]) {
			r++;
			l--;
		}
		return r - l - 1;
	}
	
	/**
	 *  动态规划
	 */
	public String longestPalindrome1(String s) {
		if (s == null) return null;
    	
    	char[] chars = s.toCharArray();
    	boolean[][] dp = new boolean[s.length()][s.length()];
    	int maxLen = 1;
    	int begin = 0;
    	
    	
    	for (int i = dp.length - 1; i >= 0; i--) {
			for (int j = i; j < dp[0].length; j++) {
                int len = j - i + 1;
				if (len <= 2) {
					dp[i][j] = chars[i] == chars[j];
				} else {
					dp[i][j] = dp[i + 1][j - 1] && chars[i] == chars[j];
				}
				
				if (dp[i][j] && maxLen <= len) {
					maxLen = len;
					begin = i;
				}
			}
		}
    	return new String(chars, begin, maxLen);
    }
}
