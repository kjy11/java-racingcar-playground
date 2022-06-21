package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringAddCalculatorTest_Base {

    @Test
    void 문자열_구분_쉼표_콜론() {
        String[] result = StringAddCalculator.splitByBaseDelimiter("1,2:3");
        assertThat(result).containsExactly("1", "2", "3");
    }
}
