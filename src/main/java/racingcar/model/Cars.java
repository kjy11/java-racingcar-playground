package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars = new ArrayList<>();

    public Cars(String[] carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public List<Car> getCars() {
        return cars;
    }

    public void raceOneRound() {
        for (Car car : cars) {
            car.moveOrStay();
        }
    }

    public List<Car> getWinnerCars() {
        int max = cars.stream().mapToInt(Car::getLocation).max().orElse(1);
        return cars.stream().filter(c -> c.getLocation() == max).collect(Collectors.toList());
    }
}
