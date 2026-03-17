public class Islargest {
    public static int isLarge(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i]; // this means update the number
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,9,8,7};
        int largest = isLarge(arr);
        System.out.println("Largest: " + largest);
    }
}
