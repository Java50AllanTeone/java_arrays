package java_arrays.allanteone.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java_arrays.allanteone.solution.Subsequence;

class SubsequenceTest {

	@Test
	void testMaxSubsequenceLength() {
		int[] src = {1, 2, 3, 4, 5, 6, 7};
		int exp = 1;
		assertEquals(exp, Subsequence.maxSubsequenceLength(src));
		
		src = new int[] {1, 1, 2, 3, 4, 5};
		exp = 2;
		assertEquals(exp, Subsequence.maxSubsequenceLength(src));
		
		src = new int[] {1, 1, 1, 1, 1, 1};
		exp = 6;
		assertEquals(exp, Subsequence.maxSubsequenceLength(src));
		
		src = new int[] {1, 1, 2, 5, 5, 5};
		exp = 3;
		assertEquals(exp, Subsequence.maxSubsequenceLength(src));
		
		src = new int[] {1, 1, 2, 2, 2, 2, 5, 5, 5};
		exp = 4;
		assertEquals(exp, Subsequence.maxSubsequenceLength(src));
		
		src = new int[] {};
		exp = 0;
		assertEquals(exp, Subsequence.maxSubsequenceLength(src));
		
		src = new int[] {1};
		exp = 1;
		assertEquals(exp, Subsequence.maxSubsequenceLength(src));
	}

}
