class Sharedobj{
    private volatile boolean flag = false;
    public void setFlag(){
        System.out.println("Write Thread make this thread true");
        flag = true;
        // System.out.println("Write Thread make this thread true");
    }

    public void setIfTrue(){
        while(!flag){
        }
        System.out.println("Flag is true! ");
    }
}
public class VolatileExample {
    public static void main(String[] args) {
        Sharedobj shobj = new Sharedobj();
        Thread writeTh = new Thread(()->{
            try{
            Thread.sleep(100);
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            shobj.setFlag();
        });

        Thread rgtth = new Thread(()->{
            shobj.setIfTrue();
        });
        writeTh.start();
        rgtth.start();
    }
}
