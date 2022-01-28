import java.util.Scanner;

public class ChessBoard {
    public static void main(String[] args) {
        int height;
        int width;
        height = checkIntegerInputNumber("height");
        width = checkIntegerInputNumber("width");
        for (int i = 1; i <= height; i++) {
            if (i % 2 == 0) System.out.print(" ");
            for (int j = 1; j <= width; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static int checkIntegerInputNumber(String task) {
        //method for correct input
        Scanner keyboard = new Scanner(System.in);
        int checkNumber;
        do {
            System.out.print("Please enter the ".concat(task) + " of the chessboard: ");
            while (!keyboard.hasNextInt()) {//check input
                System.out.print("That is not a number. Please enter the ".concat(task) + ": ");
                keyboard.next();
            }
            checkNumber = keyboard.nextInt();
            if (checkNumber <= 0) System.out.print("The entered number must be greater than zero, ");
        } while (checkNumber <= 0);
        return checkNumber;
    }
}
