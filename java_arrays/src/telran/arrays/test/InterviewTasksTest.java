package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static telran.arrays.InterviewTasks.*;

import java.util.Arrays;

class InterviewTasksTest {
	static short[] array;
	static short[] array1;
	static short[] array2;
	static short[] array3;
	
	static short[] arrSort;
	static short[] arrSortExpected;
	
	@BeforeAll
	static void initArr() {
		array = new short[]{1, 1, 1, -1, 20, 100, 200, 100, -100, -100, -20, -40, 80};
		array1 = new short[]{-40, 1, -40, -6, 2, 3, 40};
		array2 = new short[]{40, 1, 2, 3, 40, -30};
		array3 = new short[]{40, 1, 2, 3, 40, -40, -30};
		
		arrSort = new short[1_000_000];
		getArray(arrSort);
		
		arrSortExpected = new short[1_000_000];
		System.arraycopy(arrSort, 0, arrSortExpected, 0, arrSort.length);
		Arrays.sort(arrSortExpected);
	}
	
	
	static void getArray(short[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (short)(Math.random() * Short.MAX_VALUE);
		}
	}

	@Test
	void getMaxWithNegativeTest() {

	assertEquals(100, getMaxWithNegativePresentation(array));
	assertEquals(40, getMaxWithNegativePresentation(array1));
	assertEquals(-1, getMaxWithNegativePresentation(array2));
	assertEquals(40, getMaxWithNegativePresentation(array3));
	}
	
	@Test
	void sortTest() {
		sort(arrSort);
		assertArrayEquals(arrSortExpected, arrSort);
	}
	

}
