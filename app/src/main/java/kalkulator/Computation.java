package kalkulator;

public class Computation {
    public static double compute(double operand1, double operand2, char operator){
    	
    	double hasil = 0;

        if (operator == '+') {
            hasil =  Calculator.add(operand1, operand2);
        } else if (operator == '-') {
            hasil =   Calculator.subtract(operand1, operand2);
        } else if (operator == '*') {
            hasil = Calculator.multiply(operand1, operand2);
        } else if (operator == '/') {
            hasil =  Calculator.divide(operand1, operand2);
        } 
        return hasil;
    }
}
