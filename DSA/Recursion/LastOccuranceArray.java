package DSA.Recursion;

public class LastOccuranceArray {
    //WAF TO find last Occurence Of An Element In An Array
    
    public static int lastKeyFound(int arr[], int key, int i){
        //Base Case
        if(i ==arr.length){
            return -1;
        }

        //Recursion Function
       int isFound=  lastKeyFound(arr, key, i+1);
       if(isFound == -1 && arr[i] == key){
        return i;
       }
       return isFound;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,8,1,2,3,6,7,8};
        System.out.println(lastKeyFound(arr, 8, 0));
    }
    }


//www.github.com/pratiktikande
//@Pratik Tikande