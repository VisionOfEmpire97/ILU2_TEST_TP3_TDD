package ilu2;

public class Welcome {
	private static String bonjour = "Hello, ";

	public static String welcome (String input) {
		StringBuilder sb = new StringBuilder();
		sb.append(bonjour);
		if (isEmpty(input)){
			sb.append("my friend");				
		} else {
			if (input.contains(",")) {
				String[] nameList = caseMultiNames(input);
				for (int i = 0; i < nameList.length; i++) {
					sb.append(nameList[i]);
				}
			} else {
				input = firstLetterToUpperCase(input);
				if (isUpperCase(input) && !isEmpty(input)){
					sb.replace(0, bonjour.length(), bonjour.toUpperCase());
					sb.append(input);
					sb.append(" !");
				} else {
					sb.append(input);				
				}
			}		
		}
		return sb.toString();
	}
	
	private static String firstLetterToUpperCase(String input) {
		if (input.length() > 0) {
		String first = input.substring(0, 1).toUpperCase();
		return first + input.substring(1);
		}
		return input;
	}
	
	private static boolean isEmpty(String input) {
		return input.trim().equals("");
	}
	
	private static boolean isUpperCase(String input) {
		return input.equals(input.toUpperCase());
	}
	
//	private static String caseTwoNames(String input) {
//		String[] deuxNoms = {"",""};
//		deuxNoms = input.split(",");
//		deuxNoms[0] =deuxNoms[0].trim();
//		deuxNoms[1] =deuxNoms[1].trim();
//		for (int i = 0; i < deuxNoms.length; i++) {
//			deuxNoms[i] = firstLetterToUpperCase(deuxNoms[i]);
//		}
//		return deuxNoms[0] + ", " + deuxNoms[1];
//	}
	
	private static String[] caseMultiNames(String input) {
		String[] names;
		names = input.split(",");
		for (int i = 0; i < names.length; i++ ) {
			names[i] = names[i].trim();
			names[i] = firstLetterToUpperCase(names[i]);
			if (i < names.length - 1)
				names[i] += ", ";
		}
		return names;
	}
}
