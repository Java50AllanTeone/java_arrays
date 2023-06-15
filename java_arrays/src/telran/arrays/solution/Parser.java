package telran.arrays.solution;

public class Parser {

	public static boolean hasValidBrackets(String text) {
		char[] arr = new char[text.length()];	
		int indArr = 0;
		boolean isValid = true;
		
		for (int indText = 0; indText < text.length() && isValid; indText++) {
			char cur = text.charAt(indText);
			
			if (cur == '(' || cur == '[' || cur == '{') {
				arr[indArr++] = cur;
			} else if (cur == ')' || cur == ']' || cur == '}') {
				isValid = indArr != 0 ? isValidPair(arr[--indArr], cur) : false;
			}
		}
		return isValid && indArr == 0;
	}
	
	public static boolean isValidPair(char open, char close) {
		return (open == '(' && close == ')') || 
				(open == '{' && close == '}') ||
				(open == '[' && close == ']');
	}
}
