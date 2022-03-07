import static java.lang.Math.*;

public class Main {

    //version 1 - recursion
    public static long fib1(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Fibonacci calculation is only supported for positive numbers");
        } else if (number == 1 || number == 0) {
            return number;
        } else {
            return fib1(number - 1) + fib1(number - 2);
        }
    }

    //version 2 - cycle without memory optimization
    public static long fib2(long number) {
        long result = 0;
        if (number < 0) {
            throw new IllegalArgumentException("Fibonacci calculation is only supported for positive numbers");
        } else if (number == 1 || number == 0) {
            result = number;
        } else {
            long a = 0;
            long b = 1;
            for (int i = 2; i <= number; i++) {
                result = a + b;
                if (i == number) {
                    break;
                } else {
                    a = b;
                    b = result;
                }
            }
        }
        return result;
    }

    //version 3 - cycle with memory optimization
    public static long fib3(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("Fibonacci calculation is only supported for positive numbers");
        } else if (number == 1 || number == 0) {
            return number;
        } else {
            long a = 0;
            long b = 1;
            for (int i = 2; i < number; i++) {
                b += a;
                a = b - a;
            }
            return a + b;
        }
    }

    //version 5 - using the Binet formula (at large values accuracy may be lost)
    public static long fib5(long number) {
        return round(pow((1 + sqrt(5)) / 2, number) / sqrt(5));
    }

}
