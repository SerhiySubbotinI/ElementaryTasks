package task8;

public class Solution {

    public long fibonacci1(long n) {
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

    public long fibonacci2(long until) {
        if (until <= 1) {
            return until;
        }
        return fibonacci2(until - 2) + fibonacci2(until - 1);
    }

    public long [] fibonacci3(long until) {
        long[] result = new long[(int) until];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < until; ++i) {
            result[i] = result[i - 1] + result[i - 2];
        }
        return result;
    }
}