package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<String> carNames = InputHandler.getCarNames();
        int moveCount = InputHandler.getMoveCount();

        RacingGame racingGame = new RacingGame(carNames, moveCount);
    }
}
