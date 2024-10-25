package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars = new ArrayList<>();

    public void registerCars(List<String> carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }
}
