package localClassExample;

import InnerClassExample.User;
import InnerClassExample.User.Supervisor;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        User.Manager manager = user.new Manager("Ana", 60_000_000d);
        System.out.println("Manager salary is " + manager.getSalary());


        User.Customer customer = user.new Customer();
        customer.name = "James";

        Supervisor supervisor = new Supervisor();
        supervisor.name = "Zino";

        sendMoney sendMoney = new sendMoney();

        sendMoney.sendByCard(123.34, 223333L, 555, "02/24");
    }
}
