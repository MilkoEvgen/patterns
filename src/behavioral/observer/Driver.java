package behavioral.observer;

public class Driver implements Observer{
    private String name;

    public Driver(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(Car car) {
        System.out.println("Dear " + name + "!");
        System.out.println(car.getBrand() + " status changed to " + car.getCondition());
    }
}
