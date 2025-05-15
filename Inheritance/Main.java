class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    public double getsalry(){
        return salary;
    }

    public String getname(){
        return name;
    }
}

// Manager extends Employee
class Manager extends Employee {
    double bonus;

    // Constructor chaining
    public Manager(String name, double salary, double bonus) {
        super(name, salary); // Calls Employee constructor
        this.bonus = bonus;
    }

    // Overriding method
    @Override
    public void displayDetails() {
        super.displayDetails(); // Calls Employee's method
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + (getsalry() + bonus));
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Manager("Alice", 50000, 10000);
        emp.displayDetails();
    }
}
