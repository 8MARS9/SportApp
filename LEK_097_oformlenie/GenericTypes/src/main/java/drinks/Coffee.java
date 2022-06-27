package drinks;

public class Coffee {

    private double milkMeasurement;
    private double coffeeBeanMeasurement;
    private double sugarMeasurement;

    public Coffee(double milkMeasurement, double coffeeBeanMeasurement, double sugarMeasurement) {
        this.milkMeasurement = milkMeasurement;
        this.coffeeBeanMeasurement = coffeeBeanMeasurement;
        this.sugarMeasurement = sugarMeasurement;
    }

    @Override
    public String toString() {
        return "Coffee, with " +
                coffeeBeanMeasurement + "1kg of coffee beans " +
                "and " + milkMeasurement + "kg of milk " +
                "and " + sugarMeasurement + "kg of sugar" +
                " and extra dark!";


    }
}
