//Join method Works t1.join() = Main method jismien iska object bna hai woh wait krega jb tak t1 execute na ho jaye
import java.util.*;
class MyThread extends Thread{
    @Override
        public void run(){
            try{
                Thread.sleep(5000);

            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
}
public class Join {
    public static void main(String[] args) throws InterruptedException{
        MyThread th = new MyThread(); MyThread t2 = new MyThread();
        System.out.println(th.getState());
        th.start();
        th.join();
        System.out.println("Hello");
    }
}
