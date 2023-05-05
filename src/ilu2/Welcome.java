package ilu2;

public class Welcome {
	private static final String BONJOUR = "Hello, ";
	private static final String REBONJOUR = "AND HELLO, ";
	private static final String SEPARATOR = ", ";
	private static final String ENDER = " and ";
	private static final String POINT = ".";
	private static final String EXCLAMATION = " !";

	public static String welcome (String input) {
		input = nameSanitizer(input);
		StringBuilder sb = new StringBuilder();
		sb.append(BONJOUR);
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
		sb.append(BONJOUR.toUpperCase());
		sb.append(input);
		sb.append(EXCLAMATION);
		return sb;
	}
	
	private static StringBuilder caseEmpty(String input) {
		StringBuilder sb = new StringBuilder();
		sb.append("my friend");
		return sb;
	}
	
	private static String nameSanitizer(String input) {
		input = input.trim();
		input = firstLetterToUpperCase(input);
		return input;
	}
	
	private static StringBuilder caseMultiNames(String input) {
		StringBuilder sb = new StringBuilder();
		String[] names;
		boolean shoutedNames = false;
		int numberShoutedNames = 0;
		names = input.split(",");
		int i;
		for (i = 0 ; i < names.length; i++ ) {
			names[i] = nameSanitizer(names[i]);
			if (isUpperCase(names[i])){ 
				shoutedNames = true;
				numberShoutedNames++;
			}
			sb = appendNames(names, names.length);
		}
		if (shoutedNames)
			sb = caseShoutedNames(names,numberShoutedNames);
		return sb;
	}
	
	private static StringBuilder caseShoutedNames(String[] input, int noShoutedNames) {
		StringBuilder sb = new StringBuilder();
		String[] nameList = new String[input.length - noShoutedNames];
		String[] shoutedNamesList = new String[noShoutedNames];
		int lenNameList = 0;
		int lenShoutedNameList = 0;
		for (int i = 0; i < input.length; i++) {
			if (isUpperCase(input[i])) {
				shoutedNamesList[lenShoutedNameList] = input[i];
				lenShoutedNameList++;
			} else {
				nameList[lenNameList] = input[i];
				lenNameList++;
			}	
		}
		sb.append(appendNames(nameList, lenNameList));
		sb.append(appendShoutedNames(shoutedNamesList, lenShoutedNameList));
		return sb;
	}
	
	private static StringBuilder appendNames(String[] input, int numberNames) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numberNames - 1; i ++) {
			sb.append(input[i]);
			if (i < numberNames - 2)
				sb.append(SEPARATOR);
		}
		if (numberNames != 1)
			sb.append(ENDER);
		sb.append(input[numberNames - 1].trim());
		return sb;
	}
	
	private static StringBuilder appendShoutedNames(String[] input, int numberShoutedNames) {
		StringBuilder sb = new StringBuilder();
		sb.append(POINT);
		sb.append(" ");
		sb.append(REBONJOUR);
		if (numberShoutedNames > 1) {
			for (int i = 0; i < numberShoutedNames - 1; i ++) {
				sb.append(input[i]);
				if (i < numberShoutedNames - 2)
					sb.append(SEPARATOR);
			}
		sb.append(ENDER.toUpperCase());
		}
		sb.append(input[numberShoutedNames - 1]);
		sb.append(EXCLAMATION);
		
		return sb;
	}
}
