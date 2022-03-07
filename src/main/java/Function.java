import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Function {
    //version 4 - with ArrayList
    private static List<BigInteger> list = new ArrayList<>();

    static {
        list.add(new BigInteger("0"));
        list.add(new BigInteger("1"));
    }

    public static BigInteger fib4(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Fibonacci calculation is only supported for positive numbers");
        } else if (number >= list.size()) {
            for (int i = list.size(); i <= number; i++) {
                list.add(list.get(i - 1).add(list.get(i - 2)));
            }
        }
        return list.get(number);
    }
}
