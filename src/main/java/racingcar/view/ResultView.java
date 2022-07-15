package racingcar.view;

import java.util.List;
import racingcar.model.Car;
import racingcar.model.Cars;

public class ResultView {

    public static void printResultMessage() {
        System.out.println();
        System.out.println("실행결과");
    }

    public static void printCarLocation(Car car) {
        System.out.print(car.getNameAsString());
        System.out.print(" : ");
        for (int i = 0; i < car.getLocationAsInt(); i++) {
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

    public static void printWinners(List<Car> cars) {
        String[] winnerNames = cars
            .stream()
            .map(Car::getNameAsString)
            .toArray(String[]::new);
        System.out.print(String.join(", ", winnerNames));
        System.out.println("가 최종 우승했습니다.");
    }

}
