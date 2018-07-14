package dl.datastructures.resursion;

public class Factorial {
	
	public int fact(int num) {
		if(num <= 1) {
			return 1;
		}
		return num * fact(num-1);
		
	}
	
	public static void main(String[] args) {
		Factorial fac = new Factorial();
		System.out.println(fac.fact(5));
		System.out.println(fac.fact(6));
		System.out.println(fac.fact(3));
		System.out.println(fac.fact(0));
	}

}
