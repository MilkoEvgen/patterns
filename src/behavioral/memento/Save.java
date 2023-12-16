package behavioral.memento;

public class Save {
    private final String brand;
    private final String model;
    private final int year;

    public Save(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
}
