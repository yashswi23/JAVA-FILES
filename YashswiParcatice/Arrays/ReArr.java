import java.util.Arrays;

public class ReArr{
    public static void rearrange(int[] arr){
        int i=0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]%2==0){
                i++;
            }
            else if(arr[j]%2!=0){
            j--;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        rearrange(arr);
        System.out.println(Arrays.toString(arr));
    }
}