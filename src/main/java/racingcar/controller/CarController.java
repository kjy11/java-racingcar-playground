package racingcar.controller;

import racingcar.model.Cars;
import racingcar.view.InputView;
import racingcar.view.ResultView;

public class CarController {

    public void play() {
        String[] carNames = InputView.namesInput();
        int roundCount = InputView.raceCountInput();
        play(carNames, roundCount);
    }

    public void play(String[] carNames, int roundCount) {
        ResultView.printResultMessage();
        Cars cars = createCars(carNames);
        race(cars, roundCount);
        ResultView.printWinners(cars.getWinnerCars());
    }

    private Cars createCars(String[] carNames) {
        Cars cars = new Cars(carNames);
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
