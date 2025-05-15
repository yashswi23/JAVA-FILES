class Person implements Cloneable{ // cloneable is the Interface here
    String name;
    Person(String name){
        this.name = name;
    }

    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class Main{
public static void main(String[] args) throws CloneNotSupportedException{
    Person p1 = new Person("Yashswi");
    Person p2 = (Person) p1.clone();

    System.out.println(p1.name);
    System.out.println(p2.name);
    p2.name= "Aman";
    System.out.println(p2.name);
    System.out.println(p1.name);
}
}