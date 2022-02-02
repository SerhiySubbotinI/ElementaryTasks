package task4;

public class TextUtils {
    public String onlyLettersAndNumbers(String fullText) {
        return fullText.replaceAll("[^\\da-zA-Zа 0-9]", "");
    }

    public int countInputString(String sentence, String inputString) {
        if (sentence.isEmpty() || inputString.isEmpty()) {//input check
            return 0;
        }
        int count = 0;
        int index = 0;
        while ((index = sentence.toLowerCase().indexOf(inputString.toLowerCase(), index)) != -1) {
            count++;
            index += inputString.length();
        }
        return count;
    }
    public String replacementInputString(String sentence, String inputSearchString, String inputReplacementString){
        return sentence.replace(inputSearchString,inputReplacementString);
    }

}

