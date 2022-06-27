package shop;

import product.Product;
import users.InvalidUserException;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MenuController {

    private final ShopController shopController;
    private final JFrame frame;

    public MenuController(ShopController shopController){
        this.shopController = shopController;
        this.frame = shopController.frame;
    }
    public void showOptions(){
        try {
            String userSelection = displayMenuOptions();

            handleUserChoice(userSelection);
        } catch(InvalidChoiceException exception) {
            JOptionPane.showMessageDialog(frame, exception);

        }
        showOptions();


    }

    private String displayMenuOptions() {

        /* if you want as arraylist, then you can use stream. If not, you can use MenuOptions.values() which gives Array
        List<String> menuOptions = (List<String>) Stream.of(MenuOptions.values())
        .map(MenuOptions::name)
                .collect(Collectors.toList());
         */
        String[] menuOptionFormatted = Stream.of(MenuOptions.values())
        .map(menuOption -> menuOption.toString().replace("_", "_"))
        .toArray(String[]::new);



        String selectedOption = JOptionPane.showInputDialog(
                this.frame,
                "Select an option",
                "Menu options",
                JOptionPane.QUESTION_MESSAGE,
                null,
                menuOptionFormatted,
                menuOptionFormatted[0]

        ).toString();
        return selectedOption;
    }

    private void handleUserChoice(String userChoice) throws InvalidChoiceException {

        switch (userChoice){
            case "See Product":
                shopController.viewProducts();
                break;
            case "Buy Product":
                    shopController.sellProduct();
            break;
            case "Register":
                shopController.collectUserInfoAndRegisterUser();
                break;
            case "Login":
                shopController.collectUserInfoAndVerifyUser();
                break;
            case "Show sales history":
                shopController.viewSales();
                break;
            case "Exit Application":
                System.exit(0);
                break;
            default:
                throw new InvalidChoiceException("please choose a valid option");

        }
    }
}
