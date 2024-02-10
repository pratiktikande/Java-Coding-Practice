package New_folder;

public class LargestArray {
    public static int getlargest(int arr[]){
        int lagest=Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(lagest < arr[i]){
                lagest= arr[i];
            }
        }
        return lagest;
    }

    public static void main(String[] args) {
     int arr[]={4,8,9,6,3};   
     System.out.println(getlargest(arr));
    }
}
