import java.util.Scanner;

public class Jagged{
    static Scanner sc = new Scanner(System.in);
    public static void handle1DArr(){
        int size = sc.nextInt();
        int []arr = new int[size];

        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }

        display1darr(arr);
    }

    public static void display1darr(int[]arr){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void handle2dArr(){
        int row = sc.nextInt();
        int col= sc.nextInt();

        int[][] matrix = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        display2darr(matrix);
    }

    public static void display2darr(int[][]matrix){
        for(int[]row: matrix){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void handleJagged(){
        int rows = sc.nextInt();
        int[][]arr  = new int[rows][];

        for(int i=0;i<rows;i++){
            int cols= sc.nextInt();

            arr[i] = new int[cols];


            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }


        displayjagged(arr);
    }

    public static void displayjagged(int[][]arr){

        for(int[]row: arr){
            for(int ele : row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
        while (true) {
            System.out.println("\nArray Operations Menu:");
            System.out.println("1. Work with 1-D array");
            System.out.println("2. Work with 2-D array");
            System.out.println("3. Work with Jagged Array");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    handle1DArr();
                    break;
                case 2:
                    handle2dArr();
                    break;
                case 3:
                    handleJagged();
                    break;
                case 4:
                    System.out.println("Exiting Program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}