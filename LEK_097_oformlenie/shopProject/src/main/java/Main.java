import product.ProductService;
import sales.SalesService;
import shop.MenuController;
import users.User;
import users.UserService;
import shop.ShopController;

import javax.swing.*;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {


        ShopController shopController = new ShopController(
                new ProductService(),
                new UserService(),
                new SalesService()

        );


        MenuController menuController = new MenuController(shopController);
        menuController.showOptions();
    }
}
