package DSA.Recursion;

public class FirstOccurenceArray {
    //WAF TO find First Occurence Of An Element In An Array

    public static int keyfound(int arr[], int key , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]== key ){
            return i; 
        }
        return keyfound(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[]={4,2,5,8,7,9,63,4,7,6};
        System.out.println(keyfound(arr, 7, 0));
    }
}
