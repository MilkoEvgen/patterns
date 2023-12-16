package behavioral.visitor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AutoProduct> products = List.of(
                new Car("ford", 25000),
                new Wheel("wheel", 1000),
                new Engine("engine", 12000)
                );
        PriceVisitor priceVisitor = new PriceVisitor();

        for (AutoProduct product : products) {
            product.accept(priceVisitor);
        }
        System.out.println("Average price of all products = " + priceVisitor.getAveragePrice());
    }
}
