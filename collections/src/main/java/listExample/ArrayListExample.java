package listExample;

import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
    public void firstExampleStringItems(){
        // Collections class provides more methods for manipulating, accessing and working
        List<String> products = new ArrayList<>();

        products.add("Rice");
        products.add("Bread");
        products.add("Milk");
        products.add("Milk");
        products.add("Milk");
        products.add("Soap");

        System.out.println(products);

        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product("rice", 300.40));
        productList.add(new Product("milk", 142.40));
        productList.add(new Product("rice", 30.35));
        productList.add(new Product("book", 10.11));
        productList.add(new Product("phone", 1110.23));

        for (Product currentProduct: productList){
            System.out.println(currentProduct.getName() + " - " + currentProduct.getPrice());
        }
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                if(product1.getPrice() == product2.getPrice()) return 0;
                return product1.getPrice() > product2.getPrice() ? -1 : 1;
            }
        });
        System.out.println("=== Sorted product ===");
        productList.forEach(System.out::println);
        Collections.reverse(products);
        productList.forEach(System.out::println);
    }
}
