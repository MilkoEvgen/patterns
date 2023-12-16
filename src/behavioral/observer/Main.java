package behavioral.observer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = List.of(new Car("Tesla", CarCondition.BROKEN),
                new Car("Ford", CarCondition.READY),
                new Car("Lada", CarCondition.UNAVAILABLE));
        Garage garage = new Garage(cars);
        garage.addObserver(new Driver("Driver1"));
        garage.addObserver(new Driver("Driver2"));
        garage.addObserver(new Driver("Driver3"));

        garage.changeCarStatus("Lada", CarCondition.READY);
    }
}
