package task4;

import java.util.Scanner;

public class InputData {
    public String InputString(String informationForInput){
        Scanner keyboard = new Scanner(System.in);
        System.out.print(informationForInput);
        return keyboard.nextLine();
    }
}
