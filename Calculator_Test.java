import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Calculator_Test {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-2, 1));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-3, calculator.subtract(-2, 1));
        assertEquals(0, calculator.subtract(0, 0));
        assertEquals(1, calculator.subtract(-2, -3));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-2, calculator.multiply(-2, 1));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(6, calculator.multiply(-2, -3));
    }

    @Test
    public void testAddOverflow() {
        Calculator calculator = new Calculator();
        // Overflow: Integer.MAX_VALUE + 1 should wrap around to Integer.MIN_VALUE
        assertEquals(Integer.MIN_VALUE, calculator.add(Integer.MAX_VALUE, 1));

        // Underflow: Integer.MIN_VALUE - 1 should wrap around to Integer.MAX_VALUE
        assertEquals(Integer.MAX_VALUE, calculator.add(Integer.MIN_VALUE, -1));
    }

    @Test
    public void testSubtractOverflow() {
        Calculator calculator = new Calculator();
        // Overflow: Integer.MIN_VALUE - 1 should wrap around to Integer.MAX_VALUE
        assertEquals(Integer.MAX_VALUE, calculator.subtract(Integer.MIN_VALUE, 1));

        // Underflow: Integer.MAX_VALUE - (-1) should wrap around to Integer.MIN_VALUE
        assertEquals(Integer.MIN_VALUE, calculator.subtract(Integer.MAX_VALUE, -1));
    }

    @Test
    public void testMultiplyOverflow() {
        Calculator calculator = new Calculator();
        // Overflow: Multiplying large numbers that exceed Integer.MAX_VALUE
        assertEquals(-2, calculator.multiply(Integer.MAX_VALUE, 2));

        // Underflow: Multiplying large negative numbers that exceed Integer.MIN_VALUE
        assertEquals(0, calculator.multiply(Integer.MIN_VALUE, 0));

        // Check for multiplication overflow
        assertEquals(0, calculator.multiply(Integer.MIN_VALUE, 2));
    }
}