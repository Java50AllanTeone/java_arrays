package telran.arrays.solution;

public class Parser {
	final static char opRound = '(';
	final static char clRound = ')';
	final static char opBrace = '{';
	final static char clBrace = '}';
	final static char opBox = '[';
	final static char clBox = ']';
	
	public static boolean hasValidBrackets(String text) {
		char[] arr = new char[text.length()];	
		int indexText = 0;
		int indexArray = 0;
		boolean isValid = true;
		
		while (indexText < text.length() && isValid) {
			char cur = text.charAt(indexText);
			
			if (cur == opRound || cur == opBrace || cur == opBox) {
				arr[indexArray++] = cur;
			} else if (cur == clRound || cur == clBrace || cur == clBox) {
				if (indexArray == 0) {
					isValid = false;
					break;
				} else {
					indexArray--;
					isValid = isValidBracket(arr[indexArray], cur);
				}
			}
			indexText++;
		}
		return isValid && indexArray == 0;
	}
	
	
	public static boolean isValidBracket(char open, char close) {
		return (open == opRound && close == clRound) || 
				(open == opBrace && close == clBrace) ||
				(open == opBox && close == clBox);
	}
	
	
	

}
