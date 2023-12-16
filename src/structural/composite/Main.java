package structural.composite;

public class Main {
    public static void main(String[] args) {
        CompositeCar cars = new CompositeCar();

        CompositeCar compositeCar = new CompositeCar();
        compositeCar.addCar(new RaceCar());

        cars.addCar(new Truck());
        cars.addCar(compositeCar);
        cars.addCar(new RaceCar());

        cars.startEngine();
    }
}
