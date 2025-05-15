import java.util.*;

public class Multiply{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        int[][]one = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                one[i][j] = sc.nextInt();
            }
        }

        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][]two = new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                two[i][j] = sc.nextInt();
            }
        }

        if(c1!=r2){
            System.out.println("Invalid Input");
            return ;
        }
        int[][]product = new int[r1][c2];

        for(int i=0;i<product.length;i++){
            for(int j=0;j<product[i].length;j++){
                for(int k=0;k<c1;k++){
                    product[i][j]+= one[i][k]*two[k][j];
                }
            }
        }

        for(int i=0;i<product.length;i++){
            for(int j=0;j<product[i].length;j++){
                System.out.print(product[i][j]+" ");
            }
            System.out.println();
        }


    }
}