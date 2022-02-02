package task4;

import java.io.IOException;

public class FileParser {
    public static void main(String[] args) throws IOException {
        InputData inputData = new InputData();
        FileUtils filePath = new FileUtils();
        Utils myConstants = new Utils();
        TextUtils txt = new TextUtils();
        System.out.println("C:\\Users\\Admin\\IdeaProjects\\ElementaryTasks\\src\\main\\java\\task4\\Text.txt");
        do {
            int mode = Integer.parseInt(inputData.InputString("1. Count the number of occurrences of " +
                    "a string in a text file.\n2. Replace a string with another one in a text file\n3. Exit from " +
                    "program\nPlease, make your selection: "));
            if(mode==3) System.exit(0);

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
                    filePath.writeFile(pathToFile,replacementString);
                    break;
                }
                case 3:
                    System.exit(0);
            }
        } while (true);
    }
}
