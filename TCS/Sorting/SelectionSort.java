package TCS.Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sorting(int arr[]){

        for(int i=0; i<=arr.length-1; i++){
            //Declare Minimum as first element
            int min =i;

            //Second Loop For comapre
            for(int j=i+1; j<arr.length; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            //Swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int arr []={6,4,8,7,96};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
