import java.util.*;
import java.lang.*;
import java.io.*;

class SumofSquare{

    public static int even(int n) {
    if(n==1){
        return 1;
    }
    
    return n*n+even(n-1);
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ans = even(n); // Call the even method with the input number
        System.out.println(ans);
    }
}
