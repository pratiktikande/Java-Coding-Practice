package TCS.ARRAYS;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};
        int maxElement = 100; 
        int[] frequencyArray = new int[maxElement + 1];

        for (int element : array) {
            frequencyArray[element]++;
        }
        
        for (int i = 1; i <= maxElement; i++) {
            if (frequencyArray[i] > 0) {
                System.out.println("Element: " + i + ", Frequency: " + frequencyArray[i]);
            }
        }
    }
}
