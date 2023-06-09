package telran.arrays.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import telran.arrays.ArraysInt;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class ArraysTest {
	@Test
	void initialTest() {
		int[] ar1 = {1, 2, 3};
		int[] ar2 = {1, 2, 3};
		int[] ar2_3 = ar2;
		
		assertFalse(ar1 == ar2);
		assertTrue(ar2 == ar2_3);
		assertArrayEquals(ar1, ar2);
		ar2_3[0] = 10;
		ar1[0] = 10;
		assertArrayEquals(ar1, ar2);
		
	}
	
	@Test
	void copyOfIntTest() {
		int[] ar1 = {10, 5, 15};
		int[] expected1 = {10, 5, 15};
		int[] expected2 = {10, 5};
		int[] expected3 = {10, 5, 15, 0, 0};
		
		assertArrayEquals(expected1, Arrays.copyOf(ar1, 3));
		assertArrayEquals(expected2, Arrays.copyOf(ar1, 2));
		assertArrayEquals(expected3, Arrays.copyOf(ar1, 5));
	}
	
	@Test
	void addNumberTest() {
		int[] ar1 = {10, 5, 15};
		int number = 20;
		int[] expected = {10, 5, 15, number};
		
		assertArrayEquals(expected, ArraysInt.addNumber(ar1, number));
		
	}
	
	@Test
	void arraycopyTest() {
		int[] src = {1, 2, 3, 4, 5, 6, 7};
		int[] dest = {10, 20, 30, 40, 50, 60, 70};
		int[] expected = {10, 20, 30, 40, 1, 2, 3};
		System.arraycopy(src, 0, dest, 4, 3);
		assertArrayEquals(expected, dest);
	}
	
	@Test
	void insertNumberTest() {
		int[] src = {1, 2, 3, 4, 5, 6, 7};
		int number = 20;
		int index = 3;
		int[] expected1 = {1, 2, 3, 20, 4, 5, 6, 7};
		assertArrayEquals(expected1, ArraysInt.insertNumber(src, index, number));
		
		number = 30;
		index = 0;
		int[] expected2 = {30, 1, 2, 3, 4, 5, 6, 7};
		assertArrayEquals(expected2, ArraysInt.insertNumber(src, index, number));
		
		number = 40;
		index = 7;
		int[] expected3 = {1, 2, 3, 4, 5, 6, 7, 40};
		assertArrayEquals(expected3, ArraysInt.insertNumber(src, index, number));
	}
	
	@Test
	void maxLongTest() {
		assertEquals(Long.MAX_VALUE, getLongMax());
	}
	
	@Test
	void maxIntTest() {
		assertEquals(Integer.MAX_VALUE, getIntMax());
	}


	private long getLongMax() {
		long res = 1;
		
		while (res > 0) {
			res *= 2;
		}
		return res - 1;
	}
	
	private int getIntMax() {
		int res = 1;
		
		while (res > 0) {
			res++;
		}
		return res - 1;
	}
	
	
	
}
