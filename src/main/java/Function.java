import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import static java.lang.Math.*;

public class Function {
    //version 4 - with array
    public static BigInteger fib4(int number) {
        if (number <= 1) {
            return new BigInteger(String.valueOf(number));
        } else {
            BigInteger[] array = {new BigInteger("0"), new BigInteger("1")};
            for (int i = 2; i < number; i++) {
                array[1] = array[1].add(array[0]);
                array[0] = array[1].subtract(array[0]);
            }
            return array[0].add(array[1]);
        }
    }
}
