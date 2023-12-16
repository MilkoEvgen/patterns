package creational.prototype;

public class Race {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Lada");
        CarPrototype carPrototype = new CarPrototype(car);

        Car first = carPrototype.getPrototype();
        System.out.println(first + ", hash: " + first.hashCode());
        Car second = carPrototype.getPrototype();
        System.out.println(second + ", hash: " + second.hashCode());
    }
}
