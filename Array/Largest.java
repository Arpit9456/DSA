package  Array;
import java.util.Arrays;

public class Largest {
    // public static int LargestNumber(int arr[],int n){
    //     return 0;
    // }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,5};
        int n=arr.length;
        Arrays.sort(arr);
        System.out.println("This is the largest element: "+arr[n-1]);
    }

}