package behavioral.strategy;

public class SportMode implements DrivingMode {
    @Override
    public void drive() {
        System.out.println("Driving in a sport mode");
    }
}
