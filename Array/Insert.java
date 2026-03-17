

public class Insert {
    public static void Isinsert(int arr[],int index,int element){ 
        for(int i=0;i<arr.length;i++){
            if(i==index){
                arr[i]=element;
                // System.out.println("index"+i);
            }
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[]={10,25,36,1,48,2,5};
        int index=4;
        int element=9;
        Isinsert(arr, index, element);   
    }
}
