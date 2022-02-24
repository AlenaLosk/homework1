import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MainTest {

    private int number;
    private int expectedResult;
    private Main main;

    @Before
    public void initialize() {
        main = new Main();
    }

    public MainTest(int number, int expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection collection() {
        return Arrays.asList(new Object[][] {
                {0, 0},
                {1, 1},
                {2, 1},
                {3, 2},
                {4, 3},
                {6, 8},
                {7, 13},
                {8, 21},
                {9, 34},
                {10, 55}
        });
    }

    @Test
    public void testFib1() {
        assertEquals(expectedResult,
                main.fib1(number));
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
}