import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();
        int key = sc.nextInt();
        int[] arr = new int[ele];
        for(int i=0;i<ele;i++){
            arr[i] = sc.nextInt();
        if(arr[i] == key){
            System.out.println("Element Found");
        }
        }
       
                System.out.println("Element not Found");
    }
}