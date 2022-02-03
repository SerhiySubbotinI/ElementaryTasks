package task4;

public class TextUtils {
    public String onlyLettersAndNumbers(String fullText) {
        return fullText.replaceAll("[^\\da-zA-Zа 0-9]", ""); //only letters and numbers
    }

    public int countInputString(String sentence, String inputString) {
        if (sentence.isEmpty() || inputString.isEmpty()) {     //input check
            return 0;
        }
        int countPhrase = 0;
        int index = 0;
        while ((index = sentence.toLowerCase().indexOf(inputString.toLowerCase(), index)) != -1) {
            countPhrase++;
            index += inputString.length();
        }
        return countPhrase;
    }

    public String replacementInputString(String sentence, String inputSearchString, String inputReplacementString) {
        return sentence.replace(inputSearchString, inputReplacementString);
    }

}

