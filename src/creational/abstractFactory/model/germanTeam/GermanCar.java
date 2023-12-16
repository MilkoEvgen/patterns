package creational.abstractFactory.model.germanTeam;

import creational.abstractFactory.model.Car;

public class GermanCar implements Car {

    @Override
    public void startEngine() {
        System.out.println("BMW car starts engine");
    }
}
