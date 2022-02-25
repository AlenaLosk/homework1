import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

import static java.lang.Math.*;

public class Function {
    //version 4 - with array
    public static BigDecimal fib4(int number) {
        if (number <= 1) {
            return new BigDecimal(String.valueOf(number));
        } else {
            BigDecimal[] array = {new BigDecimal("0"), new BigDecimal("1")};
            for (int i = 2; i < number; i++) {
                array[1] = array[1].add(array[0]);
                array[0] = array[1].subtract(array[0]);
            }
            return array[0].add(array[1]);
        }
    }

    //version 5 - using the Binet formula (на больших величинах теряется точность)
    public static BigDecimal fib5(int number) {
        return new BigDecimal(String.valueOf(round(pow((1 + sqrt(5))/2, number)/sqrt(5))));
    }
}
