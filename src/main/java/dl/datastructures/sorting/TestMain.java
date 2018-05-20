package dl.datastructures.sorting;

public class TestMain {

	public static void main(String[] args) {
		int[] a = {7,9,2,5,0,3,8,1};
		
		Sort sort = new QuickSort();
		sort.print(a); 
		 a = sort.sort(a);
		sort.print(a);
		
	}

}
