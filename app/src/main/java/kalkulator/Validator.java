package kalkulator;

public class Validator {

    public static void validateOperand(double operand) {

        if (operand < -32768 || operand > 32767) {
            throw new IllegalArgumentException("Operand harus berada dalam range -32,768 hingga 32,767");
        }
    }

    public static void validateOperator(char operator) {
        if (!Character.toString(operator).matches("[+\\-*/]")) {
            throw new IllegalArgumentException("Operator harus berupa +, -, *, atau /");
        }
    }

}

