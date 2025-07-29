// Java Program to Illustrate Priorities in Multithreading
// via help of getPriority() and setPriority() method
import java.lang.*;

class Priority extends Thread {
    public Priority(String name){
        super(name);
    }

    // run() method for the thread that is called
    // as soon as start() is invoked for thread in main()
    public void run()
    {
        System.out.println(Thread.currentThread().getName()
                           + " is running with priority " 
                           + Thread.currentThread().getPriority());
    }

    // Main driver method
    public static void main(String[] args)
    {
        // Creating random threads
        // with the help of above class
        Priority t1 = new Priority("Thread1");
        Priority t2 = new Priority("Thread2");
        Priority t3 = new Priority("Thread3");

        // Display the priority of above threads
        // using getPriority() method
        System.out.println("t1 thread priority: " + t1.getPriority()); //default sabko 5
        System.out.println("t2 thread priority: " + t2.getPriority()); // default 5
        System.out.println("t3 thread priority: " + t3.getPriority());// default 5

        // Setting priorities of above threads by
        // passing integer arguments
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);

      	// Error will be thrown in this case
        // t3.setPriority(21);

        // Last Execution as the Priority is low
        System.out.println("t1 thread priority: " + t1.getPriority());

        // Will be executed before t1 and after t3
        System.out.println("t2 thread priority: " + t2.getPriority());

        // First Execution as the Priority is High
        System.out.println("t3 thread priority: " + t3.getPriority());


        // Now Let us Demonstrate how it will work
        // According to it's Priority
        t1.start();
        t2.start();
        t3.start();

        // Thread - 0, 1 , 2 signify 1 , 2 , 3
        // respectively
    }
}