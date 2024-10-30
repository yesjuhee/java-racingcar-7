package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int MOVE_NUMBER = 4;
    private final String name;
    private int moveDistance = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        if (canMove()) {
            moveDistance++;
        }
    }

    private boolean canMove() {
        return Randoms.pickNumberInRange(0, 9) >= MOVE_NUMBER;
    }

    public String getName() {
        return name;
    }

    public int getMoveDistance() {
        return moveDistance;
    }
}
