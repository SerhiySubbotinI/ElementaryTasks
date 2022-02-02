package task7;

import java.util.Scanner;

public class InputCheck {

    public int checkInputNumber() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("The program should display a series of natural numbers separated by commas, \n" +
                "the square of which is less than the entered number. Please enter a number: ");
        int checkNumber;
        do {
            while (!keyboard.hasNextInt()) {
                System.out.print("That is not a number. Please enter the number: ");
                keyboard.next();
            }
            checkNumber = keyboard.nextInt();
            if (checkNumber < 0) System.out.print("The entered number can't be negative: ");
        } while (checkNumber < 0);
        return checkNumber;
    }
}