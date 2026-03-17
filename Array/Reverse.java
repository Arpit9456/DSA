public class Reverse {
    public static void  Isreverse(int[] arr){
        int n=arr.length;
        int last=0;
        int first=n-1;
        while(last<first){
            int temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
            last++;
            first--;

        }
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,4,8,6};
        Isreverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }
        System.out.println("");
        
    }
}
