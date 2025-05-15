import java.util.*;
public class Wave{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][]one = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                one[i][j] = sc.nextInt();
            }
        }

        for(int j=0;j<one[0].length;j++){
            if(j%2==0){
                for(int i=0;i<one.length;i++){
                    System.out.print(one[i][j]+" ");
                }
                System.out.println();
            }
            else {
                for(int i=one.length-1;i>=0;i--){
                    System.out.print(one[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}