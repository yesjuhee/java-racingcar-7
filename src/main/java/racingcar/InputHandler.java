package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputHandler {
    public static List<String> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();

        ArrayList<String> carNames = new ArrayList<>();
        for (String carName : input.split(",")) {
            carNames.add(carName.strip());
        }
        return carNames;
    }
}
