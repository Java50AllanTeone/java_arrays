package java_arrays.allanteone.solution;

public class IntToBin {
	
	public static String toBinaryString(int number) {
		String res = "";
		
		do {
			int bin = number % 2;
			res = bin + res;
			number /= 2;
		} while (number > 0);
		
		return  res;

	}
	

	

	
	
}
