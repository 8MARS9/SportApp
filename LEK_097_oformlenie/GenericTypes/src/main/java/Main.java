import drinks.Coffee;
import drinks.Tea;
import holders.Cup;

public class Main {
    public static void main(String[] args) {
        Tea greenTea = new Tea();
        Tea purpleTea = new Tea();
        Tea redTea = new Tea();

        Cup<Tea> teaCup = new Cup<>(greenTea);
        Cup<Tea> teaCup2 = new Cup<>(purpleTea);
        Cup<Tea> teaCup3 = new Cup<>(redTea);

        teaCup.takeASip();
        teaCup2.takeASip();
        teaCup3.takeASip();

        Coffee greenCoffee = new Coffee(3.5d, 56.4, 2.2);
        Coffee purpleCoffee = new Coffee(3.5d, 56.4, 2.2);
        Coffee redCoffee = new Coffee(3.5d, 56.4, 2.2);

        Cup<Coffee> coffeeCup1 = new Cup<>(greenCoffee);
        Cup<Coffee> coffeeCup2 = new Cup<>(purpleCoffee);
        Cup<Coffee> coffeeCup3 = new Cup<>(redCoffee);

        coffeeCup1.takeASip();
        coffeeCup2.takeASip();
        coffeeCup3.takeASip();

    }
}
