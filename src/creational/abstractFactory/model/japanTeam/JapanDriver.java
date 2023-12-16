package creational.abstractFactory.model.japanTeam;

import creational.abstractFactory.model.Driver;

public class JapanDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("Japan driver drives car");
    }
}
