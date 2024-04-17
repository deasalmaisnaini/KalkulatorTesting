package kalkulator;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.DecimalFormat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

//	 @Test
//	    public void testValidateOperand() {
//	        try {
//	            Validator.validateOperator('\n');  // Operand valid
//	        } catch (IllegalArgumentException e) {
//	            assertEquals("Operand 1 harus berada dalam range -32,768 hingga 32,767", e.getMessage());
//	        }
//
//	        try {
//	            Validator.validateOperand(50000);  // Operand di luar rentang
//	            fail("Expected IllegalArgumentException");
//	        } catch (IllegalArgumentException e) {
//	            assertEquals("Operand 1 harus berada dalam range -32,768 hingga 32,767", e.getMessage());
//	        }
//	    }
//
//
//    @Test
//    public void testCompute() {
//        assertEquals(10, Computation.compute(5, 5, '+'), 0.000001);  // Penambahan
//        assertEquals(0, Computation.compute(5, 5, '-'), 0.000001);  // Pengurangan
//        assertEquals(25, Computation.compute(5, 5, '*'), 0.00001);  // Perkalian
//
//    }
//  
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private ByteArrayInputStream in;

	@Before
	public void setUpStreams() {
		System.setOut(new PrintStream(outContent));
	}

	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	/* TCM01 */
	public void testMainAddition() {
		in = new ByteArrayInputStream("2\n3\n+\n".getBytes());
		System.setIn(in);
		MainApp.main(null);
		String expectedOutput = "[ -------------------- Program Kalkulator -------------------- ]\n"
				+ "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Hasil:" + " 5";
		String actualOutput = outContent.toString().trim(); // Menghapus spasi tambahan atau karakter non-printable
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	/* TCM02 */
	public void testMainSubstraction() {
		in = new ByteArrayInputStream("2\n3\n-\n".getBytes());
		System.setIn(in);
		MainApp.main(null);
		String expectedOutput = "[ -------------------- Program Kalkulator -------------------- ]\n"
				+ "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Hasil:" + " -1";
		String actualOutput = outContent.toString().trim(); // Menghapus spasi tambahan atau karakter non-printable
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	/* TCM03 */
	public void testMainMultiply() {
		in = new ByteArrayInputStream("2\n3\n*\n".getBytes());
		System.setIn(in);
		MainApp.main(null);
		String expectedOutput = "[ -------------------- Program Kalkulator -------------------- ]\n"
				+ "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Hasil:" + " 6";
		String actualOutput = outContent.toString().trim(); // Menghapus spasi tambahan atau karakter non-printable
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	/* TCM04 */
	public void testMainDivide() {
		in = new ByteArrayInputStream("5\n2\n/\n".getBytes());
		System.setIn(in);
		MainApp.main(null);
		String expectedOutput = "[ -------------------- Program Kalkulator -------------------- ]\n"
				+ "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Hasil:" + " 2.5";
		String actualOutput = outContent.toString().trim(); // Menghapus spasi tambahan atau karakter non-printable
		assertEquals(expectedOutput, actualOutput);
	}

	@Test
	/* TCM05 */ 
	public void testMainInvOperandSpecialCharacterOperand1() {
	    in = new ByteArrayInputStream("*\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperand1 = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Error: Operand harus berupa angka";
	    String actualOutputOperand1 = outContent.toString().trim();
	    assertEquals(expectedOutputOperand1, actualOutputOperand1);
	}
	
	@Test
	/* TCM06 */
	public void testMainInvOperandAlphabetOperand1() {
	    in = new ByteArrayInputStream("b\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperand1 = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Error: Operand harus berupa angka";
	    String actualOutputOperand1 = outContent.toString().trim();
	    assertEquals(expectedOutputOperand1, actualOutputOperand1);
	}
	
	@Test
	/* TCM07 */
	public void testMainInvEmptyFieldOperand1() {
	    in = new ByteArrayInputStream("\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperand1 = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Error: Operand pertama harus diisi";
	    String actualOutputOperand1 = outContent.toString().trim();
	    assertEquals(expectedOutputOperand1, actualOutputOperand1);
	}
	
	@Test
	/* TCM08 */
	public void testMainOverLimitOperand1LessThan() {
	    in = new ByteArrayInputStream("32770\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperand1LessThan = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Error: Operand harus berada dalam range -32,768 hingga 32,767";
	    String actualOutputOperand1LessThan = outContent.toString().trim(); 
	    assertEquals(expectedOutputOperand1LessThan, actualOutputOperand1LessThan);
	    outContent.reset();
	}
	
	@Test
	/* TCM09 */
	public void testMainOverLimitOperand1GreaterThan() {
	    in = new ByteArrayInputStream("50000\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperand1GreaterThan = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Error: Operand harus berada dalam range -32,768 hingga 32,767";
	    String actualOutputOperand1GreaterThan = outContent.toString().trim();
	    assertEquals(expectedOutputOperand1GreaterThan, actualOutputOperand1GreaterThan);
	    outContent.reset();
	}
	

	@Test
	/* TCM10 */
	public void testMainInvOperandSpecialCharacterOperand2() {
	    in = new ByteArrayInputStream("5\n*\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperand2 = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Masukkan operand kedua: Error: Operand harus berupa angka";
	    String actualOutputOperand2 = outContent.toString().trim();
	    assertEquals(expectedOutputOperand2, actualOutputOperand2);
	}
	
	@Test
	/* TCM11 */
	public void testMainInvOperandAlphabetOperand2() {
	    in = new ByteArrayInputStream("5\nb\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperand2 = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Masukkan operand kedua: Error: Operand harus berupa angka";
	    String actualOutputOperand2 = outContent.toString().trim();
	    assertEquals(expectedOutputOperand2, actualOutputOperand2);
	}
	
	@Test
	/* TCM12 */
	public void testMainInvEmptyFieldOperand2() {
	    in = new ByteArrayInputStream("1\n\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperand2 = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Masukkan operand kedua: Error: Operand kedua harus diisi";
	    String actualOutputOperand2 = outContent.toString().trim();
	    assertEquals(expectedOutputOperand2, actualOutputOperand2);
	}
	
	@Test
	/* TCM13 */
	public void testMainOverLimitOperand2LessThan() {
	    in = new ByteArrayInputStream("2\n-32772\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperand2LessThan = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Masukkan operand kedua: Error: Operand harus berada dalam range -32,768 hingga 32,767";
	    String actualOutputOperand2LessThan = outContent.toString().trim();
	    assertEquals(expectedOutputOperand2LessThan, actualOutputOperand2LessThan);
	    outContent.reset();
	}
	
	@Test
	/* TCM14 */
	public void testMainOverLimitOperand2GreaterThan() {
	    in = new ByteArrayInputStream("5\n50000\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperand2GreaterThan = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Masukkan operand kedua: Error: Operand harus berada dalam range -32,768 hingga 32,767";
	    String actualOutputOperand2GreaterThan = outContent.toString().trim();
	    assertEquals(expectedOutputOperand2GreaterThan, actualOutputOperand2GreaterThan);
	    outContent.reset();
	}
	
	@Test
	/* TCM15 */
	public void testMainInvEmptyFieldOperator() {
	    in = new ByteArrayInputStream("2\n5\n\n".getBytes());
	    System.setIn(in);
	    MainApp.main(null);
	    String expectedOutputOperator = "[ -------------------- Program Kalkulator -------------------- ]\n"
	            + "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Error: Operator harus diisi";
	    String actualOutputOperator = outContent.toString().trim();
	    assertEquals(expectedOutputOperator, actualOutputOperator);
	}
	
	@Test
	/* TCM16 */
	public void testMainInvOperatorSpecialCharacter() {
		in = new ByteArrayInputStream("2\n5\n!\n".getBytes());
		System.setIn(in);
		MainApp.main(null);
		String expectedOutputOperator = "[ -------------------- Program Kalkulator -------------------- ]\n"
				+ "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Error: Operator harus berupa +, -, *, atau /";
		String actualOutputOperator = outContent.toString().trim(); // Menghapus spasi tambahan atau karakter
		assertEquals(expectedOutputOperator, actualOutputOperator);

		
	}
	
	@Test
	/* TCM17 */
	public void testMainInvOperatorSpecialAlphabet() {
		in = new ByteArrayInputStream("2\n5\nb\n".getBytes());
		System.setIn(in);
		MainApp.main(null);
		String expectedOutputOperator = "[ -------------------- Program Kalkulator -------------------- ]\n"
				+ "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Error: Operator harus berupa +, -, *, atau /";
		String actualOutputOperator = outContent.toString().trim(); // Menghapus spasi tambahan atau karakter
		assertEquals(expectedOutputOperator, actualOutputOperator);

	}
	
	@Test
	/* TCM18 */
	public void testMainInvOperatorSpecialNumber() {
		in = new ByteArrayInputStream("2\n5\n8\n".getBytes());
		System.setIn(in);
		MainApp.main(null);
		String expectedOutputOperator = "[ -------------------- Program Kalkulator -------------------- ]\n"
				+ "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Error: Operator harus berupa +, -, *, atau /";
		String actualOutputOperator = outContent.toString().trim(); // Menghapus spasi tambahan atau karakter
		assertEquals(expectedOutputOperator, actualOutputOperator);

		
	}


}
