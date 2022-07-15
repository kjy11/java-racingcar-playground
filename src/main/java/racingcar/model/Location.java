package racingcar.model;

public class Location {

    private int location;

    public Location(int location) {
        if (location < 0) {
            throw new IllegalArgumentException("위치는 음수일 수 없습니다.");
        }
        this.location = location;
    }

    public void add() {
        location ++;
    }

    public int getLocation() {
        return location;
    }

}
