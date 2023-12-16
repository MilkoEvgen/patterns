package behavioral.visitor;

public class Car implements AutoProduct {
    private String productName;
    private int price;

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public Car(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCar(this);
    }
}
