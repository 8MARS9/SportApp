package abstractClassExample.humans;

public class Adult extends Human {
    public Adult(String name, int age) {
        super(name, age);
    }

    @Override
    public void grow(int food, int water) throws Exception {
        if (food > 3 || water > 3) age +=3;

        if(age > 90) throw new Exception ("Too old to grow old!");

        age ++;
    }

    @Override
    public String move() {
        if(age > 70) return "moving 1 meter";
        return "moving 10 meters";
    }

    @Override
    public String goTo(String location) {
        return "Going to " + location;
    }
}
