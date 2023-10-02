package TCS.Others;

public class LinearSearch {

    public static int search(int arr[],int key){
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,8,9,6,7,5};
        int result = search(arr, 7);
        if (result == -1){
            System.out.println("Key Not Found");
        }else{
            System.out.println("Key found at Index  " + result);
        }
    }
}