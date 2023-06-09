package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.arrays.solution.Anagram;

class AnagramTest {

	@Test
	void isAnagramTest() {
		//pos
		String target = "abcde";
		String src = "abcde";
		assertTrue(Anagram.isAnagram(src, target));
		
		target = "abcde";
		src = "cbaed";
		assertTrue(Anagram.isAnagram(src, target));
		
		target = "AbcdE";
		src = "cbaed";
		assertTrue(Anagram.isAnagram(src, target));
		
		target = "abcde";
		src = "AbcdE";
		assertTrue(Anagram.isAnagram(src, target));
		
		target = "aBCDe";
		src = "AbcdE";
		assertTrue(Anagram.isAnagram(src, target));
		
		//neg
		
		target = "abcde";
		src = "abcd";
		assertFalse(Anagram.isAnagram(src, target));
		
		target = "abcd";
		src = "abcde";
		assertFalse(Anagram.isAnagram(src, target));
		
		target = "";
		src = "abcde";
		assertFalse(Anagram.isAnagram(src, target));
		
		target = "abcde";
		src = "";
		assertFalse(Anagram.isAnagram(src, target));
		
		target = "";
		src = "";
		assertFalse(Anagram.isAnagram(src, target));
		
		target = "ab1cde";
		src = "abcde1";
		assertFalse(Anagram.isAnagram(src, target));
		
		target = "1abcde";
		src = "ab1cde";
		assertFalse(Anagram.isAnagram(src, target));
		
		target = "ab1cde";
		src = "ab1cde";
		assertFalse(Anagram.isAnagram(src, target));
		
		target = "ab~cde";
		src = "abcde~";
		assertFalse(Anagram.isAnagram(src, target));
		
		target = "~abcde";
		src = "ab~cde";
		assertFalse(Anagram.isAnagram(src, target));
		
		target = "ab~cde";
		src = "ab~cde";
		assertFalse(Anagram.isAnagram(src, target));
		
	}

}
