package TCS.ARRAYS;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int elementToAdd = 6;

        // Create new array with a larger size
        int newSize = originalArray.length + 1;
        int[] newArray = new int[newSize];

        // Copy elements from the original array to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }

        // Add the new element at the end of the new array
        newArray[newSize - 1] = elementToAdd;

        // Update the reference to the new array
        originalArray = newArray;

        // Printing the updated array
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
    }
}
