package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    private static Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double number1, double number2) {
        logger.debug("Adding {} and {}", number1, number2);
        return number1 + number2;
    }

    public double minus(double number1, double number2) {
        logger.debug("Subtracting {} from {}", number2, number1);
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        logger.debug("Dividing {} by {}", number1, number2);
        if (number2 == 0) {
            logger.error("Number 2 cannot be zero");
            throw new ArithmeticException();
        } else {
            return number1 / number2;
        }
    }

    public double multiply(double number1, double number2) {
        logger.debug("Multiplying {} with {}", number1, number2);
        return number1 * number2;
    }

    public double factorial(int number) {
        if (number < 0) {
            return 0; // Always return 0 for negative numbers
        } else if (number == 0 || number == 1) {
            return 1; // Factorial of 0 and 1 is always 1
        } else {
            int result = 1;
            for (int i = 2; i <= number; i++) {
                result *= i;
            }
            return result;
        }
    }
}

