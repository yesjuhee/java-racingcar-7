package racingcar;

import java.util.List;

public class OutputHandler {
    public static void printRoundResult(final List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getMoveDistance()));
        }
        System.out.println();
    }
    
    public static void printFinalResult(final List<String> winnerNames) {
        System.out.println("최종 우승자 : " + String.join(", ", winnerNames));
    }
}
