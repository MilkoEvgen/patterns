package structural.flyweight;

public abstract class DesignCar {
    private String design;

    public DesignCar(String design) {
        this.design = design;
    }

    public String getDesign() {
        return design;
    }

    @Override
    public String toString() {
        return "DesignCar{" +
                "design='" + design + '\'' +
                '}';
    }
}
