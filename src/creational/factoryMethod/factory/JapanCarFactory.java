package creational.factoryMethod.factory;

import creational.factoryMethod.model.Car;
import creational.factoryMethod.model.JapanCar;

public class JapanCarFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new JapanCar();
    }
}
