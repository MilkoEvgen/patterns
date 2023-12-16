package behavioral.chain;

public class MechanicNotifier extends Notifier{
    public MechanicNotifier(CarCondition condition) {
        super(condition);
    }

    @Override
    public void write() {
        System.out.println("Car is broken. Sending message to mechanic...");
    }
}
