package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputHandler {
    public static List<String> getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();

        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException("경주할 자동차 이름을 입력하세요.");
        }

        List<String> carNames = new ArrayList<>();
        for (String carName : input.split(",")) {
            carName = carName.strip();
            validateCarNameLength(carName);
            carNames.add(carName);
        }
        return carNames;
    }

    private static void validateCarNameLength(String carName) {
        if (carName.isBlank()) {
            throw new IllegalArgumentException("이름은 한 글자 이상 작성 가능합니다.");
        }
        if (carName.length() > 5) {
            throw new IllegalArgumentException("이름은 5글자 이하로 작성 가능합니다.");
        }
    }

    public static int getTotalRaceCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        int num;
        try {
            num = Integer.parseInt(input);
            if (num <= 0) {
                throw new IllegalArgumentException("시도할 횟수는 자연수로 입력해주세요.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도할 횟수는 자연수로 입력해주세요.");
        }
        return num;
    }
}
