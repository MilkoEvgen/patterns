package structural.flyweight;

public class Car {
    private String name;
    private DesignCar design;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public DesignCar getDesign() {
        return design;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesign(DesignCar design) {
        this.design = design;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", design=" + design +
                '}';
    }
}
