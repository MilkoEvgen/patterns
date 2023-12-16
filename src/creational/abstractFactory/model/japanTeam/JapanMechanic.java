package creational.abstractFactory.model.japanTeam;

import creational.abstractFactory.model.Mechanic;

public class JapanMechanic implements Mechanic {
    @Override
    public void repairCar() {
        System.out.println("Japan mechanic repairs car");
    }
}
