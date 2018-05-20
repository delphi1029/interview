package dl.datastructures.sorting;

public class QuickSort extends Sort {

	private void quickSort(int[] a, int start, int end) {
		if(start < end) {
			int pIndex = partition(a,start,end);
			quickSort(a,start,pIndex-1);
			quickSort(a,pIndex+1,end);
		}
	}


	private int partition(int[] a, int start, int end) {
		int pivot = a[end];
		int pIndex = start;

		for(int i=start; i<end; i++) {
			if(a[i] <= pivot) {
				int temp = a[pIndex];
				a[pIndex] = a[i];
				a[i] = temp;
				pIndex++;
			}
		}
		int temp = a[pIndex];
		a[pIndex] = a[end];
		a[end] = temp;
		return pIndex;
	}


	@Override
	public int[] sort(int[] a) {
		quickSort(a,0,a.length-1);
		return a;
	}

}
