import java.util.*;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        while(true){
        System.out.println("Enter a  number: ");
        try{
            
            num =sc.nextInt();
            break;
            
        }

        catch(InputMismatchException e){
            System.out.println("Please Enter a number in Digit");
            sc.next();
            
        }
    }

        System.out.println(num);



    }
}
