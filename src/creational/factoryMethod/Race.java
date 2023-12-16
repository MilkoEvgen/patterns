package creational.factoryMethod;

import creational.factoryMethod.factory.CarFactory;
import creational.factoryMethod.factory.GermanCarFactory;
import creational.factoryMethod.factory.JapanCarFactory;
import creational.factoryMethod.model.Car;

public class Race {
    public static void main(String[] args) {
        CarFactory factory = getCarFactoryByName("japan");
        Car car = factory.getCar();
        car.drive();
    }

    static CarFactory getCarFactoryByName(String factoryName){
        if (factoryName.equalsIgnoreCase("japan")){
            return new JapanCarFactory();
        } else if (factoryName.equalsIgnoreCase("german")){
            return new GermanCarFactory();
        } else throw new RuntimeException("Unknown factory name");
    }
}
