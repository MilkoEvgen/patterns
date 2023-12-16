package creational.abstractFactory.model.germanTeam;

import creational.abstractFactory.model.Driver;

public class GermanDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("German driver drives car");
    }
}
