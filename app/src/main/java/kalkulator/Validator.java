package kalkulator;

public class Validator {

    public static void validateOperand(double operand) {
        if (operand < -32768 || operand > 32767) {
            throw new IllegalArgumentException("Operand harus berada dalam range -32,768 hingga 32,767");
        }
    }

    public static void validateOperator(char operator) {
        String operatorString = Character.toString(operator).trim();
        if (!operatorString.matches("[+\\-*/]")) {
            throw new IllegalArgumentException("Operator harus berupa +, -, *, atau /");
        }
    }

    public static void validateInput(String input, String fieldName) {
    	 if (input.trim().isEmpty()) {
             throw new IllegalArgumentException(fieldName + " harus diisi");
         }
    }
}
