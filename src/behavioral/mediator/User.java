package behavioral.mediator;

public class User {
    private Shop shop;
    String name;

    public User(Shop shop, String name) {
        this.shop = shop;
        this.name = name;
    }

    void buyCar(String brand, int price){
        shop.sendBuyMessage(brand, price, this);
    }
    void sellCar(String brand, int price){
        shop.sendSellMessage(brand, price, this);
    }

    void getSellNotification(String brand, int price, User user){
        System.out.println("Notification to " + this.name);
        System.out.println(user.name + " wants to sell " + brand + ". Price = " + price);
    }
    void getBuyNotification(String brand, int price, User user){
        System.out.println("Notification to " + this.name);
        System.out.println(user.name + " bought " + brand + ". Price = " + price);
    }
}
