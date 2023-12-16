package behavioral.chain;

public class ManagerNotifier extends Notifier{
    public ManagerNotifier(CarCondition condition) {
        super(condition);
    }

    @Override
    public void write() {
        System.out.println("Car is absent. Sending message to manager...");
    }
}
