package kalkulator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		// TCK 1
		double result = Calculator.add(2, 3);
		assertEquals(5, result, 0.0001);

		// TCK 2
		result = Calculator.add(2, -3);
		assertEquals(-1, result, 0.0001);

		// TCK 3
		result = Calculator.add(-2, 3);
		assertEquals(1, result, 0.0001);

		// TCK 4
		result = Calculator.add(-2, -3);
		assertEquals(-5, result, 0.0001);

		// TCK 5
		result = Calculator.add(1.5, 2.25);
		assertEquals(3.75, result, 0.0001);

		// TCK 6
		result = Calculator.add(1.5, -2.25);
		assertEquals(-0.75, result, 0.0001);
		
		// TCK 7
		result = Calculator.add(-1.5, 2.25);
		assertEquals(0.75, result, 0.0001);

		// TCK 8
		result = Calculator.add(-1.5, -2.25);
		assertEquals(-3.75, result, 0.0001);

		// TCK 9
		result = Calculator.add(1000, 0.625);
		assertEquals(1000.625, result, 0.0001);

		// TCK 10
		result = Calculator.add(-1000, 0.625);
		assertEquals(-999.375, result, 0.0001);

		// TCK 11
		result = Calculator.add(-1000, -10.256);
		assertEquals(-1010.256, result, 0.0001);
	}

	@Test
	public void testSubtract() {
		// TCK 12
		double result = Calculator.subtract(2, 3);
		assertEquals(-1, result, 0.0001);

		// TCK 13
		result = Calculator.subtract(2, -3);
		assertEquals(5, result, 0.0001);

		// TCK 14
		result = Calculator.subtract(-2, 3);
		assertEquals(-5, result, 0.0001);

		// TCK 15
		result = Calculator.subtract(-2, -3);
		assertEquals(1, result, 0.0001);


		// TCK 16
		result = Calculator.subtract(1.5, 2.25);
		assertEquals(-0.75, result, 0.0001);

		// TCK 17
		result = Calculator.subtract(1.5, -2.25);
		assertEquals(3.75, result, 0.0001);
		
		// TCK 18
		result = Calculator.subtract(-1.5, 2.25);
		assertEquals(-3.75, result, 0.0001);

		// TCK 19
		result = Calculator.subtract(-1.5, -2.25);
		assertEquals(0.75, result, 0.0001);

		// TCK 20
		result = Calculator.subtract(1000, 0.625);
		assertEquals(999.375, result, 0.0001);

		// TCK 21
		result = Calculator.subtract(-1000, 0.625);
		assertEquals(-1000.625, result, 0.0001);

		// TCK 22
		result = Calculator.subtract(-1000, -10.256);
		assertEquals(-989.744, result, 0.0001);
	}

	@Test
	public void testMultiply() {
		// TCK 23
		double result = Calculator.multiply(2, 3);
		assertEquals(6, result, 0.0001);

		// TCK 24
		result = Calculator.multiply(4, -5);
		assertEquals(-20, result, 0.0001);

		// TCK 25
		result = Calculator.multiply(-5, 4);
		assertEquals(-20, result, 0.0001);

		// TCK 26
		result = Calculator.multiply(-6, -6);
		assertEquals(36, result, 0.0001);

		// TCK 27
		result = Calculator.multiply(1.2, 1.5);
		assertEquals(1.8, result, 0.0001);

		// TCK 28
		result = Calculator.multiply(1.5, -3.2);
		assertEquals(-4.8, result, 0.0001);

		// TCK 29
		result = Calculator.multiply(-2.4, 4.2);
		assertEquals(-10.08, result, 1);

		// TCK 30
		result = Calculator.multiply(-6.5, -7.8);
		assertEquals(50.7, result, 0.0001);

		// TCK 31
		result = Calculator.multiply(12, 0.2);
		assertEquals(2.4, result, 0.0001);

		// TCK 32
		result = Calculator.multiply(-5, 0.5);
		assertEquals(-2.5, result, 0.0001);

		// TCK 33
		result = Calculator.multiply(-6, -0.6);
		assertEquals(3.6, result, 0.0001);
	}

	@Test
	public void testDivideByZero() {
		// TCK 34
		ArithmeticException exception = assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
		assertEquals("Pembagi tidak boleh nol", exception.getMessage());

		// TCK 35
		exception = assertThrows(ArithmeticException.class, () -> Calculator.divide(10, 0));
		assertEquals("Pembagi tidak boleh nol", exception.getMessage());

	}
	
	@Test
	public void testDivide() {
		// TCK 36
		double result = Calculator.divide(18, 2);
		assertEquals(9, result, 0.0001);

		// TCK 37
		result = Calculator.divide(34, -17);
		assertEquals(-2, result, 0.0001);

		// TCK 38
		result = Calculator.divide(-9, 3);
		assertEquals(-3, result, 0.0001);

		// TCK 39
		result = Calculator.divide(-15, -4);
		assertEquals(3.75, result, 0.0001);

		// TCK 40
		result = Calculator.divide(4.5, 0.5);
		assertEquals(9, result, 0.0001);

		// TCK 41
		result = Calculator.divide(4.5, -0.5);
		assertEquals(-9, result, 0.0001);

		// TCK 42
		result = Calculator.divide(-2.5, 0.5);
		assertEquals(-5, result, 1);

		// TCK 43
		result = Calculator.divide(-2.5, -0.5);
		assertEquals(5, result, 0.0001);

		// TCK 44
		result = Calculator.divide(5, -2.5);
		assertEquals(-2, result, 0.0001);

		// TCK 45
		result = Calculator.divide(-5, 0.5);
		assertEquals(-10, result, 0.0001);

		// TCK 46
		result = Calculator.divide(-6, -0.6);
		assertEquals(10, result, 0.0001);
		
		// TCK 47
		result = Calculator.divide(0, 5);
		assertEquals(0, result, 0.0001);
	}

	
	

}
