package racingcar;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<String> carNames = InputHandler.getCarNames();
        RacingGame racingGame = new RacingGame();
        racingGame.registerCars(carNames);
    }
}
