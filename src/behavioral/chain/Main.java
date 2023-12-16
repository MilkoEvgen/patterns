package behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Notifier driver = new DriverNotifier(CarCondition.READY);
        Notifier mechanic = new MechanicNotifier(CarCondition.BROKEN);
        Notifier manager = new ManagerNotifier(CarCondition.ABSENT);

        driver.setNextNotifier(mechanic);
        mechanic.setNextNotifier(manager);

        driver.sendMessage(CarCondition.ABSENT);
    }
}
