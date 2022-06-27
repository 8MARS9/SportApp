package CARS;

public abstract class Car {

        private final String name;
        protected int year;
        protected float fuelConsumption;

        public Car(String name, int year) {
            this.name = name;
            this.year = year;
        }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void fuelConsumption (String name, int year) throws Exception {
        // do stuff
        fuelConsumption ++;
    }

    public abstract String repair();

    public abstract String goTo(String location);
}
