package creational.singleton;

public class Car {
    private static Car instance;

    private Car() {
    }

    public static Car getInstance(){
        if (instance == null){
            return new Car();
        } else {
            return instance;
        }
    }
}
