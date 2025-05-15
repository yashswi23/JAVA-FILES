 class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
    }
}

// Employee extends Person
class Employee extends Person {
    int employeeID;

    public Employee(String name, int employeeID) {
        super(name);
        this.employeeID = employeeID;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Employee ID: " + employeeID);
    }
}

// Developer extends Employee
class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int employeeID, String programmingLanguage) {
        super(name, employeeID);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Charlie", 101, "Java");
        dev.showInfo();
    }
}

