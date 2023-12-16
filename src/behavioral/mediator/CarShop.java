package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class CarShop implements Shop{
    private final List<User> users = new ArrayList<>();

    public CarShop() {
    }

    public void addUser(User user){
        users.add(user);
    }

    @Override
    public void sendBuyMessage(String brand, int price, User user) {
        for (User u : users) {
            if (!u.equals(user)){
                u.getBuyNotification(brand, price, user);
            }
        }
    }

    @Override
    public void sendSellMessage(String brand, int price, User user) {
        for (User u : users) {
            if (!u.equals(user)){
                u.getSellNotification(brand, price, user);
            }
        }
    }
}
