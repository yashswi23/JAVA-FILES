import java.util.*;

public class Oneton{

    // static void directRec(int n){
    //     if(n==0){
    //         return ;
    //     }
    //     System.out.println(n+ " ");
    //     directRec(n-1);
    // }
    // public static void main(String[] args){
    //     System.out.println("Direct Rec: ");
    //     directRec(5);
    // }


    static void indirectrec(int n){
         if(n==0){
            return ;
        }
        System.out.println("A: "+ n+ " ");
        indirectrecb(n-1);
    }

    static void indirectrecb(int n){
        if(n==0){
            return ;
        }
        System.out.println("B: "+ n+ " ");
        indirectrec(n-1);
    }
    public static void main(String[] args){
        System.out.println("Indirect Recursion: ");
        indirectrec(5);
    }
}