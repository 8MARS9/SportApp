package sampleclass.productSamples;

public class Electronic extends Product {
    private Double voltage;

    private String screenSize;

    public Electronic(String name, Integer price, int quantity, Double voltage, String screenSize) {

        super(name, price, quantity);

        this.voltage = voltage;
        this.screenSize = screenSize;
    }


    public Double getVoltage(){
        return voltage;
    }

    //encapsulation
    public String getScreenSize() {
        return screenSize;
    }





    @Override
    public String getDiscount() {
        return "discount for this electronic will be " + (price / 10);
    }

    @Override
    public String toString() {
        return "Electronic{" +
                "voltage=" + voltage +
                ", screenSize='" + screenSize + this.weight +
                '}';
    }
}