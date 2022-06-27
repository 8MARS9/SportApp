package Controller;

import java.util.Scanner;



public class TodoMenu {
    Scanner scanner = new Scanner(System.in);
    public void start(){
        this.showOptions();
        this.handleUserChoice();
    }

    private void handleUserChoice(){
        System.out.println("Choose an option: ");
        String userChoice = scanner.nextLine();
        int userChoice = 23;
        switch (userChoice){
            case "1":
                //add item
                break;
            case "2":
                //view all items
                break;
            case "3":
                //view single item
                break;
            case "4":
                //remove item
                break;
            case "5":
                //update item
                break;
            case "6":
                System.exit(0);
        }


    }

    private void showOptions(){
        System.out.println("" +
                "Welcome to Todo Application" +
                "\n 1. Add todo item" +
                "\n 2. View todo list" +
                "\n 3. View todo item" +
                "\n 4. Remove item" +
                "\n 5. Update item" +
                "\n 6. Exit"
        );
    }
}
