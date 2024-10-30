package racingcar;

import java.util.List;

public class OutputHandler {
    public static void promptForCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public static void promptForTotalRaceCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
    }

    public static void displayGameResultHeader() {
        System.out.println("\n실행 결과");
    }

    public static void displayRoundResult(final List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getMoveDistance()));
        }
        System.out.println();
    }

    public static void displayFinalResult(final List<String> winnerNames) {
        System.out.println("최종 우승자 : " + String.join(", ", winnerNames));
    }
}
