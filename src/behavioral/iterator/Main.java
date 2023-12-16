package behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {new Car("Ford"), new Car("Renault"), new Car("Volvo")};
        Garage garage = new Garage("Garage", cars);
        Iterator iterator = garage.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
