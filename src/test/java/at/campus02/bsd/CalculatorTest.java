package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calc;
    @BeforeEach
    void setup() {
        calc = new Calculator();
    }

    // Tests for Addition
    @Test
    void testAdd1() {
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    void testAdd2() {
        assertEquals(-41, calc.add(-36, -5));
    }
    @Test
    void testAdd3() {
        assertEquals(55, calc.add(-3,58));
    }

    // Tests for Subtraction
    @Test
    void testMinus1() {
        assertEquals(1, calc.minus(6, 5));
    }
    @Test
    void testMinus2() {
        assertEquals(-22, calc.minus(60, 82));
    }
    @Test
    void testMinus3() {
        assertEquals(76, calc.minus(-10, -86));
    }

    // Tests for Multiplication
    @Test
    void testMulti1() {
        assertEquals(9, calc.multiply(3, 3));
    }
    @Test
    void testMulti2() {
        assertEquals(0, calc.multiply(5, 0));
    }
    @Test
    void testMulti3() {
        assertEquals(-48, calc.multiply(6, -8));
    }
    @Test
    void testMulti4() {
        assertEquals(4, calc.multiply(-2, -2));
    }

    // Tests for Division
    @Test
    void testDiv1() {
        assertEquals(2, calc.divide(4, 2));
    }
    @Test
    void testDiv2() {
        assertEquals(8, calc.divide(-72, -9));
    }
    @Test
    void testDiv3() {
        assertEquals(-1, calc.divide(6, -6));
    }
    @Test
    void testDiv4() {
        assertThrows(ArithmeticException.class, () -> calc.divide(8, 0));
    }

}
