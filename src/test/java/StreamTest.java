import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

public class StreamTest {
    @Test
    void max() {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);
        intList.add(4);
        intList.add(2);

        int max = intList.stream().mapToInt(i -> i).max().orElse(1);
        System.out.println(max);
    }
}
