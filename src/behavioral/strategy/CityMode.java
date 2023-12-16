package behavioral.strategy;

public class CityMode implements DrivingMode {
    @Override
    public void drive() {
        System.out.println("Driving in a city mode");
    }
}
