import java.util.*;

public class Fact{

    public static long fact(int n){
        if(n<=1){
            return 1;
        }

        return n * fact(n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fact of " +  fact(n));
    }
}