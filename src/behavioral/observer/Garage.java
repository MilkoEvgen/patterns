package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Garage implements Observed{
    private List<Car> cars;
    private List<Observer> observers = new ArrayList<>();

    public Garage(List<Car> cars) {
        this.cars = cars;
    }

    void changeCarStatus(String carBrand, CarCondition condition){
        for (Car car : cars) {
            if (carBrand.equalsIgnoreCase(car.getBrand())){
                car.setCondition(condition);
                notifyObservers(car);
            }
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Car car) {
        for (Observer observer : observers) {
            observer.handleEvent(car);
        }
    }
}
