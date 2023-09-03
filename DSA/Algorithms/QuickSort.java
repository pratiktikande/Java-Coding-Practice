package DSA.Algorithms;

public class QuickSort {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ "");
        }
        System.out.println();
    }

    public static void quciksort(int arr[], int si , int ei){
        //recursion function
        //base case
        if(si>=ei){
            return;
        }

        //partition function
        int pIndex= partition(arr , si , ei);
         //To solve left side
         quciksort(arr, si, pIndex-1);
         //To Solve Right Side of the array
         quciksort(arr, pIndex+1, ei);
    }

    public static int partition(int arr[], int si , int ei){
        int pivot = arr[ei];
        //To make space 
        int i= si-1;

        for(int j=si; j<ei; j++){
            if(arr[j]<=pivot){
                //swap the values
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        //To Return The Pivot At correct position
        i++;
        int temp = pivot;
        arr[ei]=arr[i];
        arr[i]= temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,8,2,};
        quciksort(arr, 0, arr.length-1);
        printArr(arr);
    }
}


//www.github.com/pratiktikande
//@Pratik Tikande