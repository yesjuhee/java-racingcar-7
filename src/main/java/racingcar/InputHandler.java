package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputHandler {
    public static List<String> getCarNames() {
        // TODO: Input 형식 검증
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String input = Console.readLine();

        return Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());
    }

    public static int getTotalRaceCount() {
        // TODO: Input 형식 검증
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        return Integer.parseInt(input);
    }
}
