package structural.proxy;

public class Tesla implements Car{
    public Tesla() {
        System.out.println("Creating new tesla...");
    }

    @Override
    public void startEngine() {
        System.out.println("Tesla starts engine");
    }
}
