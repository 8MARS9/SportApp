package controller;

import dto.User;
import dto.UserCard;

import javax.swing.*;
import java.util.Calendar;
import java.util.Date;

public class MenuController {
    private final AtmController atmController = new AtmController();
    public MenuController(){
        this.atmController.setBankController(new BankController());
    }
    public MenuController(BankController bankController){
        this.atmController.setBankController(bankController);
    }
    public void start(){
        this.displayMainMenu();

    }

    private void displayMainMenu() {
        JOptionPane.showConfirmDialog(null, "Welcome to the ATM" +

                "Please choose an option ont the next prompt");

        String option = JOptionPane.showInputDialog(null, "Write the corresponding number \n\n" +
                "1. Insert Card\n" +
                "2. Withdraw\n" +
                "3. Deposit\n" +
                "4. See balance\n" +
                "5. Remove Card\n" +
                "6.Create Account\n" +
                "7. Close / Exit\n"
        );

        switch (option) {
            case "1":
                this.handleCardInsertion();
                break;
            case "2":
                this.handleWithdrawal();
                break;
            case "3":
                this.handleDeposit();
                break;
            case "4":
                this.handleDisplayUserBalance();
                break;
            case "5":
                this.handleCardRemoval();
                break;
            case "6":
                this.handleAccountCreation();
                break;
            case "7":
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please select a valid entry");
                break;

        }

        displayMainMenu();
    }

    private void handleCardRemoval() {
        JOptionPane.showInputDialog(this.atmController.removeCard());
    }

    private void handleDeposit() {
        double amountToDeposit = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to deposit :"));
        JOptionPane.showMessageDialog(null, this.atmController.deposit(amountToDeposit));
    }

    private void handleWithdrawal() {
        double amountToWithdraw = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to withdraw :"));
        JOptionPane.showMessageDialog(null, this.atmController.deposit(amountToWithdraw));
    }

    private void handleDisplayUserBalance() {
        JOptionPane.showMessageDialog(null, this.atmController.getUserBalance());
    }

    private void handleAccountCreation() {
        String name = JOptionPane.showInputDialog(null, "Enter your name");
        String cardPin = JOptionPane.showInputDialog(null, "Enter your card Pin");


        Date expiryDate = new Date(2022, Calendar.JUNE, 22);

        UserCard userCard = new UserCard(expiryDate, 0.00D, Integer.parseInt(cardPin));

        User user = new User(name, userCard, 2);
        this.atmController.bankController.createUser(user);

        JOptionPane.showMessageDialog(null, "Your user account number is " + user.getAccountNumber());
    }

    private void handleCardInsertion(){
            String accountNumber = JOptionPane.showInputDialog(null, "Enter your accountNumber");
            String pin = JOptionPane.showInputDialog(null, "Enter your pin");

            try{
                User user = atmController.bankController.findUserByAccountNumber(accountNumber);
                atmController.insertCard(user.getCard());
                atmController.validateCard(Integer.parseInt(pin));
                JOptionPane.showMessageDialog(null, "You logged in successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }

            // atmController.insertCard();


        }

}
