package calculator;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringAddCalculator {

    private static final String BASE_DIVIDER_COMMA = ",";
    private static final String BASE_DIVIDER_COLON = ":";

    public static int splitAndSum(String input) {
        int result = 0;
        if (input == null || input.equals("")) {
            return result;
        }
        result = add(splitByDivider(input));
        return result;
    }

    public static String[] splitByDivider(String input) {
        String[] result = new String[] {};
        String[] splitByComma = splitByDivider(input, BASE_DIVIDER_COMMA);
        for (String element : splitByComma) {
            result = Stream
                .concat(Arrays.stream(result), Arrays.stream(splitByDivider(element, BASE_DIVIDER_COLON)))
                .toArray(String[]::new);
        }
        return result;
    }

    private static String[] splitByDivider(String input, String divider) {
        return input.split(divider);
    }

    private static int add(String[] processedInput) throws NumberFormatException {
        int result = 0;
        for (String string : processedInput) {
            result += stringToInt(string);
        }
        return result;
    }

    private static int stringToInt(String string) throws NumberFormatException {
        int result = Integer.parseInt(string);
        if (result < 0) {
            throw new IllegalArgumentException();
        }
        return result;
    }
}
