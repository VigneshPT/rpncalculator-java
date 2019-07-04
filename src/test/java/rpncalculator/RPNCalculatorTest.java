package rpncalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNCalculatorTest {

	@Test
	public void testSimpleAddition() {
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double result = rpnCalculator.evaluate("10 12 +");
		
		assertEquals(22, result, 0.0001);
		
		assertEquals(122, rpnCalculator.evaluate("100 22 +"), 0.0001);
	}
	
	@Test
	public void testSimpleSubtraction() {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double result = rpnCalculator.evaluate("10 12 -");
		
		assertEquals(-2, result, 0.0001);
		
	}
	
	@Test
	public void testSimpleMultiplication() {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double result = rpnCalculator.evaluate("100 9 *");
		
		assertEquals(900, result, 0.0001);
		
	}
	
	@Test
	public void testSimpleDivision() {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double result = rpnCalculator.evaluate("100 50 /");
		
		assertEquals(2, result, 0.0001);
		
	}
	
	@Test
	public void testComplexOperations() {
		
		RPNCalculator rpnCalculator = new RPNCalculator();
		
		double result = rpnCalculator.evaluate("100 50 / 10 9 + *");
		
		assertEquals(38, result, 0.0001);
		
	}
}
