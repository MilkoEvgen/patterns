package structural.decorator;

public class CarDecorator implements Car{
    private final Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
    }
}
