import java.util.Scanner;

public class NumericSequence {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("The program should display a series of natural numbers separated by commas, \n" +
                "the square of which is less than the entered number. Please enter a number: ");
        int numberN;
        numberN = keyboard.nextInt();

        for(int i = 1; i * i < numberN; i++){
            System.out.print(i * i + ", ");
        }
        System.out.println("\b\b");


        for(int j = 1; j * j < numberN; j++) {
            if ((j * j) % 4 == 0 || (j * j) % 8 == 1 || (j * j) % 9 == 3 || (j * j) % 3 == 1)
                System.out.print(j * j + ", ");
        }
        System.out.println("\b\b");
    }
}
