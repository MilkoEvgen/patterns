package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(new CityMode());
        driver.drive();
        driver.changeMode();
        driver.drive();
    }
}
