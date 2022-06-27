package sampleclass.productSamples;

public class Product {
    public String name;
    public Integer price;
    public int quantity;
    private double discount;
    protected float weight;
    //protected // access modifiers
    //static
    //final

    //construct overloading


    public Product() {
        System.out.println("Product creating without values");

    }

    public Product(String name) {
        this.name = name;
        this.price = price;
        System.out.println("Product created with name");
    }

    public Product(int name) {
        System.out.println("Product created with name");
    }



    public Product(String name, Integer price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("Product created with three values");
    }

    public Product(String name, Integer price, int quantity, double discount, float weight) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
        this.weight = weight;
        System.out.println("Product created with all values");
    }

    public String getDiscount() {
        return "discount for product will be " + discount;
    }
    public float getWeight() {
        return weight;
    }

    @Override // annotation
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", weight=" + weight +
                '}';
    }
}
