package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputHandler {
    public static List<String> getCarNames() {
        // TODO: Input 형식 검증
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();

        ArrayList<String> carNames = new ArrayList<>();
        for (String carName : input.split(",")) {
            carNames.add(carName.strip());
        }
        return carNames;
    }

    public static int getTotalRaceCount() {
        // TODO: Input 형식 검증
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        return Integer.parseInt(input);
    }
}
