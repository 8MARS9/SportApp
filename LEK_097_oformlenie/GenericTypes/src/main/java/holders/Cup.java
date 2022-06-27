package holders;

public class Cup<DrinkType> {
    private DrinkType drink;

    public Cup(DrinkType drink) {
        this.drink = drink;
    }
    public void takeASip(){
        System.out.println("Drinking " + drink);
    }
}
