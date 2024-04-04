package kalkulator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
	
	 @Test
	    public void testValidateOperand() {
	        try {
	            Validator.validateOperand(5);  // Operand valid
	        } catch (IllegalArgumentException e) {
	            fail("Exception not expected");
	        }

	        try {
	            Validator.validateOperand(50000);  // Operand di luar rentang
	            fail("Expected IllegalArgumentException");
	        } catch (IllegalArgumentException e) {
	            assertEquals("Operand 1 harus berada dalam range -32,768 hingga 32,767", e.getMessage());
	        }
	    }


    @Test
    public void testCompute() {
        assertEquals(10, Computation.compute(5, 5, '+'), 0.000001);  // Penambahan
        assertEquals(0, Computation.compute(5, 5, '-'), 0.000001);  // Pengurangan
        assertEquals(25, Computation.compute(5, 5, '*'), 0.00001);  // Perkalian

    }
}
