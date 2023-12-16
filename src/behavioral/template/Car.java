package behavioral.template;

public abstract class Car {
    public void drive(){
        System.out.println("Checking all car systems... Car is ready to start...");
        startEngine();
        System.out.println("Driving is over.");
    }

    protected abstract void startEngine();
}
