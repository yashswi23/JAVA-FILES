// class Shallow{
//     String city;

//     Shallow(String city){
//         this.city = city;
//     }
// }


// class Person implements Cloneable{
//     String name;
//     Shallow shallow;
//     Person(String name, Shallow shallow){
//         this.name = name;
//         this.shallow = shallow;
//     }


//     //object class method 
//     protected Object clone() throws CloneNetSupportedException{
//         return super.clone(); // will create a shallow copy of  an object 
//     }
// }

// public class Main{
//     public static void main(String[] args) throws CloneNetSupportedException{
//         Shallow obj = new Shallow("Fazilka");

//         Person p1= new Person("Yashswi",obj);

//         Person p2 = (Person) p1.clone(); // create a shallow copy of p1 object

//         p2.shallow.city = "Rajpura";

//         System.out.println(p2.shallow.city);
//     }
// }

