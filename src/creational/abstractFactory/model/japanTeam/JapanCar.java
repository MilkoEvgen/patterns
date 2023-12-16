package creational.abstractFactory.model.japanTeam;

import creational.abstractFactory.model.Car;

public class JapanCar implements Car {
    @Override
    public void startEngine() {
        System.out.println("Toyota starts engine");
    }
}
