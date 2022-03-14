import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(4, calculator.addNum(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subNum(9, 6));
    }

    @Test
    public void canMult(){
        assertEquals(25, calculator.multNum(5, 5));
    }

    @Test
    public void canDiv(){
        assertEquals(8, calculator.divNum(64, 8));
    }
}
