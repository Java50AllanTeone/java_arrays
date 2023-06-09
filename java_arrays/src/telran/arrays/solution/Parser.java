package telran.arrays.solution;

public class Parser {
	static char opRound = '(';
	static char clRound = ')';
	static char opBrace = '{';
	static char clBrace = '}';
	static char opBox = '[';
	static char clBox = ']';
	
	public static boolean hasValidBrackets(String text) {
		char[] arr = new char[text.length()];	
		int indexText = 0;
		int indexArray = 0;
		boolean isValid = true;
		
		while (indexText < text.length() && isValid) {
			char cur = text.charAt(indexText++);
			
			if (isOpeningBracket(cur)) {
				arr[indexArray++] = cur;
			} else if (isClosingBracket(cur)) {
				if (indexArray == 0) {
					isValid = false;
				} else {
					indexArray--;
					isValid = isValidPair(arr[indexArray], cur);
				}
			}
		}
		return isValid && indexArray == 0;
	}
	
	
	public static boolean isValidPair(char open, char close) {
		return (open == opRound && close == clRound) || 
				(open == opBrace && close == clBrace) ||
				(open == opBox && close == clBox);
	}
	public static boolean isOpeningBracket(char bracket) {
		return bracket == opRound || bracket == opBox || bracket == opBrace;
	}
	public static boolean isClosingBracket(char bracket) {
		return bracket == clRound || bracket == clBox || bracket == clBrace;
	}
	
	
	

}
