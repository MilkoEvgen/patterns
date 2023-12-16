package structural.proxy;

public class TeslaProxy implements Car{
    private Car car;

    @Override
    public void startEngine() {
        if (car == null){
            car = new Tesla();
        }
        car.startEngine();
    }
}
