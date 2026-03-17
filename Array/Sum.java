public class Sum {
    public static void Issum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum=sum+arr[i];           
        }
        System.out.println("This is the Sum:"+sum);
    }
    public static void main(String[] args) {
        int arr[]={4,5,8,6,9};
        Issum(arr);
    }
}
