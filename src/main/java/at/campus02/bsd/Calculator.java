package at.campus02.bsd;

public class Calculator {
    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        } else {
            return number1 / number2;
        }
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }
}

