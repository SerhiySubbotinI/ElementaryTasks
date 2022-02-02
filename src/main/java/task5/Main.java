package task5;

public class Main {
    public static void main(String[] args) {
        InputCheck input = new InputCheck();
        System.out.println(EnglishNumbersToWords.convert(input.checkInputNumber()));
//        for(int i=2100000001;i<2100000002;i++){
//            System.out.println(EnglishNumbersToWords.convert(i));
//        }
    }
}
