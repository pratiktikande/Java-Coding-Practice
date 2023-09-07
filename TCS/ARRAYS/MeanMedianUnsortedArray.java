package TCS.ARRAYS;

import java.util.Arrays;

public class MeanMedianUnsortedArray {
    public static void calculateMean(int[] num) {
        int sum = 0;
        int frequency = num.length;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        int mean = sum / frequency;
        System.out.println(mean);
    }

    public static double calculateMedian(int[] num) {
        Arrays.sort(num);
        int length = num.length;
        if (length % 2 == 0) {
            int mid1 = num[length / 2 - 1];
            int mid2 = num[length / 2];
            return (double) (mid1 + mid2) / 2;
        } else {
            return (double) num[length / 2];
        }
    }

    public static void main(String[] args) {
        int[] num = { 2, 5, 6, 3, 4 };
        calculateMean(num);
        System.out.println("Median: " + calculateMedian(num));
    }
}
