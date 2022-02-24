import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class MainTest2 {

    private int number;
    private BigInteger expectedResult;

    public MainTest2(int number, BigInteger expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection collection() {
        return Arrays.asList(new Object[][] {
                {0, new BigInteger("0")},
                {1, new BigInteger("1")},
                {2, new BigInteger("1")},
                {3, new BigInteger("2")},
                {4, new BigInteger("3")},
                {6, new BigInteger("8")},
                {7, new BigInteger("13")},
                {8, new BigInteger("21")},
                {9, new BigInteger("34")},
                {10, new BigInteger("55")}
        });
    }

    @Test
    public void testFib4() {
        assertEquals(expectedResult,
                Function.fib4(number));
    }

    @Test
    public void testFib5() {
        assertEquals(expectedResult,
                Function.fib5(number));
    }
}