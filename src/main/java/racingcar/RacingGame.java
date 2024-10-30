package racingcar;

import java.util.List;

public class RacingGame {
    private final List<Car> cars;
    private final int totalRaceRound;

    RacingGame(final List<String> carNames, final int totalRaceRound) {
        this.cars = carNames.stream()
                .map(Car::new)
                .toList();
        this.totalRaceRound = totalRaceRound;
    }

    public void start() {
        System.out.println("\n실행 결과");
        for (int round = 0; round < totalRaceRound; round++) {
            cars.forEach(Car::move);
            OutputHandler.printRoundResult(cars);
        }
        int maximumMoveDistance = findMaximumMoveDistance(cars);
        List<String> winnerNames = getWinnerNames(cars, maximumMoveDistance);
        OutputHandler.printFinalResult(winnerNames);
    }

    private int findMaximumMoveDistance(List<Car> cars) {
        return cars.stream()
                .mapToInt(Car::getMoveDistance)
                .max().orElse(0);
    }

    private List<String> getWinnerNames(List<Car> cars, int maximumMoveDistance) {
        return cars.stream()
                .filter(car -> car.getMoveDistance() == maximumMoveDistance)
                .map(Car::getName)
                .toList();
    }
}
