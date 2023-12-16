package creational.abstractFactory.factory;

import creational.abstractFactory.model.Car;
import creational.abstractFactory.model.Driver;
import creational.abstractFactory.model.Mechanic;
import creational.abstractFactory.model.japanTeam.JapanCar;
import creational.abstractFactory.model.japanTeam.JapanDriver;
import creational.abstractFactory.model.japanTeam.JapanMechanic;

public class JapanTeamFactory implements AutoTeamFactory{
    @Override
    public Car getCar() {
        return new JapanCar();
    }

    @Override
    public Driver getDriver() {
        return new JapanDriver();
    }

    @Override
    public Mechanic getMechanic() {
        return new JapanMechanic();
    }
}
