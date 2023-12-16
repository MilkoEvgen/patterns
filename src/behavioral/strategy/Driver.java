package behavioral.strategy;

public class Driver {
    private DrivingMode drivingMode;

    public Driver(DrivingMode drivingMode) {
        this.drivingMode = drivingMode;
    }

    public void setDrivingMode(DrivingMode drivingMode) {
        this.drivingMode = drivingMode;
    }
    void drive(){
        drivingMode.drive();
    }
}
