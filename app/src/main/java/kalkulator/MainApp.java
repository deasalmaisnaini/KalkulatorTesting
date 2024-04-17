package kalkulator;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.######");

        try {
            System.out.print("[ -------------------- Program Kalkulator -------------------- ]\n");
            
            System.out.print("Masukkan operand pertama: ");
            String operand1Input = scanner.nextLine().trim();
            Validator.validateInput(operand1Input, "Operand pertama");
            double operand1 = Double.parseDouble(operand1Input);
            Validator.validateOperand(operand1);

            System.out.print("Masukkan operand kedua: ");
            String operand2Input = scanner.nextLine().trim();
            Validator.validateInput(operand2Input, "Operand kedua");
            double operand2 = Double.parseDouble(operand2Input);
            Validator.validateOperand(operand2);

            System.out.print("Masukkan operator (+, -, *, /): ");
            String operatorInput = scanner.nextLine().trim();
            Validator.validateInput(operatorInput, "Operator");
            char operator = operatorInput.charAt(0);
            Validator.validateOperator(operator);

            double result = Computation.compute(operand1, operand2, operator);
            System.out.println("Hasil: " + df.format(result));
       
        } catch (NumberFormatException e) {
            System.out.println("Error: Operand harus berupa angka");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

