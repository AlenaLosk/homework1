public class Main {

    //version 1 - recursion
    public static int fib1(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fib1(number - 1) + fib1(number - 2);
        }
    }

    //version 2 - cycle without memory optimization
    public static int fib2(int number) {
        int result = 0;
        if (number <= 1) {
             result = number;
        } else {
            int a = 0;
            int b = 1;
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
    public static int fib3(int number) {
        if (number <= 1) {
            return number;
        } else {
            int a = 0;
            int b = 1;
            for (int i = 2; i < number; i++) {
                b += a;
                a = b - a;
            }
            return a + b ;
        }
    }
}
