package queueExample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class DeQueExample {
    //FIFO
    //LIFO

    public void exampleDeQue(){
        Deque<String> cars = new ArrayDeque<>();
        cars.offer("Nissan");
        cars.offer("BMW");
        cars.addFirst("Toyota");
        cars.addFirst("Porshe");
        cars.addLast("Mazda");
        cars.offer("Volvo");
        cars.addFirst("Ferrari");
        cars.offer("Audi");

        System.out.println(cars);

        System.out.println(cars.pollFirst()); //removes items
        System.out.println(cars.pollLast());

        //will preview items
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

        cars.poll();
        cars.pollLast();
        cars.pollFirst();

        System.out.println(cars);

        try{
            cars.remove();
            cars.removeLast();
            cars.removeFirst();
        }catch(NoSuchElementException exception){
            exception.printStackTrace();
        }

        System.out.println(cars);
    }
}
