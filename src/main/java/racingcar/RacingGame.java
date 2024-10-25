package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars = new ArrayList<>();
    private int totalRaceRound;

    RacingGame(List<String> carNames, int totalRaceRound) {
        registerCars(carNames);
        this.totalRaceRound = totalRaceRound;
    }

    private void registerCars(List<String> carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public void start() {
        for (int round = 0; round < totalRaceRound; round++) {
            for (Car car : cars) {
                car.move();
            }
        }
    }
}
