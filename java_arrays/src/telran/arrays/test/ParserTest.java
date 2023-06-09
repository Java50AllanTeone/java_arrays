package telran.arrays.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import telran.arrays.solution.Parser;

public class ParserTest {
	
	@Test
	public void hasValidBracketsTest() {
		String src = "aaaaaa (sdfsdfdsf[dfd(f)f] zcvzxcv {{[ghjk]}} asd )";
		String src1 = "((({{[[]]}})))";
		String src2 = ")dfgswfgsf(";
		String src3 = "[werwert(wertwrtw] wertrt)";
		
		
		assertTrue(Parser.hasValidBrackets(src));
		assertTrue(Parser.hasValidBrackets(src1));
		assertFalse(Parser.hasValidBrackets(src2));
		assertFalse(Parser.hasValidBrackets(src3));
	}

}
