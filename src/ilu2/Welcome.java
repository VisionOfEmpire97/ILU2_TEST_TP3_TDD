package ilu2;

public class Welcome {

	public static String welcome (String input) {
		StringBuilder sb = new StringBuilder();
		if (isUpperCase(input) && !isEmpty(input)){
			sb.append("HELLO, ");
			sb.append(input);
			sb.append(" !");
		} else {
			sb.append("Hello, ");
			if (isEmpty(input)){
				sb.append("my friend");				
			} else {
				sb.append(input);				
			}
		}		
		return sb.toString();
		}
	
	private static boolean isEmpty(String input) {
		return input.trim().equals("");
	}
	
	private static boolean isUpperCase(String input) {
		return input.equals(input.toUpperCase());
	}
}
