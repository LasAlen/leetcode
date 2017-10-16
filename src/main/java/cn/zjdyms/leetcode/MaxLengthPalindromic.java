package cn.zjdyms.leetcode;

import org.junit.Test;

/**
 * 最长回文字串
 * @author Allen
 *
 */
public class MaxLengthPalindromic {
	int lo = 0;
	int maxLength = 0;
	@Test
	public void main() {
		String str = "aaaaaaaaaaaaaaaaaabbaaaaaaaaaaaaaaaaa";
		System.out.println(str.length());
		System.out.println(maxPalindromix(str));
	}

	private String maxPalindromix(String str) {
		int length = str.length();
		if (length < 2) {
			return str;
		}
		for (int i = 0 ; i < str.length(); i++) {
			//palindromix(str, i, i);
			palindromix(str,i,i+1);
		}
		return str.substring(lo, lo + maxLength);
	}

	private void palindromix(String str, int start1, int start2) {
		int i = start1;
		int j = start2;
		while(i >= 0 && j < str.length() && str.charAt(i) == str.charAt(j)) {
			i --;
			j ++;
		}
		if (maxLength < j - i - 1) {
			lo = i + 1;
			maxLength = j - i - 1;
		}
	}
}
