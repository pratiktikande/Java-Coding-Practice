package November;

public class Accenture {
    //21 July 2023
    //Slot No 4 problem
    public static void main(String[] args) {
        int[] arr = {1, -2, 5, 2, -7, 4, -1, 3};

        int n = arr.length;
        int i = -1;
        
        for (int j = 0; j < n; j++) {
            if (arr[j] < 0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

