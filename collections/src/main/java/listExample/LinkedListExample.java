package listExample;

import java.util.LinkedList;

public class LinkedListExample {
    public void example1(){
        LinkedList<String> students = new LinkedList<>();

        students.add("Zino");
        students.add(0, "Laura");
        students.add("Olga");
        students.add("Zino");
        students.add(2, "Marina");
        students.add("Zane");

        System.out.println("Linked List Example");
        System.out.println(students);
    }
}
