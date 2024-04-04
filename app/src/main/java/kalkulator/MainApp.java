package kalkulator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        try {
            System.out.print("Masukkan operand pertama: ");
            double operand1 = scanner.nextDouble();
            Validator.validateOperand(operand1);

            System.out.print("Masukkan operand kedua: ");
            double operand2 = scanner.nextDouble();
            Validator.validateOperand(operand2);

            System.out.print("Masukkan operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            Validator.validateOperator(operator);


            double result = Computation.compute(operand1, operand2, operator);
            System.out.println("Hasil: " + df.format(result));
        } catch (Exception e) {
        	if (e.getMessage() == null) {
        		System.out.println("Operand harus berupa angka");
        	}else{
        		System.out.println("Error: " + e.getMessage());
        	}
        } finally {
            scanner.close();
        }
    }
}
