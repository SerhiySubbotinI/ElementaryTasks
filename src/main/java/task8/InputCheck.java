package task8;

import java.util.Scanner;

public class InputCheck {

      public long checkInputNumber () {
        Scanner keyboard = new Scanner(System.in);
        long checkNumber;
        do {
            while (!keyboard.hasNextLong()) {
                System.out.print("That is not a number. Please enter the number: ");
                keyboard.next();
            }
            checkNumber = keyboard.nextLong();
            if (checkNumber < 0) System.out.print("The entered number can't be negative: ");
        } while (checkNumber < 0);
        return checkNumber;
    }
}