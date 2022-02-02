package task8;

public class OutData {

    Solution execution = new Solution();

    public void output(long initialNumber, long lastNumber) {
        long i = 0;
        while (execution.fibonacci1(i) <= lastNumber) {
            if (execution.fibonacci1(i) >= initialNumber && execution.fibonacci1(i) <= lastNumber)
                System.out.print(execution.fibonacci1(i) + ", ");
            i++;
        }
        System.out.println("\b\b");
    }

    public void recursionOutput(long fromNumber, long untilNumber) {
        for (int j = 0; execution.fibonacci2(j) <= untilNumber; j++) {
            if (execution.fibonacci2(j) >= fromNumber && execution.fibonacci2(j) <= untilNumber)
                System.out.print(execution.fibonacci2(j) + ", ");
        }
        System.out.println("\b\b");
    }

    public void outputArray(long fromNumber, long [] result ) {
        for (int j = 0; result[j] <= result.length; j++) {
            if (result[j] >= fromNumber && result[j] <= result.length)
                System.out.print(result[j] + ", ");
        }
        System.out.println("\b\b");
    }
}