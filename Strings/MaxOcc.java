package Strings;
import java.util.*;
public class MaxOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        s=s.toLowerCase();
        s=s.replaceAll("\\s","");
        System.out.println(s);
        int[] arr = new int[126];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]= arr[s.charAt(i)]+1;
        }

        int max=-1;
        char c=' ';
        for(int i=0;i<s.length();i++){
            if(max< arr[s.charAt(i)]){
                max= arr[s.charAt(i)];
                c=s.charAt(i);
            }
        }
        System.out.println("Max Occuring Character in String is: "+c);
    }
}
