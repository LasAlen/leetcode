package cn.zjdyms.other;

import org.junit.Test;

/**
 * 二维数组环绕便利，由外到内，绕圈遍历
 * 		例如：{{1,2,3},{4,5,6},{7,8,9}} 结果:123688745
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
