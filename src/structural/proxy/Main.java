package structural.proxy;

public class Main {
    public static void main(String[] args) {
        Car car = new TeslaProxy();
        car.startEngine();

    }
}
