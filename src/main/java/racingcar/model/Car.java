package racingcar.model;

import java.util.Random;

public class Car {

    private static final int RANDOM_BOUND = 9;
    private static final int RANDOM_MIN = 1;
    private static final int MOVE_INDICATORS = 4;

    private final CarName name;
    private final Location location;

    public Car(String name) {
        this(name, 1);
    }

    public Car(String name, int location) {
        this(new CarName(name), new Location(location));
    }

    public Car(CarName carName, Location location) {
        this.name = carName;
        this.location = location;
    }

    public String getNameAsString() {
        return name.getCarName();
    }

    public int getLocationAsInt() {
        return location.getLocation();
    }

    public void moveOrStay() {
        if (getRandomNumberForMoveOrStay() >= MOVE_INDICATORS) {
            moveForward();
        }
    }

    void moveForward() {
        location.add();
    }

    private int getRandomNumberForMoveOrStay() {
        Random random = new Random();
        return random.nextInt(RANDOM_BOUND) + RANDOM_MIN;
    }
}
