package abstractClassExample;

import abstractClassExample.humans.Adult;
import abstractClassExample.humans.Baby;
import abstractClassExample.humans.Human;
import abstractClassExample.humans.Teen;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        Baby baby = new Baby("John", 1);

        System.out.println(baby.move());
        System.out.println(baby.goTo("Market"));
        System.out.println(baby.goTo("Sleep"));
        System.out.println(baby.getName());

        try {
            baby.grow(2, 4);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(baby.getAge());

        Teen teen = new Teen("Bob", 15, "Rock");

        try {
            System.out.println(teen.move());
            teen.grow(5, 6);
            System.out.println(teen.move());
            teen.grow(5, 6);
            System.out.println(teen.move());
            teen.grow(5, 6);
            System.out.println(teen.move());

            teen.grow(2,2);
        }catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println(teen.getAge());

        System.out.println(teen.goTo("kitchen"));
        System.out.println(teen.goTo("school"));
        System.out.println(teen.goTo("party"));

        Adult adult = new Adult("Zee", 68);

        System.out.println(adult.move());

        try{
            adult.grow(6,6);
            adult.grow(6,6);
            adult.grow(6,6);
            adult.grow(6,4);
            adult.grow(6,4);
            adult.grow(6,4);
            adult.grow(6,4);

        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println(adult.move());

        ArrayList<Human> humans = new ArrayList<>();

        humans.add(adult);
        humans.add(teen);
        humans.add(baby);

        System.out.println("Calling same method for different implementation");
        //humans.forEach(human -> Soundbank(human.move()));

    }
}
