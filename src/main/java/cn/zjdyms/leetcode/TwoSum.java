package cn.zjdyms.leetcode;

import org.junit.Test;

/**
 * 大数相加的简化版，两个整数数组,相加。
 * 相当于数组中的各位是数值的各个位置的逆序存储。数组相加相当于对应的数值相加。
 * @author alen
 *
 */
public class TwoSum {
	
	@Test
	public void test() {
		int array1[] = {2,4,3};
		int array2[] = {5,6,6};
		int result[] = getSum(array1, array2);
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	private int[] getSum(int[] array1, int[] array2) {
		int lengthA = array1.length;
		int lengthB = array2.length;
		int[] result = new int[Math.max(lengthA, lengthB) + 1];
		int i = 0;
		int k = 0;
		
		while(i < lengthA && i < lengthB) {
			k = sum(i, array1[i],array2[i],k,result);
			i ++;
		}
		while(i < lengthA) {
			k = sum(i, array1[i],0,k,result);
			i ++;
		}
		
		while(i < lengthB) {
			k = sum(i, array2[i],0,k,result);
			i ++;
		}
		if (k != 0) {
			result[i] = k;
		}
		return result;
	}
	
	public int sum(int i, int arg1, int arg2, int k, int[] result) {
		int sum = 0;
		sum = k + arg1 + arg2;
		result[i] = sum % 10;
		k = sum / 10;
		return k;
	}
	
}
