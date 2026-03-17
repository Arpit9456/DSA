

public class IsBinary {
    public static int Binar(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {    
        int mid=(start+end)/2;
        if(arr[mid]==target){//found
            return mid;
        }
        else if(arr[mid]<target){//right
            start=mid+1;
        }
        else{//left
            end=mid-1;
        }
    }
        return -1;
}
    public static void main(String[] args) {
        int arr[]={1,2,5,6,9,88,89,99};
        int target=2;
        int answer=Binar(arr, target);
        System.out.println(" index for the key is:"+answer);

    }
}
