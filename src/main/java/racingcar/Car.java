package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private String name;
    private int step = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        if (Randoms.pickNumberInRange(0, 9) >= 4) {
            step++;
        }
    }
}
