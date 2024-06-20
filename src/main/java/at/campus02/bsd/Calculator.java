package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This is a class, which has a few methods to do calculations with two numbers.
 */
public class Calculator {
    /**
     * This is a logger Object
     */
    private static Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * This method calculates the sum of two numbers and returns the result
     * as a double.
     *
     * @param number1   the first number
     * @param number2   the second number
     * @return          returns the addition of both numbers
     */
    public double add(double number1, double number2) {
        logger.debug("Adding {} and {}", number1, number2);
        return number1 + number2;
    }

    /**
     * This method calculates the subtraction of two numbers and returns the result
     * as a double.
     *
     * @param number1   the first number
     * @param number2   the second number
     * @return          returns the subtraction of both numbers
     */
    public double minus(double number1, double number2) {
        logger.debug("Subtracting {} from {}", number2, number1);
        return number1 - number2;
    }

    /**
     * This method calculates the division of number1 by number2 and returns the result as a double.
     * If number2 is zero, it logs an error and throws an ArithmeticException.
     *
     * @param number1                   the dividend
     * @param number2                   the divisor
     * @return                          the result of dividing number1 by number2
     * @throws ArithmeticException      if number2 is zero
     */
    public double divide(double number1, double number2) {
        logger.debug("Dividing {} by {}", number1, number2);
        if (number2 == 0) {
            logger.error("Number 2 cannot be zero");
            throw new ArithmeticException();
        } else {
            return number1 / number2;
        }
    }

    /**
     * This method calculates the product of two numbers and returns the result as a double.
     *
     * @param number1   the first number
     * @param number2   the second number
     * @return          the product of number1 and number2
     */
    public double multiply(double number1, double number2) {
        logger.debug("Multiplying {} with {}", number1, number2);
        return number1 * number2;
    }

    /**
     * This method calculates the factorial of a given non-negative integer.
     *      If the number is negative, it returns 0.
     *      If the number is 0 or 1, it returns 1.
     *      For any other number, it returns the factorial value.
     *
     * @param number    the number to calculate the factorial of
     * @return          the factorial of the given number, or 0 if the number is negativ
     */
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

