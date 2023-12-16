package behavioral.chain;

public abstract class Notifier {
    protected CarCondition condition;
    protected Notifier nextNotifier;

    public Notifier(CarCondition condition) {
        this.condition = condition;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void sendMessage(CarCondition condition){
        if (condition.equals(this.condition)){
            write();
        } else {
            nextNotifier.sendMessage(condition);
        }
    }

    public abstract void write();
}
