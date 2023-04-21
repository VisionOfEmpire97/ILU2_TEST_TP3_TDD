package ilu2;

public class Welcome {
	
	public Welcome() {
		// TODO Auto-generated constructor stub
	}

	public static String welcome (String input) {
		StringBuilder sb = new StringBuilder().append("Hello, ");
		sb.append(input);
		return sb.toString();
		}
}
