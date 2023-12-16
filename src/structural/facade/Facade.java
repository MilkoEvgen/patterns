package structural.facade;

public class Facade {
    private Mechanic mechanic = new Mechanic();
    private Car car = new Car();
    private Driver driver = new Driver();
    void startRace(){
        mechanic.checkSystem();
        car.startEngine();
        driver.driveCar();
    }
}
