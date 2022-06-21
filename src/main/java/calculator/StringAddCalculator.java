package calculator;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringAddCalculator {

    private static final String BASE_DIVIDER_COMMA = ",";
    private static final String BASE_DIVIDER_COLON = ":";

    public static int splitAndSum(String input) {
        return 0;
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

    public static String[] splitByDivider(String input, String divider) {
        return input.split(divider);
    }
}
