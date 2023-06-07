package telran.arrays;

public class InterviewTasks {
	
	//O(n^2)
	static public boolean isSumTwo(short[] array, short sum) {
		boolean res = false;
		int i = 0;
		
		while(i < array.length && !res) {
			short num = (short) (sum - array[i]);
			int j = 0;
			while (j < array.length && !res) {
				if (array[j] == num && j != i              ) {
					res = true;
				}
				j++;
			}
			i++;
		}
		return res;
	}
	
	//O(n)
	static public boolean isSumTwo1(short[] array, short sum) {
		 boolean[] helper = new boolean[sum > 0 ? sum + 1 : Short.MAX_VALUE];
		 
		 boolean res = false;
		 int index = 0;
		 
		 while (index < array.length && !res) {
			 short num = (short) (sum - array[index]); 
			 if (num >= 0) {
				 if (helper[num])
					 res = true;
				 else 
					 helper[array[index]] = true;
			 }
			 index++;
		 }
		 return res;
	}
	
	
	public static void sort(short[] array) {
		
	}
	
	public static short getMaxWithNegativePresentation(short[] arr) {
		return 0;
	}

}
