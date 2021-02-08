import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void addTest() {
        assertEquals(10, calculator.add(8, 2));
    }

    @Test
    public void subtractTest(){
        assertEquals(14, calculator.subtract(20, 6));
    }

    @Test
    public void multiplyTest(){
        assertEquals(64, calculator.multiply(8, 8));
    }

    @Test
    public void divideTest(){
        assertEquals(3.5, calculator.divide(7, 2), 0.0);
    }
}
