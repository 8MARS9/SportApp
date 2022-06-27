package queueExample;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    /* FIFO = First in - first out
    LIFO = Last in - last out
     */

    public void exampleQueue(){
        Queue<String> customers = new LinkedList<>();

        customers.offer("Zino");
        customers.offer("Olga");
        customers.offer("Zane");
        customers.offer("Laura");
        customers.offer("Marina");

        System.out.println(customers);

        attendToCustomer(customers.peek()); // will not remove the customer
        attendToCustomer(customers.poll()); // will remove the customer
        attendToCustomer(customers.poll());
        attendToCustomer(customers.poll());

        System.out.println(customers);

        attendToCustomer(customers.poll());
        attendToCustomer(customers.poll());

        System.out.println("has processed all customers: " + customers.isEmpty());

    }
    private void attendToCustomer(String customer) {
        System.out.println("now processing: " + customer);

    }
}
