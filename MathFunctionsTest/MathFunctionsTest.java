import com.company.MathFunctions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathFunctionsTest {
    @Test
    public void testFirstFunctionWithXZero() {
    double resultToTest= MathFunctions.f(0);
    assertEquals(0,resultToTest);
    }
    @Test
    public void testSecondFunctionWithXZero() {
        double resultToTest= MathFunctions.z(0);
        assertEquals(16,resultToTest);
    }
    @Test
    public void testThirdFunctionWithXZero() {
        double resultToTest= MathFunctions.d(0);
        assertEquals(0,resultToTest);
    }
}
