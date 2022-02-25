import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MainTest {

    private long number;
    private long expectedResult;
    private Main main;

    @Before
    public void initialize() {
        main = new Main();
    }

    public MainTest(long number, long expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection collection() {
        return Arrays.asList(new Object[][] {
                {0L, 0L},
                {1L, 1L},
                {2L, 1L},
                {3L, 2L},
                {4L, 3L},
                {6L, 8L},
                {7L, 13L},
                {8L, 21L},
                {9L, 34L},
                {10L, 55L},
                {80L, 23416728348467685L}
        });
    }

    @Test
    public void testFib2() {
        assertEquals(expectedResult,
                main.fib2(number));
    }

    @Test
    public void testFib3() {
        assertEquals(expectedResult,
                main.fib3(number));
    }

    @Test
    public void testFib5() {
        assertEquals(expectedResult,
                main.fib3(number));
    }
}