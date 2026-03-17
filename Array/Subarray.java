public class Subarray {
    public static void Issub(int arr[]){
               for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println("");
                             }
                System.out.println("");
            }
            System.out.println("");

        }          
    
    public static void main(String[] args) {
        int arr[]={2,5,4,7,8,9};
        Issub(arr);
    }
}
