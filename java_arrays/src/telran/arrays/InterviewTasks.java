package telran.arrays;

import java.util.Arrays;

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
		short[] helper = new short[Short.MAX_VALUE];
		int indCur = 0;
		int num = 0;
		
		for (int i = 0; i < array.length; i++) 
			helper[array[i]]++;
		
		while (indCur < array.length) {
			if (helper[num] != 0) {
				Arrays.fill(array, indCur, indCur + helper[num], (short)num);
				indCur += helper[num];
			}
			num++;
		}
	}
	
	public static short getMaxWithNegativePresentation(short[] arr) {
		short[] helper = new short[Short.MAX_VALUE];
		short res = -1;
		
		for (int i = 0; i < arr.length; i++) {
			short cur = arr[i];
			
			if ((cur < 0 && helper[Math.abs(cur)] == 2) || (cur > 0 && helper[cur] == 1)) {
				if (res < Math.abs(cur)) 
					res = (short) Math.abs(cur);
			}
			helper[Math.abs(cur)] = cur < 0 ? (short)1 : 2;
		}
		return res;
	}

}
