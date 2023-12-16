package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        Shop shop = new CarShop();

        User user1 = new User(shop, "user1");
        User user2 = new User(shop, "user2");
        User user3 = new User(shop, "user3");

        shop.addUser(user1);
        shop.addUser(user2);
        shop.addUser(user3);

        user1.sellCar("Tesla", 1000);
        System.out.println("\n=========================================\n");
        user3.buyCar("Tesla", 1000);
    }
}
