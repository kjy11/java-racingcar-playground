package racingcar.controller;

import racingcar.model.Cars;

public class CarController {

    private static final String NAME_SPLIT_SYMBOL = ",";

    private Cars createCars(String carNames) {
        return new Cars(carNames.split(NAME_SPLIT_SYMBOL));
    }

}
