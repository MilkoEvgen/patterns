package creational.builder.model;

public class Car {
    private String brand;
    private Type type;
    private Integer productionYear;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type=" + type +
                ", productionYear=" + productionYear +
                '}';
    }
}
