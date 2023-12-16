package structural.adapter;

public class Main {
    public static void main(String[] args) {
        ElectricCar car = new CarAdapter();
        car.startElectricEngine();
        car.stopElectricEngine();
    }
}
