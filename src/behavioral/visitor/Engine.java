package behavioral.visitor;

public class Engine implements AutoProduct {
    private String productName;
    private int price;

    public Engine(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitEngine(this);
    }
}
