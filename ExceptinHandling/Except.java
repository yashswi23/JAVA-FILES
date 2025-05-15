public class Except {
    public static void main(String[] args) {
        try{
            int result= 10/0;
        }

        catch(Exception e){
            System.out.println("you cannot divide this number with 0");

        }
    }
}
