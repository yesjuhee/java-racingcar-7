package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars = new ArrayList<>();
    private Integer moveCount;

    RacingGame(List<String> carNames, Integer moveCount) {
        registerCars(carNames);
        this.moveCount = moveCount;
    }

    private void registerCars(List<String> carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }
}
