package cn.zjdyms.other;

import org.junit.Test;

/**
 * 给定一个
 * @author alen
 *
 */
public class MaxPalindromic {
	@Test
	public void test() {
		String str = "";
		String palidromic = "";
		
		System.out.println(showAll(str,palidromic));
	}

	private char[] showAll(String str, String palidromic) {
		int lasti = 0;
		int i = 0;
		int lastj = 0;
		int j = str.length();
		int count = 0;
		char[] result = new char[str.length() * 2 - palidromic.length()];
		
		while(i != j) {
			boolean left = false;
			boolean right = false;
			if (str.charAt(i) == palidromic.charAt(count)) {
				left = true;
			}
			
			if (str.charAt(j) == palidromic.charAt(count)) {
				right = true;
			}
			
			//TODO
		}
		return null;
	}
	
	
}
