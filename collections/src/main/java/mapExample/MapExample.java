package mapExample;

import model.Product;
import model.Student;

import java.util.*;

public class MapExample {

    public void firstExampleHashMap(){
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Zino", 45);
        studentScores.put("Oksana", 99);
        studentScores.put("Laura", 405);
        studentScores.put("Anastasija", 845);
        studentScores.put("Valda", 345);
        studentScores.put("Marina", 15);

        System.out.println(studentScores.get("Laura"));

    }
    public void secondExampleHashMap(){
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Zino", 45);
        studentScores.put("Oksana", 99);
        //add

        System.out.println(studentScores.get("Oksana"));
        //delete
        studentScores.remove("Zino");
        //update
        studentScores.put("Oksana", 6467);

        System.out.println(studentScores);

    }

    public void thirdExampleHashMap(){
        Map<UUID, Student> studentScores = new HashMap<>();

        Student student1 = new Student("Zino", 11);
        Student student2 = new Student("Monta", 524);
        Student student3 = new Student("Laura", 777);

        studentScores.put(UUID.randomUUID(), student1);
        studentScores.put(UUID.randomUUID(), student2);
        studentScores.put(UUID.randomUUID(), student3);

        System.out.println(studentScores);

        System.out.println(studentScores.keySet());// gives you  all values as collection i.e. list in this case UUID list
        System.out.println(studentScores.values()); // gives you  all values as collection i.e. list in this case student list
        System.out.println(studentScores.entrySet());
    }

    public void fourthExampleTreeMap(){
        System.out.println("=== Fourth example using tree map ===");
        Map<Integer, String> students = new TreeMap<>();

        students.put(3,"Zino");
        students.put(4,"Laura");
        students.put(1,"Rasa");
        students.put(5,"Oksana");
        students.put(2,"Valda");

        System.out.println(students);

        students.forEach((key, value) ->System.out.println("Student nr: " + key + "Student name " + value));
    }

    public void fifthExampleUsingLinkedHashMap(){
        Map<UUID, Product> listOfProducts = new LinkedHashMap<>();
        listOfProducts.put(UUID.randomUUID(), new Product("Rice", 30.45));
        listOfProducts.put(UUID.randomUUID(), new Product("Milk", 310.40));
        listOfProducts.put(UUID.randomUUID(), new Product("Juice", 3.15));
        listOfProducts.put(UUID.randomUUID(), new Product("Chocolate", 1.45));

        for(Map.Entry<UUID, Product> currentProduct: listOfProducts.entrySet()){
            UUID productKey = currentProduct.getKey();
            Product product = currentProduct.getValue();

            System.out.println("Key / product id: " + currentProduct.getKey() + "Product: " + currentProduct.getValue());
        }
        /*
        for(UUID uuid : listOfProducts.keySet()){
            System.out.println(uuid);
        }
        for (Product product : listOfProducts.values()){
            System.out.println(product);
        }
         */
    }
}
