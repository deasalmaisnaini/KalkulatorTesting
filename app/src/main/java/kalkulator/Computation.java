package kalkulator;

public class Computation {
    public static double compute(double operand1, double operand2, char operator) {
        try {

            switch (operator) {
                case '+':
                    return Calculator.add(operand1, operand2);
                case '-':
                    return Calculator.subtract(operand1, operand2);
                case '*':
                    return Calculator.multiply(operand1, operand2);
                case '/':
                    return Calculator.divide(operand1, operand2);
                default:
                    throw new IllegalArgumentException("Operator tidak valid: " + operator);
            }
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Integer.MIN_VALUE; // Return a special value to indicate an error
        }
    }
}
