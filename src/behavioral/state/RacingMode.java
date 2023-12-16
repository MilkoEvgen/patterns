package behavioral.state;

public class RacingMode implements DrivingMode{
    @Override
    public void drive() {
        System.out.println("Driving in racing mode");
    }
}
