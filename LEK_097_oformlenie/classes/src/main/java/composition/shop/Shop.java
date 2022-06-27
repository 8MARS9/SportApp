package composition.shop;

import javax.swing.*;
import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public String addProduct() {
        String name = JOptionPane.showInputDialog("Enter name of product");
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price of product"));
        double quantity = Double.parseDouble(JOptionPane.showInputDialog("Enter quantity of product"));

        String[] avaliableMeasurements = {"KG", "Item", "MB", "Liters"};

        String measurement = (String) JOptionPane.showInputDialog(
                null,
                "Select product measurement",
                "Product measurement",
                        JOptionPane.QUESTION_MESSAGE,
                                null,
                avaliableMeasurements,
                avaliableMeasurements[0]

        );

        Product product = new Product(name, price, quantity, measurement);
        this.products.add(product);

        return product + " added successfully";
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String sellProduct () {

        Product productToSell = (Product) JOptionPane.showInputDialog(
                null,
                "Select product to buy",
                "Buy product",
                JOptionPane.QUESTION_MESSAGE,
                null,
                this.products.toArray(),
                this.products.toArray()[0]
        );


        //do some more stuff with the received product e.g. reduce quantity

        return "You successfully purchased product: " + productToSell;
        }

}
