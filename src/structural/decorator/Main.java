package structural.decorator;

public class Main {
    public static void main(String[] args) {
        Car car = new TeslaDecorator(new CarDecorator(new ElectricCar()));
        car.drive();
    }
}
