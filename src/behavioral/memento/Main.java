package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Car car = new Car("Ford", "mustang", 1967);
        storage.save(car.getSave());
        System.out.println("Car before changes");
        System.out.println(car);

        car.setModel("focus");
        car.setYear(2002);
        System.out.println("Car after changes");
        System.out.println(car);

        car.loadFromSave(storage.getLastSave());
        System.out.println("Car after loading");
        System.out.println(car);
    }
}
