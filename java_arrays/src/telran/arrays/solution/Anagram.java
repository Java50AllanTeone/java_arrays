package telran.arrays.solution;

public class Anagram {
	final static char LOWER_A = 'a';
	final static char LOWER_Z = 'z';
	final static int INTERVAL = LOWER_A - 'A';
	
	public static boolean isAnagram(String sourceWord, String targetWord) {
		byte[] helper = new byte[LOWER_Z + 1];
		boolean res = true;
		int index = 0;
		
		if (sourceWord.length() == 0 || sourceWord.length() - targetWord.length() != 0)
			return false;
		
		while (index < sourceWord.length() && res) {
			char sourceCh = toLowerCh(sourceWord.charAt(index));
			char targetCh = toLowerCh(targetWord.charAt(index));
			
			if (isValidSymb(sourceCh) && isValidSymb(targetCh)) {
				helper[sourceCh]++;
				helper[targetCh]--;
			} else {
				System.err.println("Not a valid symbol");
				res = false;
			}
			
			index++;
		}
		
		for (int i = 0; i < helper.length; i++) {
			if (helper[i] != 0) {
				res = false;
			}
		}
		return res;
	}
	
	public static boolean isValidSymb(char ch) {
		
		return ch >= LOWER_A && ch <= LOWER_Z;
	}
	
	public static char toLowerCh(char ch) {
		return (char) (ch < LOWER_A ? ch + INTERVAL : ch);
	}

}
