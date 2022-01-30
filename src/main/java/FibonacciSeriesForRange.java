import java.util.Scanner;

public class FibonacciSeriesForRange {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a range of Fibonacci numbers: ");
        long initialNumber;
        long lastNumber;
        initialNumber = keyboard.nextLong();
        lastNumber = keyboard.nextLong();

        //use array with for
        long[] result = new long[100000000];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < lastNumber; ++i) {
            result[i] = result[i - 1] + result[i - 2];
        }
        for (int j = 0; result[j] <= lastNumber; j++) {
            if (result[j] >= initialNumber && result[j] <= lastNumber)
                System.out.print(result[j] + ", ");
        }
        System.out.println("\b\b");

        //use metod fibonacci1 while while
        long i = 0;
        while (fibonacci1(i) <= lastNumber) {
            if (fibonacci1(i) >= initialNumber && fibonacci1(i) <= lastNumber)
                System.out.print(fibonacci1(i) + ", ");
            i++;
        }
        System.out.println("\b\b");

        //use recursion with for
        for (int j = 0; fibonacci2(j) <= lastNumber; j++) {
            if (fibonacci2(j) >= initialNumber && fibonacci2(j) <= lastNumber)
                System.out.print(fibonacci2(j) + ", ");
        }
        System.out.println("\b\b");
    }

    private static long fibonacci1(long n) {
        long a = 0;
        long b = 1;
        long result = n;
        for (long i = 1; i < n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    private static long fibonacci2(long n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci2(n - 2) + fibonacci2(n - 1);
    }

}
