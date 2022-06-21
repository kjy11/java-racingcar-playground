package calculator;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StringAddCalculator {

    private static final String BASE_DIVIDER_COMMA = ",";
    private static final String BASE_DIVIDER_COLON = ":";

    public static int splitAndSum(String input) {
        if (input == null || input.equals("")) {
            return 0;
        }
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(input);
        if (m.find()) {
            String customDelimiter = m.group(1);
            return add(m.group(2).split(customDelimiter));
        }
        return add(splitByBaseDelimiter(input));
    }

    static String[] splitByBaseDelimiter(String input) {
        String[] result = new String[]{};
        String[] splitByComma = input.split(BASE_DIVIDER_COMMA);
        for (String element : splitByComma) {
            result = Stream
                .concat(Arrays.stream(result),
                    Arrays.stream(element.split(BASE_DIVIDER_COLON)))
                .toArray(String[]::new);
        }
        return result;
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
