package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.ResultView;

public class CarController {

    private static final String NAME_SPLIT_SYMBOL = ",";

    public void play(String carNames, int roundCount) {
        Cars cars = createCars(carNames);
        race(cars, roundCount);
        ResultView.printWinners(cars.getWinnerCars());
    }

    private Cars createCars(String carNames) {
        Cars cars = new Cars(carNames.split(NAME_SPLIT_SYMBOL));
        ResultView.printCarsLocation(cars);
        return cars;
    }

    private void race(Cars cars, int roundCount) {
        for (int i = 0; i < roundCount; i++) {
            cars.raceOneRound();
            ResultView.printCarsLocation(cars);
        }
    }
}
