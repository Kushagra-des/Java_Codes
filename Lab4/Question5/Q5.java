class Employee {
    int salary = 30000;

    void displaySalary() {
        System.out.println("Employee salary: " + salary);
    }
}

class Manager extends Employee {
    int salary = 50000;

    @Override
    void displaySalary() {
        System.out.println("Manager salary: " + salary);
        System.out.println("Employee salary: " + super.salary);
        super.displaySalary();
    }
}

public class Q5 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displaySalary();
    }
}
