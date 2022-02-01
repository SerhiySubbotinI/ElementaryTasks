package task2;

import java.util.Locale;
import java.util.Scanner;

public class EnvelopeAnalysis {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String checkContinuation;
        double firstEnvelopeSideA;
        double firstEnvelopeSideB;
        double secondEnvelopeSideC;
        double secondEnvelopeSideD;
        do {
            firstEnvelopeSideA = checkDoubleInputNumber("side a of the first envelope: ");
            firstEnvelopeSideB = checkDoubleInputNumber("side b of the first envelope: ");
            System.out.println("First envelope (" + firstEnvelopeSideA + "," + firstEnvelopeSideB + ")");

            secondEnvelopeSideC = checkDoubleInputNumber("side c of the second envelope: ");
            secondEnvelopeSideD = checkDoubleInputNumber("side d of the second envelope: ");
            System.out.println("Second envelope (" + secondEnvelopeSideC + "," + secondEnvelopeSideD + ")");

            if (firstEnvelopeSideA < secondEnvelopeSideC && firstEnvelopeSideB < secondEnvelopeSideD
                    || firstEnvelopeSideA < secondEnvelopeSideD && firstEnvelopeSideB < secondEnvelopeSideC)
                System.out.println("It is possible to put the first envelope (" + firstEnvelopeSideA + ","
                        + firstEnvelopeSideB + ") into the second (" + secondEnvelopeSideC + "," + secondEnvelopeSideD + ")");
            else if (firstEnvelopeSideA > secondEnvelopeSideC && firstEnvelopeSideB > secondEnvelopeSideD
                    || firstEnvelopeSideA > secondEnvelopeSideD && firstEnvelopeSideB > secondEnvelopeSideC)
                System.out.println("It is possible to put the second envelope (" + secondEnvelopeSideC + ","
                        + secondEnvelopeSideD + ") into the first (" + firstEnvelopeSideA + "," + firstEnvelopeSideB + ")");
            else
                System.out.println("It is not possible to put one envelope to another");

            System.out.print("Do you want to continue YES(y) / NO(n) : ");
            checkContinuation = keyboard.next().toLowerCase();
        } while (checkContinuation.contentEquals("y") || checkContinuation.contentEquals("yes"));
    }

    public static double checkDoubleInputNumber(String task) {
        //method for correct input
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);
        double checkNumber;
        do {
            System.out.print("Please, enter the ".concat(task));
            while (!keyboard.hasNextDouble()) { //check input
                System.out.print("That is not a number. Please, enter the ".concat(task) + ": ");
                keyboard.next();
            }
            checkNumber = keyboard.nextDouble();
            if (checkNumber <= 0) System.out.print("The entered double number must be greater than zero, ");
        } while (checkNumber <= 0);
        return checkNumber;
    }
}
