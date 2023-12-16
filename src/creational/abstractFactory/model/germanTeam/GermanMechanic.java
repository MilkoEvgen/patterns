package creational.abstractFactory.model.germanTeam;

import creational.abstractFactory.model.Mechanic;

public class GermanMechanic implements Mechanic {
    @Override
    public void repairCar() {
        System.out.println("German mechanic repairs car");
    }
}
