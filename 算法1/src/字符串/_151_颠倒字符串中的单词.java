package 字符串;

public class _151_颠倒字符串中的单词 {
    public String reverseWords(String s) {
    	if (s == null) return "";
    	
    	char[] chars = s.toCharArray();
    	
    	//消除多余的空格
    	
    	int cur = 0;
    	boolean space = true;
    	for (int i = 0; i < chars.length; i++) {
			if (chars[i] != ' ') {//i是非空格字符
				chars[cur] = chars[i];
				cur++;
				space = false;
			} else {//i是空格字符
				if (space == false) {//i前面的一个位置是空格字符 ,否则跳过
					chars[cur] = ' ';
					cur++;
					space = true;
				}
			}
		}
    	
    	//翻转
    	int len = space ? (cur - 1) : cur;//有效字符串长度
    	if (len == -1) return "";//说明传进去的全是空格
    	
    	reverse(chars, 0, len);//翻转整个数组
    	
    	int preSpaceIndex = -1;//上一次空格的位置
    	for (int i = 0; i < len; i++) {
			if (chars[i] != ' ') continue;
			reverse(chars, preSpaceIndex + 1, i);
			preSpaceIndex = i;
		}
    	reverse(chars, preSpaceIndex + 1, len);//最后一个单词没有翻转，需要手动进行翻转
    	return new String(chars, 0, len);
    }
    
    //翻转数组 [li, ri)范围内
    private void reverse(char[] chars, int li, int ri) {
		ri--;
		while (li < ri) {
			char tmp = chars[li];
			chars[li] = chars[ri];
			chars[ri] = tmp; 
			li++;
			ri--;
		}
	}
}
