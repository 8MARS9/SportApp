package abstractClassExample.humans;

public class Teen extends Human {

    public String favouriteMusic;

    public Teen(String name, int age, String favouriteMusic) {
        super(name, age);
        this.favouriteMusic = favouriteMusic;
    }


    @Override
    public String goTo(String location) {
        if(location.equals("kitchen")){ return "I only do " + favouriteMusic;}
        if(location.equals("school")){ return "I only go  to forthight";}

        return "going to " + location;
    }

    @Override
    public String move() {
        if(age == 16) return "only " + favouriteMusic + "can move me!";
        if(age == 17) return "I move slow!";
        return "moving 50 meters";
    }

    @Override
    public void grow(int food, int water) throws Exception {
        if (food < 3 || water < 2) {
            throw new Exception("I need more!");

        }
        super.grow(food, water);
    }
}
