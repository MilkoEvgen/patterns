package creational.prototype;

public class CarPrototype {
    private Car car;

    public CarPrototype(Car car) {
        this.car = car;
    }

    public Car getPrototype() throws CloneNotSupportedException {
        return car.clone();
    }
}
