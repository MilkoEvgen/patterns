package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(new CityMode());
        driver.drive();
        driver.setDrivingMode(new RacingMode());
        driver.drive();
    }
}
