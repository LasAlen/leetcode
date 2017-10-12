package cn.zjdyms.leecode;

import org.junit.Test;

public class Four {
	
	/**
	 * 
	 */
	@Test
	public void test() {
		int[] a =  {1,3};
		int[] b = {2};
		System.out.println(findMedianSort(a, b));
	}
	
	public double findMedianSort(int[] array1, int[] array2) {
		int n = array1.length;
		int m = array2.length;
		if (n > m) {
			return findMedianSort(array2, array1);
		}
		
		int k = (n + m - 1) / 2;
		int l = 0;
		int r = Math.min(k, n);
		
		while(l < r) {
			int midA = (l + r) / 2;
			int midB = k - midA;
			if (array1[midA] < array2[midB]) {
				l = midA + 1;
			} else 
				r = midA;
		} 
		int a = Math.max(l > 0 ? array1[l - 1] : Integer.MIN_VALUE, k - l >= 0 ? array2[k - l] : Integer.MIN_VALUE);
	    if (((n + m) & 1) == 1)
	        return (double) a;

	    
	    int b = Math.min(l < n ? array1[l] : Integer.MAX_VALUE, k - l + 1 < m ? array2[k - l + 1] : Integer.MAX_VALUE);
	    return (a + b) / 2.0;
	}

	@Test
	public void tets() {
		System.out.println("x" + null);
	}
}
