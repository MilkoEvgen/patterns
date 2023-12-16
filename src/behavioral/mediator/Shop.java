package behavioral.mediator;

public interface Shop {
    void addUser(User user);
    void sendBuyMessage(String brand, int price, User user);
    void sendSellMessage(String brand, int price, User user);
}
