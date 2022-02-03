package task4;

import java.io.IOException;
import java.util.Scanner;                                   //Import the Scanner class

public class InputData {
    public String InputString(String informationForInput) {
        Scanner keyboard = new Scanner(System.in);          //Create a Scanner object
        System.out.print(informationForInput);              // Output user input
        return keyboard.nextLine();                          // Read user String input
    }

    public void selectMode() throws IOException {
        InputData inputData = new InputData();
        FileUtils filePath = new FileUtils();
        Utils myConstants = new Utils();
        TextUtils txt = new TextUtils();

        do {
            int mode = Integer.parseInt(inputData.InputString("1. Count the number of occurrences of " +
                    "a string in a text file.\n2. Replace a string with another one in a text file\n3. Exit from " +
                    "program\nPlease, make your selection: "));
            if (mode == 3) System.exit(0);

            String pathToFile = inputData.InputString(myConstants.INPUT_PATH_TO_FILE.concat(": "));
            String textFromFile = filePath.readFromFile(pathToFile);
            switch (mode) {
                case 1: {
                    String stringForCount = inputData.InputString(myConstants.INPUT_STRING.concat(": "));
                    System.out.println("The string: " + stringForCount + " in " + pathToFile + " was found: "
                            + txt.countInputString(txt.onlyLettersAndNumbers(textFromFile), stringForCount) + "\n");
                    break;
                }
                case 2: {
                    String stringForSearch = inputData.InputString(myConstants.INPUT_STRING.concat(" for search: "));
                    String stringForReplacement = inputData.InputString(myConstants.INPUT_STRING.concat(" for replacement: "));
                    String replacementString = txt.replacementInputString(textFromFile, stringForSearch, stringForReplacement);
                    filePath.writeFile(pathToFile, replacementString);
                    break;
                }
            }
        } while (true);
    }
}
