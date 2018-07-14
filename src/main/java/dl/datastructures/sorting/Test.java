package dl.datastructures.sorting;

public class Test {
	
	public static void swap(Integer x, Integer y) {
		System.out.println("x :"+x+" y :"+y);
		Integer tmp =x;
		x=y;
		y=tmp;
		System.out.println("x :"+x+" y :"+y);
	}

	public static void main(String[] args) {
		Test.swap(new Integer(3), new Integer(4));

	}

}
