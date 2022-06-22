package racingcar.model;

import java.util.Random;

public class Car {

    private static final int RANDOM_BOUND = 9;
    private static final int RANDOM_MIN = 1;
    private static final int MOVE_INDICATORS = 4;

    private final String name;
    private int location;

    public Car(String name) {
        this.name = name;
        this.location = 1;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public void moveOrStay() {
        if (getRandomNumberForMoveOrStay() >= MOVE_INDICATORS) {
            moveForward();
        }
    }

    void moveForward() {
        location += 1;
    }

    private int getRandomNumberForMoveOrStay() {
        Random random = new Random();
        return random.nextInt(RANDOM_BOUND) + RANDOM_MIN;
    }
}
