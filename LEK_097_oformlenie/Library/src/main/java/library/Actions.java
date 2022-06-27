package library;

import java.util.Scanner;

public class Actions {
    actualLibrary actualLibrary = new actualLibrary();
        Scanner scanner = new Scanner(System.in);
        public void start(){
            this.showOptions();
            this.handleUserChoice();
        }
    private void showOptions(){
        System.out.println("" +
                "Welcome to the Library" +
                "\n 1. Add a book" +
                "\n 2. View book list" +
                "\n 3. View the book" +
                "\n 4. Remove a book" +
                "\n 5. Update book info" +
                "\n 6. Exit"
        );
    }

        private void handleUserChoice(){
            System.out.println("Choose an option: ");
            String userChoice = scanner.nextLine();

            switch (userChoice){
                case "1":
                    actualLibrary.addBookToLibrary();
                    break;
                case "2":
                    //library.actualLibrary.
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


    }


