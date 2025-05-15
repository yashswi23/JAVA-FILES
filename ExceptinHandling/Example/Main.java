public class Main{
public static void m1(){
    try{
    m2();
    }
    catch(Exception e){
        System.out.println("You cannot divide this number with zero");
    }

}
public static void m2(){
    m3();
}

public static void m3(){
    
    int x = 100/0;
    
}
    public static void main(String[] args){

        m1();
    }
}
