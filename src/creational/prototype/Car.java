package creational.prototype;

public class Car implements Cloneable{
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
        return (Car)super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
