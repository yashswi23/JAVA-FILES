import java.util.*;

public class Tail{
    // static void displayTail(int start, int n){
    //     if(start<n){
    //         return ;
    //     }

    //     System.out.println(start+" ");

    //     displayTail(start-1,n);
    // }
    // public static void main(String[] args){
    //     int  n=5;
    //     System.out.println("Display "+n +  " to  1 using Tail Recusrion");

    //     displayTail(n,1);
    // }
     static void displayTail(int n, int result){
        if(n==0){
            System.out.println("Result: "+ result);
            return ;
        }
        displayTail(n-1,n*result);
    }
    public static void main(String[] args){
        int  n=5;
        System.out.println("Calculating Factorial of n: ");

        displayTail(n,1);
    }
}