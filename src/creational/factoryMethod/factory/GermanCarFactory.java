package creational.factoryMethod.factory;

import creational.factoryMethod.model.Car;
import creational.factoryMethod.model.GermanCar;

public class GermanCarFactory implements CarFactory{
    @Override
    public Car getCar() {
        return new GermanCar();
    }
}
