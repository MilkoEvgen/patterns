package behavioral.state;

public class Driver {
    private DrivingMode drivingMode;

    public Driver(DrivingMode drivingMode) {
        this.drivingMode = drivingMode;
    }

    void changeMode(){
        if (drivingMode instanceof CityMode){
            drivingMode = new SportMode();
        } else if (drivingMode instanceof SportMode){
            drivingMode = new RacingMode();
        } else if (drivingMode instanceof RacingMode){
            drivingMode = new CityMode();
        }
    }

    void drive(){
        drivingMode.drive();
    }
}
