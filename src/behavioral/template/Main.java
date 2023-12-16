package behavioral.template;

public class Main {
    public static void main(String[] args) {
        Car tesla = new ElectricCar();
        Car ford = new DieselCar();

        tesla.drive();
        ford.drive();
    }
}
