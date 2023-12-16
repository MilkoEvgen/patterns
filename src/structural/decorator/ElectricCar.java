package structural.decorator;

public class ElectricCar implements Car{
    @Override
    public void drive() {
        System.out.println("Electric car started.");
    }
}
