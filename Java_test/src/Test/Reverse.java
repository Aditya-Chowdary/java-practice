package Test;

public class Reverse {

	public static String reverseString(String input) {
		
		StringBuilder stringBuilder = new StringBuilder(input);
	
		stringBuilder.reverse();
	
		return stringBuilder.toString();
	}
}
