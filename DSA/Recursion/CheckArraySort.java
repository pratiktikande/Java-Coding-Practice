package DSA.Recursion;
public class CheckArraySort {

public static boolean isSorted(int arr[], int i)
{
     //base case
    if(i == arr.length-1){
        return true;
    }

    //Recursion 
    if(arr[i] > arr[i+1]){
        return false;
    }
    return isSorted(arr , i+1);
}

public static void main(String[] args) {
    int arr[]={1,2,3,4};
    int arr1[]={2,6,5,7};
    System.out.println(isSorted(arr, 0));
    System.out.println(isSorted(arr1, 0));
}
}

//www.github.com/pratiktikande
//@Pratik Tikande
