class A {
    void run() {
        for (int i = 0; i < 3; i++) {
            class B {
                static int counter = 0;

                B() {
                    System.out.println(counter);
                    counter++;
                }

                void display() {
                    System.out.println("this belongs to B class");
                }
            }
            B obj = new B();
            obj.display();
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        A obj = new A();
        obj.run();
    }
}