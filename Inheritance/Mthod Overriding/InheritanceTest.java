class Base {
    public void display() {
        System.out.println("Base display");
    }

    public void show() {
        System.out.println("Base show");
        display();
    }
}

class Derived extends Base {
    @Override
    public void display() {
        System.out.println("Derived display");
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
    }
}
