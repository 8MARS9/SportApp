package shop;

import product.Product;
import product.ProductService;
import sales.Sale;
import sales.SalesService;
import users.User;
import users.UserService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class ShopController {
    protected JFrame frame;
    private final UserService userService;
    private final ProductService productService;
    private User activeUser;
    private final SalesService salesService;

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User activeUser) {
        this.activeUser = activeUser;
    }

    public ShopController(ProductService productService, UserService userService, SalesService salesService){
        this.productService = productService;
        this.userService = userService;
        this.salesService = salesService;
        frame = new JFrame();
    }

    public void createProduct() {
        try {
            Product product = new Product();
            product.setName(JOptionPane.showInputDialog(frame, "Enter name of product"));
            product.setDescription(JOptionPane.showInputDialog(frame, "Enter description of product"));
            product.setPrice(Double.valueOf(JOptionPane.showInputDialog(frame, "Enter price of product")));
            product.setQuantity(Long.valueOf(JOptionPane.showInputDialog(frame, "Enter quantity of product")));

        /*longer version show confirm dialog and make decision

        boolean isAvailable = false;
        int isAvailableResponse = JOptionPane.showConfirmDialog((frame, "Is product available?");
        if (isAvailableResponse == JOptionPane.YES_OPTION){
         isAvailable = true;
        product.setAvailable(isAvailable);
        */

            product.setAvailable(JOptionPane.showConfirmDialog(frame, "Is product available?") == JOptionPane.YES_OPTION);
            String response = this.productService.addProduct(product);
            JOptionPane.showMessageDialog(frame, response);
        } catch (NullPointerException | NumberFormatException exception){
            JOptionPane.showMessageDialog(frame, "Problem occurred, try again");
        }
    }

    public void sellProduct(){
        try{
            ArrayList<Product> availableProducts = this.productService.getAllProducts();
            Product selectedProduct = (Product) JOptionPane.showInputDialog(this.frame, "Select a product", "Buy product", JOptionPane.QUESTION_MESSAGE,
                    null, availableProducts.toArray(),
                    availableProducts.toArray()[0]);

           Integer quantity = Integer.valueOf(JOptionPane.showInputDialog("How many do you want to buy?"));
            double totalCostOfProduct = selectedProduct.getPrice() * quantity;

            if (selectedProduct.getQuantity() < quantity) throw new Exception("Not enough product");

            //check if user enough balance
            User activeUser = this.userService.getActiveUser();

            if(activeUser.getBalance() < totalCostOfProduct) throw new Exception("not enough balance");

            selectedProduct.setQuantity(selectedProduct.getQuantity() - quantity);
            activeUser.setBalance(activeUser.getBalance() - totalCostOfProduct);

            //check if enough product

            // update product quantity
            this.productService.updateProduct(selectedProduct);
            this.userService.updateUserBalance(activeUser);
            this.userService.syncActiveUser();
            this.salesService.addSale(new Sale(
                    selectedProduct, activeUser, totalCostOfProduct, quantity, LocalDateTime.now()
            ));

            //do some more validation

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this.frame, e.getMessage());
        }
        JOptionPane.showMessageDialog(this.frame, "Product Purchased successfully");
    }

    public void viewProducts() {
        String[] col = {"id", "name", "description", "price", "quantity", "is available"};

        DefaultTableModel tableModel = new DefaultTableModel(col, 0);

    /*  example 2
    you can use this regular for loop or  example
    * */
        this.productService.getAllProducts().forEach(product -> tableModel.addRow(
                        new String[]{
                                String.valueOf(product.getId()),
                                product.getName(),
                                product.getDescription(),
                                String.valueOf(product.getPrice()),
                                String.valueOf(product.getQuantity()),
                                product.getAvailable() ? "Available" : "Not Available",

                        }
                )
        );
        displayTable(tableModel);


    }
    private void displayTable(DefaultTableModel tableModel) {
        JTable table = new JTable(tableModel);


        frame.setLayout(new BorderLayout());
        frame.setSize(600, 600);

        frame.add(new JScrollPane(table), BorderLayout.AFTER_LAST_LINE);

        frame.setVisible(true);
    }
    public void viewSales(){
        String[] col = {"id", "product name", "user name", "total cost", "total quantity", "purchase date"};
        DefaultTableModel tableModel = new DefaultTableModel(col, 0);
        this.salesService.getAll().forEach( sale -> tableModel.addRow(
                new String[]{
                        String.valueOf(sale.getId()),
                        sale.getProduct().getName(),
                        sale.getUser().getUsername(),
                        String.valueOf(sale.getTotalCost()),
                        String.valueOf(sale.getTotalAmountBought()),
                        sale.getPurchaseDate().toString(),
                }
        ));
        this.displayTable(tableModel);

    }
        public void createUser(){
            try {
                String userName = JOptionPane.showInputDialog("Enter your username");
                String pin = JOptionPane.showInputDialog("Enter your security pin");

                double balance = Double.valueOf(JOptionPane.showInputDialog("Enter your budget for shopping"));
                userService.createUser(new User(userName, pin, balance));
            } catch (Exception exception){
                JOptionPane.showMessageDialog(frame, exception.getMessage());
            }
        }

    public void collectUserInfoAndRegisterUser(){
        try {
            String userName = JOptionPane.showInputDialog("Enter your username");
            String pin = JOptionPane.showInputDialog("Enter your security pin");
            Double balance = Double.valueOf(JOptionPane.showInputDialog("Enter your budget for shopping"));

            userService.createUser(new User(userName, pin, balance));
        }catch (Exception exception){
            JOptionPane.showMessageDialog(frame, exception.getMessage());
        }
    }
        public void collectUserInfoAndVerifyUser(){
            try {
                String userName = JOptionPane.showInputDialog("Enter your username");
                String pin = JOptionPane.showInputDialog("Enter your pin");

               User selectedUser = userService.findUserByUsername(userName);
               userService.setActiveUser(selectedUser, pin);
               JOptionPane.showMessageDialog(frame, "Login successful");
            }catch (Exception exception){
                JOptionPane.showMessageDialog(frame, exception.getMessage());

            }
        }
    }



