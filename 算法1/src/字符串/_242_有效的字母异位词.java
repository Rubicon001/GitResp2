package 字符串;

public class _242_有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
    	if (s == null || t == null) return false;
    	int slen = s.length(), tlen = t.length();
    	if (slen != tlen) return false;
    	
    	char[] sChars = s.toCharArray();
    	char[] tChars = t.toCharArray();
    	int[] count = new int[26];
    	
    	for (int i = 0; i < slen; i++) {
			count[sChars[i] - 97]++;
		}
    	for (int i = 0; i < tlen; i++) {
    		if (--count[tChars[i] - 97] < 0) return false;
		}
    	return true;
    }
}
