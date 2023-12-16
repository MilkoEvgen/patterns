package behavioral.observer;

public class Car {
    private String brand;
    private CarCondition condition;

    public Car(String brand, CarCondition condition) {
        this.brand = brand;
        this.condition = condition;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CarCondition getCondition() {
        return condition;
    }

    public void setCondition(CarCondition condition) {
        this.condition = condition;
    }
}
