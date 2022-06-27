package abstractClassExample.humans;

public class Baby extends Human {

    public Baby(String name, int age) {
        super(name, age);
    }

    @Override
    public String move() {
        return "Crawling away!!!";
    }

    @Override
    public String goTo(String location) {
        if (!location.equals("sleep")) return "Baby doesn't do " + location;

            return "Baby is going to " + location;

    }
}
