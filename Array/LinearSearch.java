

public class LinearSearch {
    public static int isfind(int arr[],int target){
                for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
                       }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,7,8,9,59};
        int target=9;
        int Find=isfind(arr, target);
        System.out.println("This is the key :" +Find);
    }
}