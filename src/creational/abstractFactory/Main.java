package creational.abstractFactory;

import creational.abstractFactory.factory.AutoTeamFactory;
import creational.abstractFactory.factory.GermanTeamFactory;
import creational.abstractFactory.factory.JapanTeamFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AutoTeamFactory> factories = List.of(new JapanTeamFactory(), new GermanTeamFactory());
        System.out.println("Starting race...");
        for (AutoTeamFactory factory : factories) {
            factory.getCar().startEngine();
            factory.getDriver().drive();
            factory.getMechanic().repairCar();
        }
    }
}
