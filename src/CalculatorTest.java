import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {

    Calculator calc;
    @Before
    public void setUp() {
        calc = new Calculator();
    }


    @Test
    public void add() {

        int num1 = 5;
        int num2 = 10;
        int sum = calc.add(num1, num2);

        assertEquals(15, sum, 0.0);
    }

    @Test
    public void subtract() {
        int num1 = 5;
        int num2 = 10;

        int dif = calc.subtract(num1, num2);

        assertEquals(-5, dif, 0.0);
    }

    @Test
    public void multiply() {
        int num1 = 20;
        int num2 = 2;

        int product = calc.multiply(num1, num2);
        assertEquals(40, product, 0.0);
    }

    @Test
    public void divide() {
        double num1 = 5;
        double num2 = 2;

        double result = calc.divide(num1, num2);
        assertEquals(2.5, result, 0.0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void divideException() {
        calc.divide(2, 0);
    }
}