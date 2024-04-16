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
	    /* TCM 01 */
	    public void testMainAddition() {
	        in = new ByteArrayInputStream("2\n3\n+\n".getBytes());
	        System.setIn(in);

	        MainApp.main(null);

	        String expectedOutput = "[ -------------------- Program Kalkulator -------------------- ]\n" +
                    "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Hasil:" + " 5";
	        String actualOutput = outContent.toString().trim();  // Menghapus spasi tambahan atau karakter non-printable

	        assertEquals(expectedOutput, actualOutput);
   
	    }
	    
	    @Test
	    /* TCM 02 */
	    public void testMainSubstraction() {
	        in = new ByteArrayInputStream("2\n3\n-\n".getBytes());
	        System.setIn(in);

	        MainApp.main(null);

	        String expectedOutput = "[ -------------------- Program Kalkulator -------------------- ]\n" +
                    "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Hasil:" + " -1";
	        String actualOutput = outContent.toString().trim();  // Menghapus spasi tambahan atau karakter non-printable

	        assertEquals(expectedOutput, actualOutput);
   
	    }
	    
	    @Test
	    
	    public void testMainMultiply() {
	        in = new ByteArrayInputStream("2\n3\n*\n".getBytes());
	        System.setIn(in);

	        MainApp.main(null);

	        String expectedOutput = "[ -------------------- Program Kalkulator -------------------- ]\n" +
                    "Masukkan operand pertama: Masukkan operand kedua: Masukkan operator (+, -, *, /): Hasil:" + " 6";
	        String actualOutput = outContent.toString().trim();  // Menghapus spasi tambahan atau karakter non-printable

	        assertEquals(expectedOutput, actualOutput);
   
	    }
	    
	    @Test
	    public void testMainInvOperandSpecialCharacter() {
	        in = new ByteArrayInputStream("*\n".getBytes());
	        System.setIn(in);

	        MainApp.main(null);

	        String expectedOutputOperand1 = "[ -------------------- Program Kalkulator -------------------- ]\n" +
	                "Masukkan operand pertama: Operand harus berupa angka";
	        String actualOutputOperand1 = outContent.toString().trim();  // Menghapus spasi tambahan atau karakter non-printable

	        assertEquals(expectedOutputOperand1, actualOutputOperand1);
	        
	        in = new ByteArrayInputStream("b\n".getBytes());
	        System.setIn(in);

	        MainApp.main(null);

	        String expectedOutputOperand2 = "[ -------------------- Program Kalkulator -------------------- ]\n" +
	                "Masukkan operand pertama: Operand harus berupa angka";
	        String actualOutputOperand2 = outContent.toString().trim();  // Menghapus spasi tambahan atau karakter non-printable

	        assertEquals(expectedOutputOperand1, actualOutputOperand1);
	        assertEquals(expectedOutputOperand2, actualOutputOperand2);
	    }

	    @Test
	    public void testMainInvOperandAlphabet() {
	        in = new ByteArrayInputStream("b\n".getBytes());
	        System.setIn(in);

	        MainApp.main(null);

	        String expectedOutput = "[ -------------------- Program Kalkulator -------------------- ]\n" +
	                "Masukkan operand pertama: Operand harus berupa angka";
	        String actualOutput = outContent.toString().trim();  // Menghapus spasi tambahan atau karakter non-printable

	        assertEquals(expectedOutput, actualOutput);
	    }


}
