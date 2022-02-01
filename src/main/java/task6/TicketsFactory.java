package task6;

import java.util.Scanner;

public class TicketsFactory {
    public boolean readMeCheck(String txt) {
        return !txt.isEmpty();
    }

    public int ticketQty(String txt) {
        int ticketCounter = 0;
        Scanner s = new Scanner(txt.replaceAll("[^0-9]", " "));
        while (s.hasNextInt()) {
            int number = s.nextInt();
            System.out.print(number + " ");
            ticketCounter++;
            if (ticketCounter % 15 == 0)
                System.out.println();
        }
        System.out.println("\nTotal tickets quantity: " + ticketCounter);
        return ticketCounter;
    }

    public int[] uncheckedTicket(String txt, int ticketCounter) {
        Scanner s = new Scanner(txt.replaceAll("[^0-9]", " "));
        int[] tickets = new int[ticketCounter];
        int index = 0;
        while (s.hasNextInt()) {
            tickets[index] = s.nextInt();
            index++;
        }
        return tickets;
    }
}
