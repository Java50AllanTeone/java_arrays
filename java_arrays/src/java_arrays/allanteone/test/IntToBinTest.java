package java_arrays.allanteone.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java_arrays.allanteone.solution.IntToBin;

class IntToBinTest {

	@Test
	void testBinaryToString() {
		assertEquals(Integer.toBinaryString(Integer.MAX_VALUE), IntToBin.toBinaryString(Integer.MAX_VALUE));
		assertEquals(Integer.toBinaryString(0), IntToBin.toBinaryString(0));
		assertEquals(Integer.toBinaryString(25), IntToBin.toBinaryString(25));
	}

}
