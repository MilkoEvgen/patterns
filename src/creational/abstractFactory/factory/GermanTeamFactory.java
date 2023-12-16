package creational.abstractFactory.factory;

import creational.abstractFactory.model.Car;
import creational.abstractFactory.model.Driver;
import creational.abstractFactory.model.Mechanic;
import creational.abstractFactory.model.germanTeam.GermanCar;
import creational.abstractFactory.model.germanTeam.GermanDriver;
import creational.abstractFactory.model.germanTeam.GermanMechanic;

public class GermanTeamFactory implements AutoTeamFactory{
    @Override
    public Car getCar() {
        return new GermanCar();
    }

    @Override
    public Driver getDriver() {
        return new GermanDriver();
    }

    @Override
    public Mechanic getMechanic() {
        return new GermanMechanic();
    }
}
