package racingcar.model;

import org.junit.jupiter.api.Test;
import racingcar.controller.CarController;

public class CarControllerTest {

    @Test
    void play() {
        CarController controller = new CarController();
        controller.play(new String[] {"pobi", "crong", "honux"}, 5);
    }
}
