package Strings;

import java.util.Scanner;

public class MinOcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[126];
        String s = sc.nextLine().toLowerCase();
        s=s.replaceAll("\\s","");
        System.out.println(s);
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]= arr[s.charAt(i)]+1;
        }

        int min=Integer.MAX_VALUE;
        char c=' ';
        for(int i=0;i<s.length();i++){
            if(min>arr[s.charAt(i)]){
                min= arr[s.charAt(i)];
                c=s.charAt(i);
            }
        }
        System.out.println("Min Occuring Character in a String is: "+ c);
    }
}
