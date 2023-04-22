package ilu2;

public class Welcome {
	private static String bonjour = "Hello, ";
	private static String rebonjour = "AND HELLO, ";
	private static String separator = ", ";

	public static String welcome (String input) {
		input = firstLetterToUpperCase(input);
		StringBuilder sb = new StringBuilder();
		sb.append(bonjour);
		if (isEmpty(input)){
			sb.append(caseEmpty(input));
		} else if (input.contains(",")) {
				sb.append(caseMultiNames(input));
		} else {
			if (isUpperCase(input)){
					sb = caseUpperC(input);
			} else {
					sb.append(input);				
			}
		}		
		return sb.toString();
	}
	
	private static String firstLetterToUpperCase(String input) {
		if (!input.trim().equals("")) {
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
	
	private static StringBuilder caseUpperC(String input){
		StringBuilder sb = new StringBuilder();
		sb.append(bonjour.toUpperCase());
		sb.append(input);
		sb.append(" !");
		return sb;
	}
	
	private static StringBuilder caseEmpty(String input) {
		StringBuilder sb = new StringBuilder();
		sb.append("my friend");
		return sb;
	}	
	
	private static StringBuilder caseMultiNames(String input) {
		StringBuilder sb = new StringBuilder();
		String[] names;
		boolean shoutedNames = false;
		names = input.split(",");
		int i;
		for (i = 0 ; i < names.length; i++ ) {
			names[i] = names[i].trim();
			names[i] = firstLetterToUpperCase(names[i]);
			if (isUpperCase(names[i])) 
				shoutedNames = true;
			sb.append(names[i]);
			if (i < names.length - 1)
				sb.append(separator);
		}
		if (shoutedNames)
			sb = caseShoutedName(names);
		return sb;
	}
	
	private static StringBuilder caseShoutedName(String[] input) {
		StringBuilder sb = new StringBuilder();
		String[] nameList = new String[input.length -1];
		String[] shoutedNameList = new String[1];
		int lenNameList = 0;
		for (int i = 0; i < input.length; i++) {
			if (isUpperCase(input[i])) {
				shoutedNameList[0] = input[i];
			} else {
				nameList[lenNameList] = input[i];
				sb.append(nameList[lenNameList]);
				if (lenNameList < nameList.length - 1)
					sb.append(separator);
				lenNameList++;
			}	
		}
		sb.append(". ");
		sb.append(rebonjour);
		sb.append(shoutedNameList[0]);
		sb.append(" !");
		return sb;
	}
}
