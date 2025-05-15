public class Stringexception{

    public static void check(){
        try{
getval();
        }
        catch(NullPointerException e){
            System.out.println("text is empty");
        }
    }

    public static void getval(){
        String text="";
        if(text.isEmpty()){
       throw new NullPointerException();
        }
        else{
            System.out.print(text.length());
        }
    }
    public static void main(String[] args){
        check();

    }
}