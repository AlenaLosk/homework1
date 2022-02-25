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
public class MainTest2 {

    private int number;
    private BigDecimal expectedResult;

    public MainTest2(int number, BigDecimal expectedResult) {
        this.number = number;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection collection() {
        return Arrays.asList(new Object[][] {
                {0, new BigDecimal("0")},
                {1, new BigDecimal("1")},
                {2, new BigDecimal("1")},
                {3, new BigDecimal("2")},
                {4, new BigDecimal("3")},
                {6, new BigDecimal("8")},
                {7, new BigDecimal("13")},
                {8, new BigDecimal("21")},
                {9, new BigDecimal("34")},
                {10, new BigDecimal("55")},
                {20, new BigDecimal("6765")},
                {50, new BigDecimal("12586269025")},
                {80, new BigDecimal("23416728348467684")},
                {100, new BigDecimal("354224848179262000000")}
        });
    }

    @Test
    public void testFib4() {
        assertEquals(expectedResult,
                Function.fib4(number));
    }

//    @Test
//    public void testFib5() {
//        assertEquals(expectedResult,
//                Function.fib5(number));
//    }
}