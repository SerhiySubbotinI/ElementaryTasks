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
                    "program\nPlease, make your selection: "));             //user selects mode
            if (mode == 3) System.exit(0);                      //Exit from program

            String pathToFile = inputData.InputString(myConstants.INPUT_PATH_TO_FILE.concat(": "));  //user selects path to file
            String textFromFile = filePath.readFromFile(pathToFile);                    // receives full text
            switch (mode) {
                case 1: {
                    String stringForCount = inputData.InputString(myConstants.INPUT_STRING.concat(": "));//user enters word(phrase) for count
                    System.out.println("The string: " + stringForCount + " in " + pathToFile + " was found: "
                            + txt.countInputString(txt.onlyLettersAndNumbers(textFromFile), stringForCount) + "\n");
                    break;
                }
                case 2: {
                    String stringForSearch = inputData.InputString(myConstants.INPUT_STRING.concat(" for search: ")); //enters search word(phrase)
                    String stringForReplacement = inputData.InputString(myConstants.INPUT_STRING.concat(" for replacement: "));//word(phrase) for replacement
                    String replacementString = txt.replacementInputString(textFromFile, stringForSearch, stringForReplacement); //replaces all in string
                    filePath.writeFile(pathToFile, replacementString); // writes to file
                    break;
                }
            }
        } while (true);  // (false) Exit from program
    }
}
