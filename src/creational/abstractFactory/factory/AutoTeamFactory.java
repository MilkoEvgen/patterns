package creational.abstractFactory.factory;

import creational.abstractFactory.model.Car;
import creational.abstractFactory.model.Driver;
import creational.abstractFactory.model.Mechanic;

public interface AutoTeamFactory {
    Car getCar();
    Driver getDriver();
    Mechanic getMechanic();
}
