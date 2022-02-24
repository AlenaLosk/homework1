import static java.lang.Math.*;

public class Function {
    //version 4 - with array
    public static int fib4(int number) {
        if (number <= 1) {
            return number;
        } else {
            int[] array = {0, 1, 0};
            for (int i = 2; i <= number; i++) {
                for(int j = 2; j < 3; j++) {
                    array[j] = array[j - 1] + array[j - 2];
                    array[j - 2] = array[j - 1];
                    array[j - 1] = array[j];
                }
            }
            return array[2];
        }
    }

    //version 5 - using the Binet formula
    public static int fib5(int number) {
        return (int) round(pow((1 + sqrt(5))/2, number)/sqrt(5));
    }
}
