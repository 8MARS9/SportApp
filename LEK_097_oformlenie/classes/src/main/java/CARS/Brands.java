package CARS;

public class Brands extends Car {

    public String location;

    public Brands(String name, int year) {
        super(name, year);
    }

    @Override
    public String repair() {
        if(year == 2018) { return "I can stay home today"; }
        if(year >= 2018) { return "I want to win in " + location; }
        return "too old, can't go faster, I am of" + year;
    }

    @Override
    public String goTo(String location) {
        return "I am tired, I go to " + location;
    }

}
