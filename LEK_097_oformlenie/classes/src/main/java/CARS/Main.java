package CARS;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Brands brands = new Brands("Ferrari", 2018);

        System.out.println(brands.repair());
        System.out.println(brands.goTo("race"));
        System.out.println(brands.getName());

        try {
            brands.fuelConsumption("Ferrari", 2020);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(brands.getYear());



        ArrayList<Car> humans = new ArrayList<>();



    }
}
