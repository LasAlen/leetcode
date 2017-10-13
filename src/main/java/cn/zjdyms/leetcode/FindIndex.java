package cn.zjdyms.leetcode;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 给定一个数值,和一个数组,求数组中两个数字的和等于该数值的数的位置。
 * {1,2,3,4,5} target 3 ---> 结果 0 1
 * @author alen
 *
 */
public class FindIndex {
	@Test
	public void test( ) {
		int[] array = {2, 11, 7, 15};
		int target = 9;
		int[] result = find(array, target);
		if (result != null) {
			System.out.println(result[0] + "-----" + result[1]);
		}
	}
	
	private int[] find(int[] array, int target) {
		Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
		int result[] = new int[2];
		for (int i = 0; i < array.length ; i++) {
			if (tmp.get(target - array[i]) != null) {
				result[0] = i;
				result[1] = tmp.get(target - array[i]);
			} else {
				tmp.put(array[i], i);
			}
		}
		return result;
	}
}
