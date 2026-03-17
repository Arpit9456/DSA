public class Ispair {
    public static void ispair(int arr[]){
        int tp=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + arr[i]+"," + arr[j]+ ")");
            }
             System.out.println("");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,4,7,8,9,6,4};
            ispair(arr);
    }
}
