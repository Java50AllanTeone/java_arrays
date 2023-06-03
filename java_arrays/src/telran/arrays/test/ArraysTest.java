package telran.arrays.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import telran.arrays.ArraysInt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

public class ArraysTest {
	
	public static int[] bubbleArr1;
	public static int[] bubbleArr2;
	public static int[] bubbleArr3;
	
	public static int[] quickArr1;
	public static int[] quickArr2;
	public static int[] quickArr3;

	public static int[] binArr1;
	public static int[] binArr2;
	public static int[] binArr3;
	
	public static int[] numbsArr1;
	public static int[] numbsArr2;
	public static int[] numbsArr3;
	
	
	
	static int[] initArr(int num) {
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = ArraysInt.getRandomInt(0, 100_000);
		
		arr[arr.length - 1] = 0;
		return arr;
	}
	
	@BeforeAll
	static void initArrays() {
		bubbleArr1 = initArr(100_000);
		bubbleArr2 = initArr(200_000);
		bubbleArr3 = initArr(300_000);
		
		quickArr1 = initArr(100_000);
		quickArr2 = initArr(200_000);
		quickArr3 = initArr(300_000);
		
		binArr1 = initArr(100_000);
		binArr2 = initArr(200_000);
		binArr3 = initArr(200_000);

		numbsArr1 = initArr(100_000);
		numbsArr2 = initArr(200_000);
		numbsArr3 = initArr(200_000);
	}

	@Test
	void binarySearchFirstTest() {
		//positive tests		
		int[] src = {1, 1, 1, 1, 1, 1};
		int number = 1;
		int expected = 0;
		assertEquals(expected, ArraysInt.binarySearchFirst(src, number));
		
		src = new int[]{1, 1, 1, 1, 1};
		number = 1;
		expected = 0;
		assertEquals(expected, ArraysInt.binarySearchFirst(src, number));
		
		src = new int[]{2, 2, 2, 2, 3, 4, 4, 4, 4, 5, 6, 7, 8};
		number = 2;
		expected = 0;
		assertEquals(expected, ArraysInt.binarySearchFirst(src, number));
		
		src = new int[]{2, 3, 4, 4, 4, 4, 5, 6, 7, 8};
		number = 4;
		expected = 2;
		assertEquals(expected, ArraysInt.binarySearchFirst(src, number));
		
		src = new int[]{2, 3, 4, 5, 6, 7, 8, 8, 8};
		number = 8;
		expected = 6;
		assertEquals(expected, ArraysInt.binarySearchFirst(src, number));
		
		src = new int[]{2, 3, 4, 5, 6, 7, 8};
		number = 8;
		expected = 6;
		assertEquals(expected, ArraysInt.binarySearchFirst(src, number));
		
		
		//negative tests
		src = new int[]{2, 3, 4, 5, 6, 7, 8};
		number = 1;
		expected = -1;
		assertEquals(expected, ArraysInt.binarySearchFirst(src, number));
		
		src = new int[]{1, 2, 3, 4, 6, 7, 8};
		number = 5;
		expected = -5;
		assertEquals(expected, ArraysInt.binarySearchFirst(src, number));
		
		src = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		number = 9;
		expected = -9;
		assertEquals(expected, ArraysInt.binarySearchFirst(src, number));
	}
	
	@Test
	@DisplayName("muchRepeatedTest with 1_000_000 elements")
	void muchRepeatedTest() {
		
		
		for (int i = 0; i < 1_000_000; i++) {
			int[] array = initArr(1_000);
			ArraysInt.quickSort(array);
			
			assertEquals(0, ArraysInt.binarySearchFirst(array, 0));
		}
	}
	
	
	//performance tests
	
	//bubble sort
	@Test
	@DisplayName("bubbleSort with 100_000 elements")
	void bubblesortPerfTest1() {
		
		ArraysInt.bubbleSort(bubbleArr1);
	}
	
	@Test
	@DisplayName("bubbleSort with 200_000 elements")
	void bubblesortPerfTest2() {
		
		ArraysInt.bubbleSort(bubbleArr2);
	}
	
	@Test
	@DisplayName("bubbleSort with 300_000 elements")
	void bubblesortPerfTest3() {
		
		ArraysInt.bubbleSort(bubbleArr3);
	}
	
	//quick sort
	@Test
	@DisplayName("quickSort with 100_000 elements")
	void quickSortPerfTest1() {
		
		ArraysInt.quickSort(quickArr1);
	}
	
	@Test
	@DisplayName("quickSort with 200_000 elements")
	void quickSortPerfTest2() {
		
		ArraysInt.quickSort(quickArr2);
	}
	
	@Test
	@DisplayName("quickSort with 300_000 elements")
	void quickSortPerfTest3() {
		
		ArraysInt.quickSort(quickArr3);
	}
	
	//searchNumber
	@Test
	@DisplayName("searchNumber with 100_000_000 elements")
	void searchNumberPerfTest1() {
		ArraysInt.searchNumber(numbsArr1, numbsArr1[numbsArr1.length - 1]);
	}
	
	@Test
	@DisplayName("searchNumber with 200_000_000 elements")
	void searchNumberPerfTest2() {
		ArraysInt.searchNumber(numbsArr2, numbsArr2[numbsArr2.length - 1]);
	}
	
	@Test
	@DisplayName("searchNumber with 300_000_000 elements")
	void searchNumberPerfTest3() {
		ArraysInt.searchNumber(numbsArr3, numbsArr3[numbsArr3.length - 1]);
	}
	
	//binarySearch
	@Test
	@DisplayName("binarySearch with 100_000_000 elements")
	void binarySearchPerfTest1() {
		ArraysInt.binarySearch(binArr1, binArr1[binArr1.length - 1]);
	}
	
	@Test
	@DisplayName("binarySearch with 200_000_000 elements")
	void binarySearchPerfTest2() {
		ArraysInt.binarySearch(binArr2, binArr2[binArr2.length - 1]);
	}
	
	@Test
	@DisplayName("binarySearch with 300_000_000 elements")
	void binarySearchPerfTest3() {
		ArraysInt.binarySearch(binArr3, binArr3[binArr3.length - 1]);
	}
	
	
	
}
