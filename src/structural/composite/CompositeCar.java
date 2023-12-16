package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeCar implements Car{
    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car){
        cars.add(car);
    }

    @Override
    public void startEngine() {
        for (Car car : cars) {
            car.startEngine();
        }
    }
}
