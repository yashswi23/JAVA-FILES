public class ThrowExample{

    public static void check(){
        try{
            getvalue();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Out of Bound");
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide number with 0");
        }


    }

    public static void getvalue(){
     int arr[] = {3,4,5};
     int x = 100;
     int y = 0;

     int index=2;
     if(index > arr.length){
        throw new ArrayIndexOutOfBoundsException();
     }   
     else{
        System.out.println(arr[index]);
     }

     if(x==0 && y==0){
        throw new ArithmeticException();
     }
     else{
        System.out.println(x/y);
     }

    }

    public static void main(String[] args){
        check();
       
    }
}