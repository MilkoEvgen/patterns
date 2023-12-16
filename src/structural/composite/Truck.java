package structural.composite;

public class Truck implements Car{
    @Override
    public void startEngine() {
        System.out.println("Truck engine started");
    }
}
