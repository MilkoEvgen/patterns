package structural.adapter;

public class CarAdapter extends Ford implements ElectricCar{
    @Override
    public void startElectricEngine() {
        startEngine();
    }

    @Override
    public void stopElectricEngine() {
        stopEngine();
    }
}
