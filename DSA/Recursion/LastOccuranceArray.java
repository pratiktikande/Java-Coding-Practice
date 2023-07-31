package DSA.Recursion;

public class LastOccuranceArray {
    //WAF TO find last Occurence Of An Element In An Array
    
    public static int LastKeyFound(int arr[], int key, int i){
        if(i ==arr.length){
            return -1;
        }
       int isFound=  LastKeyFound(arr, key, i+1);
       if(isFound == -1 && arr[i] == key){
        return i;
       }
       return isFound;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,8,1,2,3,6,7,8};
        System.out.println(LastKeyFound(arr, 8, 0));
    }
    }

