package structural.decorator;

public class TeslaDecorator extends CarDecorator{
    public TeslaDecorator(Car car) {
        super(car);
    }

    void checkSystem(){
        System.out.println("Tesla ready to start...");
    }

    @Override
    public void drive() {
        checkSystem();
        super.drive();
    }
}
