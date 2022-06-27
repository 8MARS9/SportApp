/*package com.example.petsimulator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Pet pet = new Pet("Bella", "Cat", 4);

                System.out.println(pet.introduce());

                System.out.println(pet.feed()); // 4.1
                System.out.println(pet.nextDay());

                System.out.println(pet.feed()); // 4.2
                System.out.println(pet.nextDay());

                System.out.println(pet.feed()); // 4.3
                System.out.println(pet.feed()); // 4.55


                System.out.println(pet.nextDay());

                System.out.println(pet.feed()); // 4.65
                System.out.println(pet.feed()); // 4.9
                System.out.println(pet.feed()); // 5.15

                System.out.println(pet.getWeight());

        System.out.println("Hello there!, now you can interact with me. Please Choose an option below");
        String option = "";

        while(!option.equals("5")){
            System.out.println(
                            "1 Who Am I \n" +
                            "2 Say Hello \n" +
                            "3 Feed Me \n" +
                            "4 Check My Weight \n" +
                            "5 Say Good bye \n"
            );
            Scanner scanner;
            option = scanner.nextLine();

            switch (option){
                case "1":
                    pet.introduce();
                    break;
                case "2":
                    pet.sayHello();
                    break;
                case "3":
                    pet.feed();
                    break;
                case "4":
                    pet.getWeight();
                    break;
                case "5":
                    System.exit(1);
                    break;
                default:
                    System.out.println("I dont understand you try again!");
            }
        }


    }
}
*/