package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static boolean checkana(String s1, String s2){
        char[]a = s1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[]b=s2.replaceAll("\\s","").toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean ans =checkana(s1,s2);
    System.out.println(ans);
    }
}
