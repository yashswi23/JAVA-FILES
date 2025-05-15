class Person{

    int age;
    String name;

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

}

public class Opps{
    public static void main(String[] args){
      Person person = new Person(); // object creation use keyword person = refrence variable - assign unique id to that class
      // class ke data memebers or objects ko accesskr skte hain
      person.name ="John";
      person.age = 25;
      person.displayInfo();


    }
}


//Priavate nd public Access Control
