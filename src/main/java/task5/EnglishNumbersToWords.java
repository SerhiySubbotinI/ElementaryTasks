package task5;

import java.text.DecimalFormat;

public class EnglishNumbersToWords {

    private static String convertLessThanOneThousand(int number) {
        String tooMuch;
        if (number % 100 < 20) {
            tooMuch = Utils.numberNames[number % 100];
            number /= 100;
        } else {
            tooMuch = Utils.numberNames[number % 10];
            number /= 10;

            tooMuch = Utils.tensNumberNames[number % 10] + tooMuch;
            number /= 10;
        }
        if (number == 0) return tooMuch;
        return Utils.numberNames[number] + " hundred" + tooMuch;
    }

    public static String convert(long number) {
        if (number == 0) return "zero";

        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        String snumber = df.format(number);


        int billions = Integer.parseInt(snumber.substring(0, 3));
        int millions = Integer.parseInt(snumber.substring(3, 6));
        int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
        int thousands = Integer.parseInt(snumber.substring(9, 12));

        String tradBillions;
        switch (billions) {
            case 0:
                tradBillions = "";
                break;
            case 1:
            default:
                tradBillions = convertLessThanOneThousand(billions)
                        + " billion ";
        }
        String result = tradBillions;

        String tradMillions;
        switch (millions) {
            case 0:
                tradMillions = "";
                break;
            case 1:
            default:
                tradMillions = convertLessThanOneThousand(millions)
                        + " million ";
        }
        result = result + tradMillions;

        String tradHundredThousands;
        switch (hundredThousands) {
            case 0:
                tradHundredThousands = "";
                break;
            case 1:
                tradHundredThousands = "one thousand ";
                break;
            default:
                tradHundredThousands = convertLessThanOneThousand(hundredThousands)
                        + " thousand ";
        }
        result = result + tradHundredThousands;

        String tradThousand;
        tradThousand = convertLessThanOneThousand(thousands);
        result = result + tradThousand;

        return result;
    }
}

