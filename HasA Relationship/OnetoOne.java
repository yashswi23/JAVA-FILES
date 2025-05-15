class Employee{
    int rollno;
    String name;
    Address add;

    Employee(int roll, String n, Address add1){
        this.rollno = roll;
        this.name = n;
        this.add = add1;
    }

    void displayDetails(){
        System.out.println("Rollno of the Student is: "+ rollno);
        System.out.println("Name of the Student is: "+name);
        System.out.println("Location of the Student is : "+ add.location);
        System.out.println("City of the Student is: "+ add.city);
        System.out.println("State of the Student is: "+ add.state);
    }
}

class Address {
    String location;
    String city;
    String state;

    Address(String loc, String city, String state){
        this.location = loc;
        this.city = city;
        this.state = state;
    }
}



public class OnetoOne {
    public static void main(String[] args){

        Address add = new Address("Malkana Mohalla","Fazilka", "Punjab");
        Employee emp = new Employee(101,"Yashswi", add);
        emp.displayDetails();

        Address add2 = new Address("Chitkara University", "Rajpura", "Punjab");
        Employee emp2 = new Employee(102, "Aman", add2);
        emp2.displayDetails();


    }
}
