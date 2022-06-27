package composition;

import composition.pet.Example.Owner;
import composition.pet.Example.Pet;
import composition.shop.Shop;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Shop miniMart = new Shop();
        String result = miniMart.addProduct();


        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, miniMart.addProduct());

        result = miniMart.sellProduct();
        JOptionPane.showMessageDialog(null, result);
        JOptionPane.showMessageDialog(null, miniMart.sellProduct());

        JOptionPane.showMessageDialog(null, miniMart.getProducts());

        /*Pet pet = new Pet("Isabella",3);
        Owner owner = new Owner("Zino","Tallinn", pet);

        System.out.println(owner.sayHello());
        System.out.println(owner.walkPet());
        System.out.println(owner.walkPet());
        System.out.println(owner.walkPet());
        System.out.println(owner.walkPet());
        System.out.println(owner.feedPet());
        System.out.println(owner.feedPet());
        System.out.println(owner.feedPet());
        System.out.println(owner.walkPet());
        System.out.println(owner.walkPet());*/


    }
}
