package cn.zjdyms.other;

import org.junit.Test;

import cn.zjdyms.util.Utils;

/**
 * 之字形打印
 * 1234
 * 5678
 * 9123
 * 打印结果125963471283
 * 
 * @author alen
 *
 */
public class PrintZ {
	
	@Test
	public void test() {
		int[][] array = {{1,2,3,4},{5,6,7,8},{9,1,2,3}};
		printZ(array);
	}
	
	private void printZ(int[][] array) {
		int width = array[0].length;
		int height = array.length;
		int i = 0, j = 0, k = 0, l = 0;
		boolean flag = true;
		int sum = width + height - 1;
		for (int x = 0; x < sum;  x ++) {
			print(array,i,j,l,k,flag);
			if (i < height - 1) {
				i ++;
			} else {
				j ++; 
			}
			
			if (k < width - 1) {
				k ++;
			} else {
				l ++;
			}
			flag = !flag;
		}
	}
	
	private void print(int array[][],int x, int y, int k, int l, boolean dir) {
		if (dir) {
			while(x >= k && y <= l) {
				Utils.print(array[x][y]);
				x --;
				y ++;
			}
		} else {
			while(k <= x && l >= y) {
				Utils.print(array[k][l]);
				k ++;
				l --;
			}
		}
	}
	
	
}
