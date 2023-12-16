package behavioral.chain;

public class DriverNotifier extends Notifier{
    public DriverNotifier(CarCondition condition) {
        super(condition);
    }
    @Override
    public void write() {
        System.out.println("Car is ready. Sending message to driver...");
    }
}
