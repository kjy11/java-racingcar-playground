package racingcar;

import racingcar.controller.CarController;

public class RacingCarApplication {

    public static void main(String[] args) {
        CarController carController = new CarController();
        carController.play();
    }
}
