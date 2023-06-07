package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static telran.arrays.MatricesInt.*;

class MatricesTest {

	@Test
	void multiplyConstantTest() {
		int[][] src = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		int[][] src1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
		int[][] src2 = {{1, 10, 20}, {30, -10, 15}};
		
		int[][] expected = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};
		int[][] expected1 = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
		int[][] expected2 = {{2, 20, 40}, {60, -20, 30}};
		
		assertArrayEquals(expected, multiplyConstant(src, 2));
		assertArrayEquals(expected1, multiplyConstant(src1, 2));
		assertArrayEquals(expected2, multiplyConstant(src2, 2));
	}
	
	
	
	@Test
	void getColumnTest() {
		int[][] src = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		int[][] src1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] src2 = {{1, 10, 20}, {30, -10, 15}};
		
		int[] expected = {1, 1, 1};
		int[] expected1 = {2, 5, 8};
		int[] expected2 = {20, 15};
		
		assertArrayEquals(expected, getColumn(src, 0));
		assertArrayEquals(expected1, getColumn(src1, 1));
		assertArrayEquals(expected2, getColumn(src2, 2));
	}
	
	
	@Test
	void transpMatrixTest() {
		int[][] src2 = {{1, 10, 20}, {30, -10, 15}};
		int[][] expected = {{1, 30}, {10, -10}, {20, 15}};
		
		assertArrayEquals(expected, transpMatrix(src2));
	}
	
	

}
