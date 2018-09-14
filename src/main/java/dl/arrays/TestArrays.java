package dl.arrays;

public class TestArrays {
	
	
	public static int findIntersection(int[] a, int[] b) {
		int result = -1;
		
		int i=0,j=0;
		
		while(i<a.length && j<b.length) {
			if(a[i] > b[j]) {
				j++;
			} else if(b[j] > a[i]) {
				i++;
			} else {
				return a[i];
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		int a[] = {1,2,4,5,8,9};
		int b[] = {3,6,7,8,10};
		
		System.out.println(findIntersection(a,b));
	}
	
	
	

}
