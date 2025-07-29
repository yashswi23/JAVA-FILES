import java.util.*;
class MyThread extends Thread{
    @Override
        public void run(){
            System.out.println("RUNNING");

            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
}


public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyThread th = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println(th.getState());
        th.start();
        t2.start();
        System.out.println(th.getState());
        System.out.println(t2.getState());
        th.sleep(100);
         System.out.println(th.getState());
         t2.sleep(100);
          System.out.println(t2.getState());


         th.join();
         t2.join();
         System.out.println( "t1 is terminated"+ th.getState());
          System.out.println( "t2 is terminated"+ t2.getState());
         



    }
}
