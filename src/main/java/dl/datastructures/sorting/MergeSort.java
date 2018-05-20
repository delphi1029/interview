package dl.datastructures.sorting;

public class MergeSort extends Sort{

	private void mergeSort(int[] a, int low, int high) {
		
		if(low < high) {
			int mid = (low+high)/2;
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	
	private void merge(int[] a, int low, int mid, int high) {
		int[] temp = new int[a.length];
		for(int x=low; x<=high; x++) {
			temp[x] = a[x];
		}
		
		int i=low;
		int j=mid+1;
		int k=low;
		
		while(i<=mid && j<=high) {
			if(temp[i] < temp[j]) {
				a[k] = temp[i];
				i++;
			} else {
				a[k] = temp[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid) {
			a[k] = temp[i];
			i++;
			k++;
		}
		
		while(j<=high) {
			a[k] = temp[j];
			j++;
			k++;
		}
	}

	@Override
	public int[] sort(int[] a) {
		mergeSort(a, 0, a.length-1); 
		return a;
	}

}
