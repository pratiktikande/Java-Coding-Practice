package New_folder;

public class ReverseArr {
    public static void reverseArray(int arr[]){
        int start=0; int last=arr.length-1;

        while (start < last) {
            
            //Swap
            int temp=arr[last];
            arr[last]=arr[start];
            arr[start]=temp;

            start++;
            last--;
            
        }

    }
    public static void main(String[] args) {
        int arr[]={2,4,8,10,12};
        reverseArray(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
