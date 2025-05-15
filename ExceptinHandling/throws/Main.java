


public class Main{

    public static void check(){
        try{
            getvalue();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is Out of Bound");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide with zero");
        }
    }

    public static void getvalue() throws ArrayIndexOutOfBoundsException, ArithmeticException {
        int arr[] = {1,2,3};
        int index =0;
        int x=100;
        int y =0;

        System.out.println(arr[index]);
        System.out.println(x/y);
    }
    public static void main(String[] args){
        check();
    }
}