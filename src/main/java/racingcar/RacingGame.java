package racingcar;

import java.util.ArrayList;
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
        printWinner();
    }

    private void printWinner() {
        int maximumStep = 0;
        for (Car car : cars) {
            if (car.getMoveDistance() > maximumStep) {
                maximumStep = car.getMoveDistance();
            }
        }

        List<String> winnerNames = new ArrayList<>();
        for (Car car : cars) {
            if (maximumStep == car.getMoveDistance()) {
                winnerNames.add(car.getName());
            }
        }

        System.out.println("최종 우승자 : " + String.join(", ", winnerNames));
    }
}
