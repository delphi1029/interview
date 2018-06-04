package dl.datastructures.sorting;

public class SelectionSort extends Sort {

	@Override
	public int[] sort(int[] a) {
		
		int len = a.length;
		
		for(int i=0; i<len; i++) {
			int min = i;
			for(int j=i;j<len;j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		
		return a;
	}
	
	

}
