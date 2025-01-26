import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestCalculator {

    @Test
    public void TestSimpleExpression() {
        String result = Calculator.Run("5+3+2");

        assertEquals("10", result);
    }

    @Test
    public void TestSimpleExpressionFloat() {
        String result = Calculator.Run("5+3+2");

        assertEquals("10.0", result);
    }

    @Test
    public void TestOrder() {
        String result = Calculator.Run("3*2+5*4");

        assertEquals("26.0", result);
    }

    @Test
    public void TestRepeating() {
        String result = Calculator.Run("500/2/2");

        assertEquals("125.0", result);
    }
}
