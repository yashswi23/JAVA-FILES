
import java.util.*;
abstract class Shape{
   abstract public void calculateArea();
}
class Circle extends Shape{
    public double radius;
    Circle(double rad){
        this.radius = rad;
    }
    @Override public void calculateArea(){
        double area = 3.14*radius*radius;
        System.out.println("Area of the Circle is: "+ area);
    }

}

class Rectangle extends Shape{
    public double length;
    public double breadth;
    Rectangle(double len,double bread){
        this.length = len;
        this.breadth= bread;
    }

    @Override public void calculateArea(){
        double area;
        area = length+breadth;
        System.out.println("Area of the Rectangle is: "+ area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();

        Shape cir = new Circle(radius);
        cir.calculateArea();

        System.out.println("Enter the Length and Breadth for Area of Rectangle");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        Shape rec = new Rectangle(length, breadth);
        rec.calculateArea();
        
    }
    
}
