package kalkulator;

import static org.junit.Assert.*;
import org.junit.Test;

public class ValidatorTest {

	@Test(expected = IllegalArgumentException.class)
	/* TCV01 */
    public void testValidateOperandLessThanMin() {
        try {
            Validator.validateOperand(-32780);
        } catch (IllegalArgumentException e) {
            assertEquals("Operand harus berada dalam range -32,768 hingga 32,767", e.getMessage());
            throw e;
        }
    }

  
    @Test(expected = IllegalArgumentException.class)
    /* TCV02 */
    public void testValidateOperandGreaterThanMax() {
        try {
            Validator.validateOperand(32780);
        } catch (IllegalArgumentException e) {
            assertEquals("Operand harus berada dalam range -32,768 hingga 32,767", e.getMessage());
            throw e;
        }
    }

    @Test
    /* TCV03 */
    public void testValidateOperandMinValue() {
        try {
            Validator.validateOperand(-32768);
        } catch (IllegalArgumentException e) {
            fail("Tidak seharusnya melempar IllegalArgumentException");
        }
    }

    @Test
    /* TCV04 */
    public void testValidateOperandMaxValue() {
        try {
            Validator.validateOperand(32767);
        } catch (IllegalArgumentException e) {
            fail("Tidak seharusnya melempar IllegalArgumentException");
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    /* TCV05 */
    public void testValidateOperatorSpecialCharacter() {
        try {
            Validator.validateOperator('!'); // Karakter spesial selain +, -, *, dan /
        } catch (IllegalArgumentException e) {
            assertEquals("Operator harus berupa +, -, *, atau /", e.getMessage());
            throw e;
        }
    }

  
    @Test(expected = IllegalArgumentException.class)
    /* TCV06 */
    public void testValidateOperatorAlphabet() {
        try {
            Validator.validateOperator('a'); // Karakter huruf
        } catch (IllegalArgumentException e) {
            assertEquals("Operator harus berupa +, -, *, atau /", e.getMessage());
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    /* TCV08 */
    public void testValidateOperatorNumeric() {
        try {
            Validator.validateOperator('8'); // Angka
        } catch (IllegalArgumentException e) {
            assertEquals("Operator harus berupa +, -, *, atau /", e.getMessage());
            throw e;
        }
    }

  
    @Test
    /* TCV09 */
    public void testValidateOperatorAddition() {
        try {
            Validator.validateOperator('+');
        } catch (IllegalArgumentException e) {
            fail("Tidak seharusnya melempar IllegalArgumentException");
        }
    }

    @Test
    /* TCV10 */
    public void testValidateOperatorSubtraction() {
        try {
            Validator.validateOperator('-');
        } catch (IllegalArgumentException e) {
            fail("Tidak seharusnya melempar IllegalArgumentException");
        }
    }

    @Test
    /* TCV11 */
    public void testValidateOperatorMultiplication() {
        try {
            Validator.validateOperator('*');
        } catch (IllegalArgumentException e) {
            fail("Tidak seharusnya melempar IllegalArgumentException");
        }
    }

    @Test
    /* TCV12 */
    public void testValidateOperatorDivision() {
        try {
            Validator.validateOperator('/');
        } catch (IllegalArgumentException e) {
            fail("Tidak seharusnya melempar IllegalArgumentException");
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    /* TCV13 */
    public void testValidateInputOperand1Empty() {
        try {
            Validator.validateInput("", "Operand 1");
        } catch (IllegalArgumentException e) {
            assertEquals("Operand 1 harus diisi", e.getMessage());
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    /* TCV14 */
    public void testValidateInputOperand2Empty() {
        try {
            Validator.validateInput("", "Operand 2");
        } catch (IllegalArgumentException e) {
            assertEquals("Operand 2 harus diisi", e.getMessage());
            throw e;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    /* TCV15 */
    public void testValidateInputOperatorEmpty() {
        try {
            Validator.validateInput("", "Operator");
        } catch (IllegalArgumentException e) {
            assertEquals("Operator harus diisi", e.getMessage());
            throw e;
        }
    }

    @Test
    /* TCV15 */
    public void testValidateInputOperand1NotEmpty() {
        try {
            Validator.validateInput("10", "Operand 1");
        } catch (IllegalArgumentException e) {
            fail("Tidak seharusnya melempar IllegalArgumentException");
        }
    }

    @Test
    /* TCV16 */
    public void testValidateInputOperand2NotEmpty() {
        try {
            Validator.validateInput("5", "Operand 2");
        } catch (IllegalArgumentException e) {
            fail("Tidak seharusnya melempar IllegalArgumentException");
        }
    }

    @Test
    /* TCV17 */
    public void testValidateInputOperatorNotEmpty() {
        try {
            Validator.validateInput("+", "Operator");
        } catch (IllegalArgumentException e) {
            fail("Tidak seharusnya melempar IllegalArgumentException");
        }
    }

}
