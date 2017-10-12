package cn.zjdyms.other;

import org.junit.Test;

/**
 * 1：循环打印二维数组
 * 		解释：绕圈圈打印二维数组中的数值
 * 		例子：{{1,2,3}，{4,5,6}，{7,8,9}} 输出:123688745
 * 
 * @author Allen
 *
 */
public class PrintCircle {
	@Test
	public void test() {
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		printCircle1(array);
	}
	
	/**
	 * 考虑该问题，一个二维数组可以通过两个点来确定我们所需要输出的内容,即两个对角的坐标,通过四个循环打印出
	 * 	四条边的数值即可，完成循环打印
	 * @param array
	 */
	public void printCircle1(int[][] array) {
		int i = 0;
		int j = array.length;
		int m = 0;
		int n = array[0].length;
		
		while(i <= j && m <= n) {
			for (int k = m ; k < n; k++) {
				print(array[i][k]);
			}
			for (int k = i + 1 ; k < j; k++) {
				print(array[k][n-1]);
			}
			for (int k = n - 2  ; k > m; k--) {
				print(array[j - 1][k]);
			}
			for (int k = j - 1  ; k > i; k --) {
				print(array[k][m]);
			}
			i ++;
			j --;
			m ++;
			n --;
		}
	}
	
	public void print(int i) {
		System.out.println(i);
	}
}
