package task8;

public class Main {
    public static void main(String[] args) {
        InputCheck input = new InputCheck();
        Solution execution = new Solution();
        OutData outResult = new OutData();
        System.out.println("Enter a range of Fibonacci numbers: ");
        long fromNumber = input.checkInputNumber();
        long untilNumber = input.checkInputNumber();

        outResult.output(fromNumber, untilNumber);
        outResult.outputArray(fromNumber, execution.fibonacci3(untilNumber));
        outResult.recursionOutput(fromNumber, untilNumber);


    }
}
