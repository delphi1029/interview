package dl.datastructures.sorting;

public abstract class Sort {
	
	public abstract int[] sort(int[] a);
	
	public void print(int[] a) {
		for(int data : a) {
			System.out.print(data+" ");
		}
		System.out.println();
	}

}
