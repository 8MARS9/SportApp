package InnerClassExample;

public class User {
    public class Manager{
        public String name;
        private Double salary;

        public Manager(String name, Double salary) {
            this.name = name;
            this.salary = salary;
        }
        public Double getSalary() {
            return salary;
        }
    }

    public static class Supervisor { public String name; private double salary;}
    public static class Worker { public String name; private double salary;}
    public class Customer { public String name; private Double budget;}
}
