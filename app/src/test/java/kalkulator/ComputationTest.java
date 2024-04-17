package kalkulator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ComputationTest {

    @Test
    /* TCC01 */
    public void testComputeAddition() {
        double result = Computation.compute(2, 3, '+');
        assertEquals(5, result, 0.0001); 
    }

    @Test
    /* TCC02 */
    public void testComputeSubtraction() {
        double result = Computation.compute(2, 3, '-');
        assertEquals(-1, result, 0.0001);
    }

    @Test
    /* TCC03 */
    public void testComputeMultiplication() {
        double result = Computation.compute(2, 3, '*');
        assertEquals(6, result, 0.0001);
    }

    @Test
    /* TCC04 */
    public void testDivision() {
        double result = Computation.compute(10, 5, '/');
        assertEquals(2, result, 0.0001);
    }
    
    @Test
    /* TCC05 */
    public void testInvalidOperator() {
        try {
            Computation.compute(10, 5, '%');
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Operator tidak valid: %", e.getMessage());
        }
    }
    

}
