package dl.datastructures.string;

public class ReverseString {
	
	public static String reverseIterative(String in) {
		String result="";
		
		for(int i=in.length()-1; i>=0; i--) {
			char c = in.charAt(i);
			result = result.concat(""+c);
		}
		
		return result;
	}
	
	
	public static String reverse(String in) {
		if (in.length() < 2) {
            return in;
        }
		return reverse(in.substring(1))+in.charAt(0);
	}
	
	
	public static void main(String[] args) {
		System.out.println(ReverseString.reverseIterative("Hello Deepak"));
		System.out.println(ReverseString.reverse("Hello Deepak"));

	}

}
