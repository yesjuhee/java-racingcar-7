package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private List<Car> cars;
    private final int totalRaceRound;

    RacingGame(List<String> carNames, int totalRaceRound) {
        registerCars(carNames);
        this.totalRaceRound = totalRaceRound;
    }

    private void registerCars(List<String> carNames) {
        cars = carNames.stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void start() {
        System.out.println("\n실행 결과");
        for (int round = 0; round < totalRaceRound; round++) {
            for (Car car : cars) {
                car.move();
                car.printStatus();
            }
            System.out.println();
        }
    }
}
