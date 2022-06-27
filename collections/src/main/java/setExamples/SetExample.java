package setExamples;

import model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    /* there main types
     * HashSet
     * * TreeSet
     * * LinkedHashSet
     */

    public void exampleHashSet() {
        HashSet<String> studentNames = new HashSet<>();

        if (studentNames.isEmpty()) {


            System.out.println("Please add student names");
        }

        studentNames.add("Zino");
        studentNames.add("Zino");
        studentNames.add("Oksana");
        studentNames.add("Anastasija");
        studentNames.add("Oksana");
        studentNames.add("Anastasija");
        studentNames.add("Valda");

        if (studentNames.contains("Zino")) {
            System.out.println("Zino is found");
        }

        System.out.println(studentNames);

        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
    }

    public void exampleHashSetCustomType() {
        HashSet<Student> students = new HashSet<>();

        //show equal method example


        students.add(new Student("Zino", 5));
        students.add(new Student("Laura", 6));
        students.add(new Student("Oksana", 4));
        students.add(new Student("Valda", 2));

        System.out.println(students);

        for (Student student : students) {
            System.out.println(student.getName());
            doSomethingMore(student);

            try {
                doSomethingWithException(student);

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    private void doSomethingWithException(Student student) throws Exception {

    }

    private void doSomethingMore(Student student) {
    }

    public void exampleTreeSet() {
        TreeSet<String> studentNames = new TreeSet<>();

        studentNames.add("Zino");
        studentNames.add("Zino");
        studentNames.add("Monta");
        studentNames.add("Rasa");
        studentNames.add("Rasa");
        studentNames.add("Olga");

        System.out.println("Example with primitive types e.g. string, integer, double");
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
        System.out.println("Example using custom object eg Student");

        TreeSet<Student> students = new TreeSet<>();
        students.add(new Student("Zino", 34));
        students.add(new Student("Rasa", 99));
        students.add(new Student("Laura", 120));
        students.add(new Student("Oksana", 150));


        students.forEach(System.out::println);
        System.out.println(students.descendingSet());
        System.out.println(students.contains(new Student("Zino", 34)));
        System.out.println(students.contains(new Student("Zino", 34434)));
        System.out.println(students.first());
        System.out.println(students.last());
        System.out.println(students.remove(new Student("Oksana", 150)));

        students.forEach(System.out::println);

    }

    public void exampleLinkedHashSet(){
        Set<String> studentNames = new LinkedHashSet<>();

        studentNames.add("Rasa");
        studentNames.add("Rasa");
        studentNames.add("Laura");
        studentNames.add("Zino");
        studentNames.add("Marina");

        studentNames.forEach(System.out::println);
    }
}
