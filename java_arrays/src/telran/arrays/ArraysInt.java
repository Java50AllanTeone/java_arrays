package telran.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysInt {

	public static int[] addNumber(int[] array, int number) {
		int[] res = Arrays.copyOf(array, array.length + 1);
		res[array.length] = number;
		return res;
	}
	
	public static int[] insertNumber(int[] array, int index, int number) {
		int[] res = new int[array.length + 1];
		System.arraycopy(array, 0, res, 0, index);
		res[index] = number;
		System.arraycopy(array, index, res, index + 1, array.length - index);
		
		return res;
	}
	
	//O(n)
	public static int searchNumber(int[] array, int number) {
		int index = 0;
		
		while (index < array.length && array[index] != number) {
			index++;
		}
		return index >= array.length ? -1 : index;
	}
	
	//O( log n)
	public static int binarySearch(int[] array, int number) {
		int left = 0;
		int right = array.length - 1;
		int middle = right / 2;
		
		while(left <= right && array[middle] != number) {
			if (number < array[middle]) {
				right = middle - 1;
			} else {
				left = middle + 1;
			}
			middle = (left + right) / 2;
		}
		return left <= right ? middle : -1;
	}
	
	//O(n * log n)
	public static void quickSort(int[] array) {
		Arrays.sort(array); 
	}
	
	//O(n^2)
	public static void bubbleSort(int[] array) {
		int length = array.length;
		boolean flSorted = false;
		
		do {
			length--;
			flSorted = true;
			
			for (int i = 0; i < length; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
					flSorted = false;
				}
			}
		} while(!flSorted);
	}

	
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[i] = temp;
	}
	
	public static int getRandomInt(int min, int max) {
		Random gen = new Random();
		
		return gen.nextInt(min, max + 1);
	}
	
}
