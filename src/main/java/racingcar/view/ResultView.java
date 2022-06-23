package racingcar.view;

import racingcar.model.Car;
import racingcar.model.Cars;

public class ResultView {

    public static void printResultMessage() {
        System.out.println();
        System.out.print("실행결과");
    }

    public static void printCarLocation(Car car) {
        System.out.print(car.getName());
        System.out.print(" : ");
        for (int i = 0; i < car.getLocation(); i ++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void printCarsLocation(Cars cars) {
        for (Car car : cars.getCars()) {
            ResultView.printCarLocation(car);
        }
        System.out.println();
    }

}
