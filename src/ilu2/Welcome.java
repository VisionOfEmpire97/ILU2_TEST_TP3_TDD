package ilu2;

public class Welcome {
	
	public Welcome() {
		// TODO Auto-generated constructor stub
	}

	public static String welcome (String input) {
		StringBuilder sb = new StringBuilder().append("Hello, ");
		if (input.trim().equals(""))
			input = "my friend";
		sb.append(input);
		return sb.toString();
		}
}
