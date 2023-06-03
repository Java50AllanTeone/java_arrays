package java_arrays.allanteone.solution;

public class Subsequence {

	public static int maxSubsequenceLength(int[] arr) {
		if (arr.length < 2)
			return arr.length;
		
		int curLength = 1;
		int maxLength = 1;
		int curNum = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (curNum == arr[i])
				curLength++;
			else {
				curNum = arr[i];
				curLength = 1;
			}
			if (maxLength < curLength)
				maxLength = curLength;
		}
		return maxLength;
	}
}
