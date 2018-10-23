package dl.dynamic;

public class Stairs {

	public static int numberOfWaysToClimb(int stairs) {
		
		int[] result = new int[stairs+1];
		result[1] = 1;
		result[2] = 2;
		
		
		for(int i=3; i<=stairs;i++) {
			result[i] = result[i-1]+result[i-2];
		}
		
		return result[stairs];
	}
	
	
	public static void main(String[] args) {
		System.out.println(numberOfWaysToClimb(6));
	}

}
