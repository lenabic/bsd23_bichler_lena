package at.campus02.bsd;

import at.campus02.bsd.Calculator;


public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        Calculator calculator = new Calculator();


        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[1]);

        // calculates the results
        double resultAddition = calculator.add(number1, number2);
        System.out.println("Addition: " + resultAddition);

        double resultSubtraction = calculator.minus(number1, number2);
        System.out.println("Subtraction: " + resultSubtraction);

        double resultDivision = calculator.divide(number1, number2);
        System.out.println("Division: " + resultDivision);

        double resultMultiplication = calculator.multiply(number1, number2);
        System.out.println("Multiplication: " + resultMultiplication);

        System.out.println("Lena Bichler");
    }
}
