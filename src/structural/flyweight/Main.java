package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        DesignFlyWeight flyWeight = new DesignFlyWeight();

        Car car = new Car("tesla");
        car.setDesign(flyWeight.getDesign("tesla"));
        System.out.println(car);
    }
}
